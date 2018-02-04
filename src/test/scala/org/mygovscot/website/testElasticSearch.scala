package org.mygovscot.website

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import util.Environment

/**
 * Created by z608174 on 17/11/2014.
 */
object testElasticSearch {

  val httpProtocol = http
    .baseURL(Environment.baseURL)

   val uri3 = "search-bank-7fv5itf6yg5lcv4wpee2vvntpe.eu-west-1.es.amazonaws.com"

  val feeder = csv("search.csv").random

  val search =    group("Homepage") {
                    exec(http("request_0")
                     .get("http://" + uri3 + "/")
                        )

                  }

    .pause(5)

    .feed(feeder)
    .group("Search from home page") {
      exec(http("request_1")
          .get("/bank/_search?q=${searchCriterion}")
        )
    }

}
















