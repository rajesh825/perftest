package org.govscot.website


import io.gatling.core.Predef._
import io.gatling.http.Predef._
import util.Environment

import scala.concurrent.duration._


class LoadSimulation extends Simulation {

  //Configuration
  val httpProtocol = http
    .baseURL(Environment.baseURL)
    .inferHtmlResources(BlackList("""https://platform.twitter.com/*.*""", """https://www.google-analytics.com/*.*""", """https://www.googletagmanager.com/*.*""", """https://maxcdn.bootstrapcdn.com/font-awesome/*.*""", """https://fonts.googleapis.com/*.*""", """https://www.gstatic.com""", """https://www.google.com/recaptcha/api.js""", """https://farm1.staticflickr.com/*.*""", """https://s.ytimg.com*.*""", """https://pbs.twimg.com/*.*""", """https://www.googleapis.com/youtube/v*.*""", """https://www.google-analytics.com""", """https://static.doubleclick.ne*.*""", """https://syndication.twitter.com*.*""", """https://cdn.syndication.twimg.co*.*""", """https://api.flickr.co*.*""", """https://maxcdn\.bootstrapcdn\.co*.*""", """https://fonts.gstatic.com/s/roboto/v*.*""", """https://i.ytimg.com*.*""", """https://www.youtube.co*.*""", """https://www.google.co*.*""", """https://googleads.g.doubleclick.net/pag*.*""", """https://fonts.googleapi.co*.*"""), WhiteList())
    .acceptHeader( """*/*""")
    .acceptEncodingHeader( """gzip, deflate, sdch""")
    .acceptLanguageHeader( """en-US,en;q=0.8""")
    .connection( """keep-alive""")
    .userAgentHeader( """Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.62 Safari/537.36""")




  val scn = scenario("RecordedSimulation").forever()(



    randomSwitch(

      20.0 -> PolicyNavigation.browse,
      20.0 -> NewsNavigation.browse,
      20.0 -> PublicationsNavigation.browse,
      40.0 -> Search.browse
     // 20.0 -> WebsiteBrowsing.browse
    )
  )

  setUp(
    //scn.inject(constantUsersPerSec(0.18) during(360)))
    //scn.users(3000).ramp(15)
    //   scn.inject(constantUsersPerSec(8) during(50 seconds) randomized,nothingFor(20 seconds),constantUsersPerSec(10) during(100 seconds))  //Around 1380 users
    // scn.inject(constantUsersPerSec(4) during(50 seconds) randomized,nothingFor(20 seconds),constantUsersPerSec(5) during(100 seconds)) //Around 700 users
    //  scn.inject(constantUsersPerSec(4) during(100 seconds) randomized,nothingFor(300 seconds),constantUsersPerSec(0.67) during(300 seconds) ,nothingFor(300 seconds),
    //   constantUsersPerSec(1) during(300 seconds) ,nothingFor(300 seconds), constantUsersPerSec(1) during(100 seconds))  //Around 1000 Users

    //700 Users
    scn.inject(constantUsersPerSec(3) during(100 seconds) randomized,nothingFor(300 seconds), constantUsersPerSec(0.5) during(400 seconds) randomized,nothingFor(300 seconds),constantUsersPerSec(0.5) during(400 seconds) randomized,nothingFor(2100 seconds))
    //scn.inject(constantUsersPerSec(3) during(100 seconds) randomized,nothingFor(300 seconds),constantUsersPerSec(1) during(300 seconds) randomized,constantUsersPerSec(1) during(300 seconds) ,nothingFor(300 seconds),constantUsersPerSec(1) during(115 seconds),nothingFor(2200 seconds))

    //  scn.inject(constantUsersPerSec(3) during(100 seconds) randomized,nothingFor(300 seconds),constantUsersPerSec(1) during(300 seconds) randomized,
    //constantUsersPerSec(1) during(300 seconds) ,nothingFor(300 seconds),constantUsersPerSec(1.5) during(300 seconds), nothingFor(2000 seconds)) //Around 1300 users


    //Around 1500 users
    //scn.inject(constantUsersPerSec(3) during(100 seconds) randomized,nothingFor(300 seconds),constantUsersPerSec(1) during(300 seconds) randomized,constantUsersPerSec(1) during(300 seconds) ,nothingFor(300 seconds),constantUsersPerSec(2) during(300 seconds) , nothingFor(2000 seconds))


  )
    .protocols(httpProtocol)
    .maxDuration(3600 seconds)
    //,
    //constantUsersPerSec(0.15) during (1600 seconds)))
    //scn.inject(constantUsersPerSec(0.18) during (120)))

    .protocols(httpProtocol)
    .maxDuration(600 seconds)

}