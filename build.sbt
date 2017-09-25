name := "sbt-findbugs"
organization := "com.github.sbt"

version := "2.0.0-M4-SNAPSHOT"

sbtPlugin := true
crossSbtVersions := Seq("0.13.16", "1.0.2")

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "-Xfuture",
  "-Ywarn-adapted-args",
  "-Ywarn-dead-code")

libraryDependencies ++= Seq(
  "com.google.code.findbugs"  %  "findbugs"   % "3.0.1",
  "org.scalatest"             %% "scalatest"  % "3.0.4"   % "test"
)

licenses += (("Eclipse Public License v1.0", url("http://www.eclipse.org/legal/epl-v10.html")))
headerLicense := Some(HeaderLicense.Custom(
  """|This file is part of sbt-findbugs
     |
     |Copyright (c) Joachim Hofer & contributors
     |All rights reserved.
     |
     |This program and the accompanying materials
     |are made available under the terms of the Eclipse Public License v1.0
     |which accompanies this distribution, and is available at
     |http://www.eclipse.org/legal/epl-v10.html
     |""".stripMargin
))

