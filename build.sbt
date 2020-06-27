/*
 *     ____  __      __  ____
 *    / __ \/ /___ _/ /_/ __/___  _________ ___
 *   / /_/ / / __ `/ __/ /_/ __ \/ ___/ __ `__ \
 *  / ____/ / /_/ / /_/ __/ /_/ / /  / / / / / /
 * /_/   /_/\__,_/\__/_/  \____/_/  /_/ /_/ /_/ ©
 *
 * (c) Platform Nick Odumo (nodumo@nodumo.com)
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

name := "platform"

organization in ThisBuild := "com.platform"
scalaVersion in ThisBuild := "2.12.3"

// PROJECTS

lazy val global = project
  .in(file("."))
  .settings(settings ++ flyAwaySettings)
  .disablePlugins(AssemblyPlugin)
  .aggregate(
    application,
    common,
    domain,
    bigData,
    infrastructure,
    infrastructureintegrations,
    lambda,
    serverapi,
    servercore,
    serverstaticwebsites
  )
  .enablePlugins(FlywayPlugin)

lazy val application = project
  .settings(
    name := "application",
    settings,
    libraryDependencies := ProjectDependencies.applicationDependencies
  )
  .disablePlugins(AssemblyPlugin)
  .dependsOn(common, domain, infrastructure, infrastructureintegrations)

lazy val common = project
  .settings(
    name := "common",
    settings,
    libraryDependencies := ProjectDependencies.commonDependencies
  )
  .disablePlugins(AssemblyPlugin)

lazy val domain = project
  .settings(
    name := "domain",
    settings,
    libraryDependencies := ProjectDependencies.domainDependencies
  )
  .disablePlugins(AssemblyPlugin)
  .dependsOn(
    common
  )

lazy val bigData = project
  .settings(
    name := "bigData",
    settings,
    assemblySettings
  )
  .dependsOn(
    //common
  )

lazy val infrastructure = project
  .settings(
    name := "infrastructure",
    settings,
    assemblySettings,
    libraryDependencies := ProjectDependencies.infrastructureDependencies
  )
  .dependsOn(
    common,
    domain,
    infrastructureintegrations
  )

lazy val infrastructureintegrations = project
  .settings(
    name := "infrastructureintegrations",
    settings,
    assemblySettings,
    libraryDependencies := ProjectDependencies.infrastructureDependencies
  )
  .dependsOn(
    common
  )

lazy val lambda = project
  .settings(
    name := "lambda",
    settings,
    assemblySettings,
    libraryDependencies := ProjectDependencies.infrastructureDependencies
  )
  .dependsOn(
    common,
    domain,
    infrastructureintegrations
  )

lazy val serverapi = project
  .settings(
    name := "serverapi",
    settings,
    assemblySettings,
    libraryDependencies := ProjectDependencies.serverApiDependencies
  )
  .dependsOn(
    application,
    common,
    servercore
  )
  .enablePlugins(SbtTwirl)

lazy val servercore = project
  .settings(
    name := "servercore",
    settings,
    assemblySettings,
    libraryDependencies := ProjectDependencies.serverCoreDependencies
  )
  .dependsOn(
    application,
    common
  )

lazy val serverstaticwebsites = project
  .settings(
    name := "serverstaticwebsites",
    settings,
    assemblySettings,
    libraryDependencies := ProjectDependencies.serverStaticSitesDependencies
  )
  .dependsOn(
    application,
    common,
    servercore
  )
  .enablePlugins(SbtTwirl)

// SETTINGS

lazy val settings =
commonSettings ++
scalafmtSettings

lazy val commonSettings = Seq(
  // addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0"),
  fork in run := true,
  fork in test := true,
  trapExit := false,
  scalacOptions in Test ++= Seq("-Yrangepos"),
  scalacOptions ++= ProjectCompilerSettings.commonCompilerSettings,
  resolvers ++= Seq(
    "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository",
    Resolver.sonatypeRepo("releases"),
    Resolver.sonatypeRepo("snapshots")
  )
)

lazy val wartremoverSettings = Seq(
  wartremoverWarnings in (Compile, compile) ++= Warts.allBut(Wart.Throw)
)

lazy val scalafmtSettings =
  Seq(
    scalafmtOnCompile := true,
    scalafmtTestOnCompile := true,
    scalafmtVersion := "1.2.0"
  )

lazy val flyAwaySettings =
  Seq(
    flywayUrl := "jdbc:hsqldb:file:target/flyway_sample;shutdown=true",
    flywayUser := "SA",
    flywayPassword := "",
    flywayLocations += "db/migration",
    flywayUrl in Test := "jdbc:hsqldb:file:target/flyway_sample;shutdown=true",
    flywayUser in Test := "SA",
    flywayPassword in Test := ""
  )

lazy val assemblySettings = Seq(
  assemblyJarName in assembly := name.value + ".jar",
  assemblyMergeStrategy in assembly := {
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case "application.conf"            => MergeStrategy.concat
    case x =>
      val oldStrategy = (assemblyMergeStrategy in assembly).value
      oldStrategy(x)
  }
)
