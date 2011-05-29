organization := "de.johoop"

name := "findbugs4sbt"

version := "1.0.1-SNAPSHOT"

sbtPlugin := true

libraryDependencies ++= Seq(
	"org.scala-tools.testing" % "specs" % "1.6.2.1" % "test",
	"org.mockito" % "mockito-all" % "1.8.4" % "test"	
)

publishTo := Some("Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")