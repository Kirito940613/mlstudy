name := "mlstudy"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= {
  Seq(
    "org.apache.spark" %% "spark-core" % "2.0.2",
    "org.apache.spark" %% "spark-sql" % "2.0.2",
    "org.apache.spark" %% "spark-mlib" % "2.0.2",
    "edu.stanford.nlp" %% "stanford-corenlp" % "3.6.0",
    "edu.stanford.nlp" %%"stanford-corenlp" % "3.6.0" classifier "models",
    "org.mongodb.spark" %% "mongo-spark-connector" % "2.0.0",
    "org.reactivemongo" %% "reactivemongo" % "0.12.1",
    "org.reactivemongo" %% "reactivemongo-play-json" % "0.12.1",
    "com.typesafe.play" %% "play-json" % "2.5.12",
    "com.typesafe.akka" %% "akka-actor" % "2.4.17",
    "com.typesafe.akka" %% "akka-slf4j" % "2.4.17",
    "com.typesafe.akka" %% "akka-testkit" % "2.4.17" % "test",
    "com.typesafe.akka" %% "akka-http" % "10.0.3",
    "com.typesafe.akka" %% "akka-http-testkit" % "10.0.3",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  )
}
