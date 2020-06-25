import ProjectDependencies.scalaSpec2
import sbt._

object ProjectDependencies {

  // --- Versions

  private lazy val circeVersion          = "0.11.0"
  private lazy val configVersion         = "1.3.3"
  private lazy val effVersion            = "5.5.2"
  private lazy val effCatsVersion        = "5.7.0"
  private lazy val http4sVersion         = "0.18.24"
  private lazy val http4sTsecVersion     = "0.0.1-M11"
  private lazy val finchVersion          = "0.26.0"
  private lazy val jwtVersion            = "4.2.0"
  private lazy val scalaLoggingVersion   = "3.7.2"
  private lazy val shapelessVersion      = "2.3.3"
  private lazy val slf4jVersion          = "1.7.25"
  private lazy val typesafeConfigVersion = "1.3.1"
  private lazy val logbackVersion        = "1.2.3"
  private lazy val logstashVersion       = "4.11"
  private lazy val monocleVersion        = "1.4.0"
  private lazy val openNlpVersion        = "1.9.1"
  private lazy val pureconfigV           = "0.8.0"
  private lazy val scalatestVersion      = "3.0.4"
  private lazy val scalacheckV           = "1.13.5"
  private lazy val spec2Version          = "4.6.0"
  private lazy val twitterServerVersion  = "19.2.0"
  private lazy val zVersion              = "7.3.1"
  private lazy val zioVersion            = "1.0.0-RC18-2"
  private lazy val zioCatsInteropVersion = "2.1.3.0-RC15"

  // --- Dependencies

  private lazy val cats                 = "org.typelevel"              % "cats-core_2.12"                  % "1.6.1"
  private lazy val circeGeneric         = "io.circe"                   %% "circe-generic"                  % circeVersion
  private lazy val circeGenericX        = "io.circe"                   %% "circe-generic-extras"           % circeVersion
  private lazy val config               = "com.typesafe"               % "config"                          % configVersion
  private lazy val doobieCore           = "org.tpolecat"               %% "doobie-core"                    % "0.8.6"
  private lazy val doobieCoreH2         = "org.tpolecat"               %% "doobie-h2"                      % "0.8.6" // H2 driver 1.4.200 + type mappings.
  private lazy val delightNashorn       = "org.javadelight"            % "delight-nashorn-sandbox"         % "0.1.28"
  private lazy val doobieCoreHikari     = "org.tpolecat"               %% "doobie-hikari"                  % "0.8.6"
  private lazy val eff                  = " org.atnos"                 %% "eff"                            % effVersion
  private lazy val effCats              = "org.atnos"                  %% "eff-cats-effect"                % effCatsVersion

  private lazy val jwtCore              = "com.pauldijou"              %% "jwt-core"                       % jwtVersion
  private lazy val jwtCirce             = "com.pauldijou"              %% "jwt-circe"                      % jwtVersion
  private lazy val http4SBlazeClient   =  "org.http4s"                 %% "http4s-blaze-client"          % http4sVersion
  private lazy val http4SBlazeServer    = "org.http4s"                 %% "http4s-blaze-server"            % http4sVersion
  private lazy val http4SCirce          = "org.http4s"                 %% "http4s-circe"                   % http4sVersion
  private lazy val http4SDSL            = "org.http4s"                 %% "http4s-dsl"                     % http4sVersion
  private lazy val http4SDSLRho         = "org.http4s"                 %% "rho-swagger"                    % "0.18.0" 
  private lazy val http4sTwirl          = "org.http4s"                 %% "http4s-twirl"                   % http4sVersion
  private lazy val http4sTsec           = "io.github.jmcardon"         %% "tsec-http4s"                    % http4sTsecVersion

  private lazy val finchXCore           = "com.github.finagle"         %% "finchx-core"                    % finchVersion
  private lazy val finchXCirce          = "com.github.finagle"         %% "finchx-circe"                   % finchVersion
  private lazy val jdbcOrient           = "com.orientechnologies"      % "orientdb-jdbc"                   % "3.1.0-M3"
  private lazy val scalaLogging         = "com.typesafe.scala-logging" %% "scala-logging"                  % scalaLoggingVersion
  private lazy val slf4j                = "org.slf4j"                  % "jcl-over-slf4j"                  % slf4jVersion
  private lazy val typesafeConfig       = "com.typesafe"               % "config"                          % typesafeConfigVersion
  private lazy val logback              = "ch.qos.logback"             % "logback-classic"                 % logbackVersion
  private lazy val logstash             = "net.logstash.logback"       % "logstash-logback-encoder"        % logstashVersion
  private lazy val monocleCore          = "com.github.julien-truffaut" %% "monocle-core"                   % monocleVersion
  private lazy val monocleMacro         = "com.github.julien-truffaut" %% "monocle-macro"                  % monocleVersion
  private lazy val openNLP              = "org.apache.opennlp"         % "opennlp-tools"                   % openNlpVersion
  private lazy val pureconfig           = "com.github.pureconfig"      %% "pureconfig"                     % pureconfigV
  private lazy val scalaSpec2           = "org.specs2"                 %% "specs2-core"                    % spec2Version % SCOPE_TEST
  private lazy val scalatest            = "org.scalatest"              %% "scalatest"                      % scalatestVersion
  private lazy val scalacheck           = "org.scalacheck"             %% "scalacheck"                     % scalacheckV
  private lazy val shapeless            = "com.chuusai"               %% "shapeless"                       % shapelessVersion
  private lazy val twitterServer        = "com.twitter"                %% "twitter-server"                 % twitterServerVersion
  private lazy val twitterServerStats   = "com.twitter"                %% "finagle-stats"                  % twitterServerVersion
  private lazy val twitterServerLogback = "com.twitter"                %% "twitter-server-logback-classic" % twitterServerVersion
  private lazy val z                    =  "org.scalaz"                %% "scalaz-core"                    % zVersion
  private lazy val zio                  = "dev.zio"                    %% "zio"                            % zioVersion
  private lazy val zioCatsInterop       = "dev.zio"                    % "zio-interop-cats_2.12"           % zioCatsInteropVersion
  // --- scope

  private val SCOPE_TEST = "test"

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

  private lazy val baseDependencies =
    Seq(
      doobieCore,
      doobieCoreH2,
      doobieCoreHikari,
      jdbcOrient,
      finchXCore,
      finchXCirce,
      circeGeneric,
      circeGenericX,
      config,
      twitterServer,
      twitterServerStats,
      twitterServerLogback,
      logback,
      openNLP,
      scalatest % SCOPE_TEST
    )

  lazy val applicationDependencies: Seq[ModuleID] = baseDependencies

  lazy val applicationsecurityDependencies: Seq[ModuleID] = baseDependencies

  lazy val applicationServerCoreDependencies: Seq[ModuleID] = baseDependencies

  lazy val applicationServerCoreStaticSiteDependencies: Seq[ModuleID] = baseDependencies

  lazy val commonDependencies: Seq[ModuleID] =
    Seq(cats, scalaSpec2, shapeless, z)

  lazy val domainDependencies: Seq[ModuleID] =
    baseDependencies ++ Seq(monocleCore)

  lazy val infrastructureDependencies: Seq[ModuleID] =
    Seq(delightNashorn, doobieCore,   http4SCirce, http4SDSL,http4SBlazeClient,  http4SBlazeServer, scalaSpec2, zio )

  // --- Http server configurations

  lazy val applicationservercoreDependencies: Seq[ModuleID] =
    Seq(cats, circeGeneric, circeGenericX, jwtCore, jwtCirce, http4SBlazeServer, http4SCirce, http4SDSL, http4SDSLRho, http4sTsec, scalaSpec2, zio, zioCatsInterop)

  lazy val applicationserverapiDependencies: Seq[ModuleID] =
    applicationservercoreDependencies

  lazy val applicationserverstaticsitesDependencies: Seq[ModuleID] =
    applicationservercoreDependencies

  // --- :End Http server configurations

  lazy val libraryrolesystemDependencies: Seq[ModuleID] =
    baseDependencies

}
