
enablePlugins(ScalaJSPlugin)

name := "codecraft-js-example"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.codecraftgame" %%% "codecraft" % "0.6.1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.0"
)
