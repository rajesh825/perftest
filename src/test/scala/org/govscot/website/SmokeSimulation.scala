package org.govscot.website

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import org.mygovscot.website.Brexit
import util.Environment

import scala.concurrent.duration._


class SmokeSimulation extends Simulation {

  //Configuration
  val httpProtocol = http
      .baseURL(Environment.baseURL)
    .inferHtmlResources(BlackList("""https://platform.twitter.com/*.*""", """https://www.google-analytics.com/*.*""", """https://www.googletagmanager.com/*.*""", """https://maxcdn.bootstrapcdn.com/font-awesome/*.*""", """https://fonts.googleapis.com/*.*""", """https://www.gstatic.com""", """https://www.google.com/recaptcha/api.js""", """https://farm1.staticflickr.com/*.*""", """https://s.ytimg.com*.*""", """https://pbs.twimg.com/*.*""", """https://www.googleapis.com/youtube/v*.*""", """https://www.google-analytics.com""", """https://static.doubleclick.ne*.*""", """https://syndication.twitter.com*.*""", """https://cdn.syndication.twimg.co*.*""", """https://api.flickr.co*.*""", """https://maxcdn\.bootstrapcdn\.co*.*""", """https://fonts.gstatic.com/s/roboto/v*.*""", """https://i.ytimg.com*.*""", """https://www.youtube.co*.*""", """https://www.google.co*.*""", """https://googleads.g.doubleclick.net/pag*.*""", """https://fonts.googleapi.co*.*"""), WhiteList())
    .acceptHeader( """*/*""")
    .acceptEncodingHeader( """gzip, deflate, sdch""")
    .acceptLanguageHeader( """en-US,en;q=0.8""")
    .connection( """keep-alive""")
    .userAgentHeader( """Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.62 Safari/537.36""")



  //Simulation for Smoke Testing
  val scn = scenario("RecordedSimulation").forever()(


    randomSwitch(

      20.0 -> PolicyNavigation.browse,
      20.0 -> NewsNavigation.browse,
      20.0 -> PublicationsNavigation.browse,
      20.0 -> Search.browse,
      20.0 -> WebsiteBrowsing.browse

    )
  )

  setUp(
    scn.inject(constantUsersPerSec(1) during(10))

  )


    .protocols(httpProtocol)
    .maxDuration(300 seconds)


}
