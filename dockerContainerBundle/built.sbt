lazy val dependencies = Seq(
  "cc.factorie"                  %% "factorie"                 % "1.1.1",
  "ch.qos.logback"                % "logback-classic"          % "1.1.3",
  "com.assembla.scala-incubator" %% "graph-core"               % "1.9.4",
  "com.assembla.scala-incubator" %% "graph-json"               % "1.9.2",
  "com.chuusai"                  %% "shapeless"                % "2.2.5",
  "com.github.scala-blitz"       %% "scala-blitz"              % "1.2",
  "com.h2database"                % "h2"                       % "1.4.187",
  "com.lihaoyi"                  %% "ammonite-ops"             % "0.3.2",
  "com.lihaoyi"                  %% "ammonite-pprint"          % "0.3.2",
  "com.lihaoyi"                  %% "ammonite-tools"           % "0.3.2",
  "com.lihaoyi"                  %% "fastparse"                % "0.3.0",
  "com.lihaoyi"                  %% "pprint"                   % "0.3.4",
  "com.lihaoyi"                  %% "scalaparse"               % "0.3.0",
  "com.lihaoyi"                  %% "scalarx"                  % "0.2.8",
  "com.lihaoyi"                  %% "scalatags"                % "0.5.2",
  "com.lihaoyi"                  %% "upickle"                  % "0.2.6",
  "com.squants"                  %% "squants"                  % "0.5.3",
  "com.twitter"                  %% "algebird"                 % "0.11.0",
  "com.typesafe.play"            %% "play"                     % "2.4.2",
  "io.argonaut"                  %% "argonaut"                 % "6.1",
  "io.spray"                     %% "spray-can"                % "1.3.3",
  "io.spray"                     %% "spray-client"             % "1.3.3",
  "io.spray"                     %% "spray-http"               % "1.3.3",
  "io.spray"                     %% "spray-httpx"              % "1.3.3",
  "io.spray"                     %% "spray-io"                 % "1.3.3",
  "io.spray"                     %% "spray-json"               % "1.3.2",
  "io.spray"                     %% "spray-routing-shapeless2" % "1.3.3",
  "io.spray"                     %% "spray-testkit"            % "1.3.3",
  "io.spray"                     %% "spray-util"               % "1.3.3",
  "org.parboiled"                %% "parboiled"                % "2.1.0",
  "org.scala-lang.modules"       %% "scala-async"              % "0.9.5",
  "org.scala-lang.modules"       %% "scala-parser-combinators" % "1.0.4",
  "org.scala-lang.modules"       %% "scala-pickling"           % "0.10.1",
  "org.scala-lang.modules"       %% "scala-xml"                % "1.0.5",
  "org.scala-saddle"             %% "saddle-core"              % "1.3.4",
  "org.scala-sbt"                %% "collections"              % "0.13.8",
  "org.scala-sbt"                %% "completion"               % "0.13.8",
  "org.scala-sbt"                %% "control"                  % "0.13.8",
  "org.scala-sbt"                %% "io"                       % "0.13.8",
  "org.scalaz"                   %% "scalaz-core"              % "7.1.3",
  "org.scalaz.stream"            %% "scalaz-stream"            % "0.7.2a",
  "org.scalikejdbc"              %% "scalikejdbc"              % "2.2.7",
  "org.scodec"                   %% "scodec-bits"              % "1.0.9",
  "org.scodec"                   %% "scodec-core"              % "1.8.1",
  "org.scodec"                   %% "scodec-protocols"         % "0.11.0",
  "org.scodec"                   %% "scodec-scalaz"            % "1.1.0",
  "org.scodec"                   %% "scodec-spire"             % "0.2.0",
  "org.scodec"                   %% "scodec-stream"            % "0.10.0",
  "org.spire-math"               %% "cats"                     % "0.1.2",
  "org.spire-math"               %% "debox"                    % "0.7.3",
  "org.spire-math"               %% "jawn-ast"                 % "0.8.3",
  "org.spire-math"               %% "jawn-parser"              % "0.8.3",
  "org.spire-math"               %% "spire"                    % "0.10.1",
  "org.w3"                       %% "banana-rdf"               % "0.8.1"
)

lazy val scalakata = (project in file(".")).
  enablePlugins(ScalaKataPlugin).
  settings(net.virtualvoid.sbt.graph.Plugin.graphSettings: _*).
  settings(
    organization := "masseguillaume",
    name := "scalakata-bundle",
    version := "1.0.0",
    description := "Docker Container with various librairies",
    scalaVersion := "2.11.7",
    libraryDependencies ++= dependencies,
    resolvers ++= Seq(
      Resolver.sonatypeRepo("releases"),
      Resolver.typesafeIvyRepo("releases")
    )
  )

