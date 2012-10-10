name := "play20.auth"

version := "0.4-SNAPSHOT"

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "play" % "play_2.10" % "2.1-10082012"
)

organization := "jp.t2v"

scalaVersion := "2.10.0-M7"

scalaBinaryVersion := "2.10"

publishTo := sys.env.get("LOCAL_MAVEN_REPO").map { dir =>
  Resolver.file("maven-repo", file(dir))(Patterns(true, Resolver.mavenStyleBasePattern))
}
