package org.mygovscot.website

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import util.Environment



class LoadSimulation500 extends Simulation {

  val httpProtocol = http
    .baseURL(Environment.baseURL)
   // .baseURL("http://search-bank-7fv5itf6yg5lcv4wpee2vvntpe.eu-west-1.es.amazonaws.com")
   // .inferHtmlResources()
    .acceptHeader( """*/*""")
    .acceptEncodingHeader( """gzip, deflate, sdch""")
    .acceptLanguageHeader( """en-US,en;q=0.8""")
    .connection( """keep-alive""")
    .userAgentHeader( """Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.62 Safari/537.36""")





  val scn = scenario("RecordedSimulation").forever()(



    randomSwitch(
      5.0  -> FundingOpportunities.browse,
      10.0 -> BusinessRates.browse,
      20.0 -> searchDesktop.search,
      5.0 -> landingpage.browse,
      60.0 -> browsing.browse

    )
  )

  setUp(
    //scn.inject(constantUsersPerSec(0.18) during(360)))
    //scn.users(3000).ramp(15)
   scn.inject(constantUsersPerSec(8) during(50 seconds) randomized,nothingFor(200 seconds),constantUsersPerSec(10) during(100 seconds))

//Around 1000 Users
//  scn.inject(constantUsersPerSec(4) during(100 seconds) randomized,nothingFor(300 seconds),constantUsersPerSec(0.67) during(300 seconds) ,nothingFor(300 seconds),
//   constantUsersPerSec(1) during(300 seconds) ,nothingFor(300 seconds), constantUsersPerSec(1) during(100 seconds))

//Around 1300 users
//  scn.inject(constantUsersPerSec(3) during(100 seconds) randomized,nothingFor(300 seconds),constantUsersPerSec(1) during(300 seconds) randomized,
//  constantUsersPerSec(1) during(300 seconds) ,nothingFor(300 seconds),constantUsersPerSec(1.5) during(300 seconds), nothingFor(2000 seconds))

  )

    .protocols(httpProtocol)
    .maxDuration(600 seconds)

}
