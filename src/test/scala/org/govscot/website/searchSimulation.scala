package org.govscot.website

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class searchSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("https://perwww.mygov.scot")
		.disableFollowRedirect
		.inferHtmlResources(BlackList("""https://platform.twitter.com/*.*""", """https://www.google-analytics.com/*.*""", """https://www.googletagmanager.com/*.*""", """https://maxcdn.bootstrapcdn.com/font-awesome/*.*""", """https://fonts.googleapis.com/*.*""", """https://www.gstatic.com""", """https://www.google.com/recaptcha/api.js""", """https://farm1.staticflickr.com/*.*""", """https://s.ytimg.com*.*""", """https://pbs.twimg.com/*.*""", """https://www.googleapis.com/youtube/v*.*""", """https://www.google-analytics.com""", """https://static.doubleclick.ne*.*""", """https://syndication.twitter.com*.*""", """https://cdn.syndication.twimg.co*.*""", """https://api.flickr.co*.*""", """https://maxcdn\.bootstrapcdn\.co*.*""", """https://fonts.gstatic.com/s/roboto/v*.*""", """https://i.ytimg.com*.*""", """https://www.youtube.co*.*""", """https://www.google.co*.*""", """https://googleads.g.doubleclick.net/pag*.*""", """https://fonts.googleapi.co*.*""", """https://www.gstatic.com/*.*""", """https://maxcdn.bootstrapcdn*.*"""), WhiteList())

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_2 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_8 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_15 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_31 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")


	val uri4 = "https://perwww.mygov.scot"

	val scn = scenario("searchSimulation")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri4 + "/assets/styles/main.502ff5b1.css")
			.headers(headers_1),
            http("request_2")
			.get(uri4 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
			.headers(headers_2),
            http("request_3")
			.get(uri4 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
			.headers(headers_2),
            http("request_4")
			.get(uri4 + "/assets/scripts/vendor/responsive.js")
			.headers(headers_2),
            http("request_5")
			.get(uri4 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
			.headers(headers_2),
            http("request_6")
			.get(uri4 + "/assets/scripts/global.2cb502df.js")
			.headers(headers_2),
            http("request_7")
			.get(uri4 + "/assets/scripts/index.b4996494.js")
			.headers(headers_2),
            http("request_8")
			.get(uri4 + "/assets/images/icons/search-white_@2x.png")
			.headers(headers_8),
            http("request_9")
			.get(uri4 + "/assets/images/icons/arrows/int_arrow_right_42px.png")
			.headers(headers_8),
            http("request_10")
			.get(uri4 + "/assets/images/icons/arrows/int_arrow_right_70px.png")
			.headers(headers_8),
            http("request_11")
			.get(uri4 + "/assets/images/mygov-logos/mygovscot_195px.png")
			.headers(headers_8),
            http("request_12")
			.get(uri4 + "/assets/images/mygov-logos/govscot_165px.png")
			.headers(headers_8),
            http("request_13")
			.get(uri4 + "/assets/images/icons/notification_close_grey.png")
			.headers(headers_8),
            http("request_14")
			.get(uri4 + "/assets/images/icons/notification_close_white.png")
			.headers(headers_8)))
		.pause(3)
		.exec(http("request_15")
			.get("/service/search/ac?q=busi")
			.headers(headers_15)
			.resources(http("request_16")
			.get(uri4 + "/service/search/ac?q=busines")
			.headers(headers_15),
            http("request_17")
			.get(uri4 + "/service/search/ac?q=business")
			.headers(headers_15)))
		.pause(3)
		.exec(http("request_18")
			.get("/search/?q=business&cat=sitesearch")
			.headers(headers_0)
			.resources(http("request_19")
			.get(uri4 + "/assets/styles/main.502ff5b1.css")
			.headers(headers_1),
            http("request_20")
			.get(uri4 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
			.headers(headers_2),
            http("request_21")
			.get(uri4 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
			.headers(headers_2),
            http("request_22")
			.get(uri4 + "/assets/scripts/vendor/responsive.js")
			.headers(headers_2),
            http("request_23")
			.get(uri4 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
			.headers(headers_2),
            http("request_24")
			.get(uri4 + "/assets/scripts/global.2cb502df.js")
			.headers(headers_2),
            http("request_25")
			.get(uri4 + "/assets/scripts/search.75ae322d.js")
			.headers(headers_2),
            http("request_26")
			.get(uri4 + "/assets/images/icons/search-white_@2x.png")
			.headers(headers_8),
            http("request_27")
			.get(uri4 + "/assets/images/mygov-logos/mygovscot_195px.png")
			.headers(headers_8),
            http("request_28")
			.get(uri4 + "/assets/images/mygov-logos/govscot_165px.png")
			.headers(headers_8),
            http("request_29")
			.get(uri4 + "/assets/images/icons/notification_close_grey.png")
			.headers(headers_8),
            http("request_30")
			.get(uri4 + "/assets/images/icons/notification_close_white.png")
			.headers(headers_8),
            http("request_31")
			.get(uri4 + "/service/search/direct/?didyoumean=true&q=business&from=0&size=10")
			.headers(headers_31),
            http("request_32")
			.get(uri4 + "/assets/images/async/ajax-loader-white.gif")
			.headers(headers_8)))
		.pause(3)
		.exec(http("request_33")
			.get("/business-events/")
			.headers(headers_0)
			.resources(http("request_34")
			.get(uri4 + "/assets/images/icons/notification_close_grey.png")
			.headers(headers_8),
            http("request_35")
			.get(uri4 + "/assets/images/icons/notification_close_white.png")
			.headers(headers_8),
            http("request_36")
			.get(uri4 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
			.headers(headers_8),
            http("request_37")
			.get(uri4 + "/assets/images/icons/arrows/int_arrow_up_70px.png")
			.headers(headers_8)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}