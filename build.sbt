name := "spark_hbase_context"

version := "0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.1"
val hadoopVersion = "2.9.1"
val hbaseVersion = "2.0.5"
val slickVersion = "3.3.0"
val slf4jVersion = "1.6.4"
val sparkRedisVersion = "0.3.2"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.hadoop" % "hadoop-common" % hadoopVersion,
  "org.apache.hadoop" % "hadoop-hdfs" % hadoopVersion,
  "org.apache.hadoop" % "hadoop-client" % hadoopVersion,
  "org.apache.hbase" % "hbase-client" % hbaseVersion,
  "org.apache.hbase" % "hbase-server" % hbaseVersion,
  "com.typesafe.slick" %% "slick" % slickVersion,
  "org.slf4j" % "slf4j-nop" % slf4jVersion,
  "com.typesafe.slick" %% "slick-hikaricp" % slickVersion

)
