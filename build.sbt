name := "sbt-selenium-test"

organization := "com.github.dnvriend"

version := "1.0.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq (
  "org.scalatest"           % "scalatest_2.11"            % "2.2.1"  % Test,
  "org.seleniumhq.selenium" % "selenium-java"             % "2.35.0" % Test
)
