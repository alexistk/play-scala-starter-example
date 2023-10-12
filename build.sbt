lazy val common = (project in file("modules/common"))
  .enablePlugins(PlayScala)
  .settings(
    libraryDependencies ++= Seq(
      guice,
      "com.h2database" % "h2" % "1.4.200",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
    ),
    name := "common",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.12",
  )

lazy val moduleone = (project in file("modules/moduleone"))
  .enablePlugins(PlayScala)
  .settings(
    name := "moduleone",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.12",
  ).dependsOn(common)

lazy val moduletwo = (project in file("modules/moduletwo"))
  .enablePlugins(PlayScala, JavaAppPackaging)
  .settings(
    name := "moduletwo",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.12",
  ).dependsOn(common)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala, JavaAppPackaging)
  .settings(
    name := """play-scala-starter-example""",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.12",
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation"
    )
  )
  .aggregate(moduleone, moduletwo)