//package org.mygovscot.website
//
//import scala.concurrent.duration._
//
//import io.gatling.core.Predef._
//import io.gatling.http.Predef._
//import io.gatling.jdbc.Predef._
//
//
//
//class SoakSimulation extends Simulation {
//
//  val httpProtocol = http
//    .baseURL(Environment.baseURL)
//    //.inferHtmlResources()
//    .acceptHeader( """*/*""")
//    .acceptEncodingHeader( """gzip, deflate, sdch""")
//    .acceptLanguageHeader( """en-US,en;q=0.8""")
//    .connection( """keep-alive""")
//    .userAgentHeader( """Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.62 Safari/537.36""")
//
//
//
//
//
//  val scn = scenario("RecordedSimulation").forever()(
//
//
//
//    randomSwitch(
//
//
//      10.0 -> FundingToolDesktop.browseFunds,
//      10.0 -> BRCDesktop.browse,
//      20.0 -> searchDesktop.search,
//      60.0 -> BrowseDesktop.browse
//
//
//    )
//  )
//
//  setUp(
//    scn.inject(constantUsersPerSec(2) during(50 seconds) randomized,nothingFor(3000 seconds),constantUsersPerSec(1) during(100 seconds))
//  ) //,
//    //constantUsersPerSec(0.15) during (1600 seconds)))
//    //scn.inject(constantUsersPerSec(0.18) during (120)))
//
//    .protocols(httpProtocol)
//    .maxDuration(36000 seconds)
//
//}
