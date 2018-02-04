package org.mygovscot.website

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

/**
* Created by z608174 on 17/11/2014.
*/
object BRCComponentDesktop {



  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Pragma" -> "no-cache",
    "Upgrade-Insecure-Requests" -> "1",
    "X-FirePHP-Version" -> "0.0.6")

  val headers_1 = Map(
    "Pragma" -> "no-cache",
    "X-FirePHP-Version" -> "0.0.6",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_14 = Map(
    "Accept" -> "*/*",
    "Pragma" -> "no-cache",
    "X-FirePHP-Version" -> "0.0.6",
    "X-Requested-With" -> "XMLHttpRequest")

  val uri1 = "fonts.googleapis.com"
  val uri2 = "https://perwww.mygov.scot:443"

  val feeder = csv("postcode.csv").random

  val search =    group("Homepage") {
                    exec(http("request_0")
                      .get("/")
                      .headers(headers_0))
                 }

                  .pause(5)

                 .group("Launch business rates calculator"){

                        exec(http("request_1")
                          .get("/business-rates-calculator/")
                          .headers(headers_0)


                        )



                  }
                  .pause(5)

                  .feed(feeder)
                            .group("Search from home page") {


                                exec(http("request_14")
                                  .get("/address/?search=${validPostCode}")
                                  .headers(headers_14)
                                  .check(status.in(200 to 404)))




                            }



}



