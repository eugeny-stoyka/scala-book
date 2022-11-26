ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "ru.chilluser.scala"
ThisBuild / scalaVersion := "2.13.10"

val javaVersion = "11"
javacOptions ++= Seq("-source", javaVersion, "-target", javaVersion, "-Xlint")

initialize := {
    val _ = initialize.value
    val currentJavaVersion = sys.props("java.specification.version")
    if (currentJavaVersion != javaVersion)
        sys.error(s"Java $javaVersion is required for this project. Found " + currentJavaVersion + " instead")
}

lazy val compilerOptions = Seq(
    "-unchecked",
    "-feature",
    "-language:existentials",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:postfixOps",
    "-deprecation",
    "-encoding",
    "utf8"
)

val testingVersion = "3.2.14"

val projectLibraryDependencies = Seq(
    "org.scalatest" %% "scalatest" % testingVersion % Test
)

lazy val root = (project in file("."))
  .settings(
    name := "scala-book",
    libraryDependencies ++= projectLibraryDependencies
  )
