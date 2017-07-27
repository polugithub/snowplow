/*
 * Copyright (c) 2013-2016 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0, and
 * you may not use this file except in compliance with the Apache License
 * Version 2.0.  You may obtain a copy of the Apache License Version 2.0 at
 * http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Apache License Version 2.0 is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the Apache License Version 2.0 for the specific language
 * governing permissions and limitations there under.
 */
import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    "Snowplow Analytics Maven repo" at "http://maven.snplow.com/releases/",
    // For uaParser utils
    "user-agent-parser repo" at "https://clojars.org/repo/"
  )

  object V {
    // Java
    val awsSdk               = "1.11.115"
    val yodaTime             = "2.9.9"
    val kafka                = "0.10.2.1"
    val config               = "1.3.1"
    // Scala
    val snowplowCommonEnrich = "0.22.0"
    val igluClient           = "0.3.2"
    val collectorPayload     = "0.0.0"
    val scalaz7              = "7.0.9"
    val akkaHttp             = "10.0.9"
    val scopt                = "3.6.0"
    val json4s               = "3.2.11"
    val pureconfig           = "0.7.2"
    // Scala (test only)
    val specs2               = "3.9.4"
  }

  object Libraries {
    // Java
    val awsSdk               = "com.amazonaws"         %  "aws-java-sdk-kinesis"   % V.awsSdk
    val yodaTime             = "joda-time"             %  "joda-time"              % V.yodaTime
    val kafkaClients         = "org.apache.kafka"      %  "kafka-clients"          % V.kafka
    val config               = "com.typesafe"          %  "config"                 % V.config

    // Scala
    val snowplowCommonEnrich = "com.snowplowanalytics" %  "snowplow-common-enrich" % V.snowplowCommonEnrich intransitive
    val igluClient           = "com.snowplowanalytics" %  "iglu-scala-client"      % V.igluClient
    val collectorPayload     = "com.snowplowanalytics" %  "collector-payload-1"    % V.collectorPayload
    val scalaz7              = "org.scalaz"            %% "scalaz-core"            % V.scalaz7
    val scopt                = "com.github.scopt"      %% "scopt"                  % V.scopt
    val akkaHttp             = "com.typesafe.akka"     %% "akka-http"              % V.akkaHttp
    val json4sJackson        = "org.json4s"            %% "json4s-jackson"         % V.json4s
    val pureconfig           = "com.github.pureconfig" %% "pureconfig"             % V.pureconfig

    // Scala (test only)
    val specs2               = "org.specs2"            %% "specs2-core"            % V.specs2   % "test"
    val akkaHttpTestkit      = "com.typesafe.akka"     %% "akka-http-testkit"      % V.akkaHttp % "test"
  }
}
