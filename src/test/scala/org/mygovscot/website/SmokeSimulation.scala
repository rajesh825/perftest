package org.mygovscot.website

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import io.gatling.jdbc.Predef._
import util._





class SmokeSimulation extends Simulation {

  val httpProtocol = http
    .baseURL(Environment.baseURL)

    //.inferHtmlResources()
    .acceptHeader( """*/*""")
    .acceptEncodingHeader( """gzip, deflate, sdch""")
    .acceptLanguageHeader( """en-US,en;q=0.8""")
    .connection( """keep-alive""")
    .userAgentHeader( """Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.62 Safari/537.36""")




  val scn = scenario("RecordedSimulation").forever()(



    randomSwitch(

        10.0  -> FundingOpportunities.browse,
        10.0 -> BusinessRates.browse,
        20.0 -> searchDesktop.search,
        20.0 -> landingpage.browse,
        40.0 -> browsing.browse


    )
  )

  setUp(
    scn.inject(constantUsersPerSec(1) during(10))
   // scn.inject(constantUsersPerSec(1) during(10), nothingFor(30 seconds),constantUsersPerSec(1) during(10) )
  ) //,



    .protocols(httpProtocol)
   // .assertions(global.responseTime.max.lessThan(10))

    .maxDuration(300 seconds)



}
