package org.mygovscot.website

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._


class searchComponentLoadSimulation extends Simulation {

  val httpProtocol = http
    .baseURL("https://perwww.mygov.scot")
    .disableFollowRedirect
    .inferHtmlResources(BlackList("""https://platform.twitter.com/*.*""", """https://www.google-analytics.com/*.*""", """https://www.googletagmanager.com/*.*""", """https://maxcdn.bootstrapcdn.com/font-awesome/*.*""", """https://fonts.googleapis.com/*.*""", """https://www.gstatic.com""", """https://www.google.com/recaptcha/api.js""", """https://farm1.staticflickr.com/*.*""", """https://s.ytimg.com*.*""", """https://pbs.twimg.com/*.*""", """https://www.googleapis.com/youtube/v*.*""", """https://www.google-analytics.com""", """https://static.doubleclick.ne*.*""", """https://syndication.twitter.com*.*""", """https://cdn.syndication.twimg.co*.*""", """https://api.flickr.co*.*""", """https://maxcdn\.bootstrapcdn\.co*.*""", """https://fonts.gstatic.com/s/roboto/v*.*""", """https://i.ytimg.com*.*""", """https://www.youtube.co*.*""", """https://www.google.co*.*""", """https://googleads.g.doubleclick.net/pag*.*""", """https://fonts.googleapi.co*.*""", """https://www.gstatic.com/*.*""", """https://maxcdn.bootstrapcdn*.*"""), WhiteList())




  val scn = scenario("RecordedSimulation").forever()(



    randomSwitch(

//        20.0 -> BrowseDesktop.browse,
       // 20.0 -> BRCComponentDesktop.search,
        100.0 -> searchDesktop.search


    )
  )

  setUp(
  //  scn.inject(constantUsersPerSec(10) during(70) randomized)
      scn.inject( constantUsersPerSec(2) during(50) randomized,
                  nothingFor(200 seconds),
                  constantUsersPerSec(2) during(50) randomized

            )

    //scn.inject(constantUsersPerSec(8) during(50 seconds) randomized,nothingFor(200 seconds),constantUsersPerSec(10) during(100 seconds))


  )



    .protocols(httpProtocol)
    .assertions(global.responseTime.max.lessThan(10))
    .maxDuration(300 seconds)



}
