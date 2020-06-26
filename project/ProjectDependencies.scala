import sbt._

object ProjectDependencies {

  // --- scope

  private val SCOPE_TEST = "test"

  // --- Versions

  private lazy val catsVersion = "2.1.1"

  private lazy val catsEffectVersion = "2.1.3"

  private lazy val circeVersion = "0.12.3"

  private lazy val doobieVersion = "0.8.8"

  private lazy val http4sVersion = "0.21.1"

  private lazy val monocleVersion = "1.4.0"

  private lazy val fs2Version = "2.4.0"

  // --- Libraries

  private lazy val catsEffect = "org.typelevel" %% "cats-effect" % catsEffectVersion

  private lazy val catsLib = "org.typelevel" %% "cats-core" % catsVersion

  private lazy val circe = "io.circe" %% "circe-core" % circeVersion

  private lazy val circeGeneric = "io.circe" %% "circe-generic" % circeVersion

  private lazy val circeParser = "io.circe" %% "circe-parser" % circeVersion

  private lazy val doobie = "org.tpolecat" %% "doobie-core" % doobieVersion

  private lazy val delightNashorn = "org.javadelight" % "delight-nashorn-sandbox" % "0.1.28"

  private lazy val doobieHikari = "org.tpolecat" %% "doobie-hikari" % doobieVersion

  private lazy val doobiePostgres = "org.tpolecat" %% "doobie-postgres" % doobieVersion

  private lazy val doobieSpec2 = "org.tpolecat" %% "doobie-specs2" % doobieVersion % SCOPE_TEST

  private lazy val doobieDependencies = Seq(doobie, doobieHikari, doobiePostgres)

  private lazy val fs2Lib = "co.fs2" %% "fs2-core" % fs2Version

  private lazy val fs2LibIO = "co.fs2" %% "fs2-io" % fs2Version

  private lazy val fs2LibDependencies = Seq(fs2Lib, fs2LibIO)

  private lazy val http4sBlazeServer = "org.http4s" %% "http4s-blaze-server" % http4sVersion

  private lazy val http4sCirce = "org.http4s" %% "http4s-circe" % http4sVersion

  private lazy val http4sDSL = "org.http4s" %% "http4s-dsl" % http4sVersion

  private lazy val http4sBlazeClient = "org.http4s" %% "http4s-blaze-client" % http4sVersion % "it,test"

  private lazy val http4sDependencies = Seq(http4sBlazeServer, http4sCirce, http4sDSL, http4sBlazeClient)

  private lazy val jodaScalaLib = "com.github.nscala-time" %% "nscala-time" % "2.24.0"

  private lazy val monocleCore = "com.github.julien-truffaut" %% "monocle-core"   % monocleVersion

  private lazy val monocleMacro   = "com.github.julien-truffaut" %% "monocle-macro" % monocleVersion

  private lazy val monocleMacroDependencies  = Seq(monocleCore, monocleMacro)

  private lazy val shapeless =  "com.chuusai" %% "shapeless" % "2.3.3"

  private lazy val spec2 = "org.specs2" %% "specs2-core" % "4.10.0" % "test"


  // --- Project name

  lazy val PROJECT_ROOT = "."

  lazy val PROJECT_APPLICATION = "application"

  lazy val PROJECT_APPLICATION_SERVER_API = "applicationserverapi"

  lazy val PROJECT_APPLICATION_SERVER_CORE = "applicationservercore"

  lazy val PROJECT_APPLICATION_SERVER_CORE_STATIC_SITES = "applicationserverstaticsites"

  lazy val PROJECT_BIG_DATA = "bigdata"

  lazy val PROJECT_COMMON = "common"

  lazy val PROJECT_DOMAIN = "domain"

  lazy val PROJECT_INFRASTRUCTURE = "infrastructure"

  lazy val PROJECT_LAMBDA = "lambda"

  lazy val PROJECT_ROLE_SYSTEM = "libraryrolesystem"

  // --- Internal configuration

  private lazy val baseDependencies = Seq(spec2)

  lazy val applicationDependencies: Seq[ModuleID] =
    baseDependencies ++ Seq(catsLib, catsEffect, jodaScalaLib)

  lazy val commonDependencies: Seq[ModuleID] =
    baseDependencies ++ Seq(catsLib, jodaScalaLib, shapeless)

  lazy val domainDependencies: Seq[ModuleID] =
    baseDependencies ++  Seq(catsLib, jodaScalaLib) ++ monocleMacroDependencies

  lazy val infrastructureDependencies: Seq[ModuleID] =
    baseDependencies ++ Seq(delightNashorn) ++ doobieDependencies ++ http4sDependencies

  // --- Http server configurations

  lazy val serverCoreDependencies: Seq[ModuleID] =
    baseDependencies ++ Seq(delightNashorn) ++ doobieDependencies ++ http4sDependencies

  lazy val serverApiDependencies: Seq[ModuleID] =
    baseDependencies ++ Seq(delightNashorn) ++ doobieDependencies ++ http4sDependencies

  lazy val serverStaticSitesDependencies: Seq[ModuleID] =
    baseDependencies ++ Seq(delightNashorn) ++ doobieDependencies ++ http4sDependencies


}
