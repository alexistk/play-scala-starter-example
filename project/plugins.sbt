ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
ThisBuild / evictionErrorLevel := Level.Info
// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.20")
//addSbtPlugin("org.scalaxb" % "sbt-scalaxb" % "1.11.1")
//addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.4")
//addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.2")
//addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.10")
//addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.4")
//addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.2")

addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.9.16")