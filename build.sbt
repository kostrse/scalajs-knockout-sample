enablePlugins(ScalaJSPlugin)

scalaJSStage in Global := FastOptStage

name := "Scala.js Knockout Sample"
version := "0.1.0"

scalaVersion := "2.11.6"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.1"
