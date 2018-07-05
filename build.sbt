name := "cassandra-count"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0" % "provided"

libraryDependencies += ("com.datastax.spark" %% "spark-cassandra-connector" % "2.3.0").exclude("io.netty", "netty-handler")

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0" % "provided"

resolvers += "Job Server Bintray" at "https://dl.bintray.com/spark-jobserver/maven"

libraryDependencies += "spark.jobserver" %% "job-server-api" % "0.8.0" % "provided"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}