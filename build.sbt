name := """play-scala-seed"""
organization := "PetStore"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "PetStore.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "PetStore.binders._"

// Estas son las dependencias necesarias para trabajar con bases de datos MySQL
libraryDependencies += jdbc
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"
