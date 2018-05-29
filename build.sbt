name := "PodMetricsPuller"

version := "0.1"

scalaVersion := "2.11.12"


libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.2.0"

libraryDependencies += "org.apache.spark" % "spark-streaming-kafka-0-10_2.11" % "2.2.0"

libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.11.0"

libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.11.0"

libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.0"

libraryDependencies += "org.apache.spark" % "spark-sql-kafka-0-10_2.11" % "2.2.0"


libraryDependencies += "org.elasticsearch" % "elasticsearch-spark-20_2.11" % "6.2.4"


