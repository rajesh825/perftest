package org.mygovscot.website

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object landingpage   {


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

	val uri1 = "https://perwww.mygov.scot"


	val feeder = csv("pdflandingpages.csv").random

	val browse = group("Homepage") {
		// homepage
				exec(http("request_0")
					.get("/")
					.headers(headers_0)
					.resources(http("request_1")
						.get(uri1 + "/assets/styles/main.2f08972e.css")
						.headers(headers_1),
						http("request_2")
							.get(uri1 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
							.headers(headers_2),
						http("request_3")
							.get(uri1 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
							.headers(headers_2),
						http("request_4")
							.get(uri1 + "/assets/scripts/vendor/responsive.js")
							.headers(headers_2),
						http("request_5")
							.get(uri1 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
							.headers(headers_2),
						http("request_6")
							.get(uri1 + "/assets/scripts/global.9cc41def.js")
							.headers(headers_2),
						http("request_7")
							.get(uri1 + "/assets/scripts/index.b4996494.js")
							.headers(headers_2),
						http("request_8")
							.get(uri1 + "/assets/images/icons/arrows/int_arrow_right_42px.png")
							.headers(headers_8),
						http("request_9")
							.get(uri1 + "/assets/images/icons/arrows/int_arrow_right_70px.png")
							.headers(headers_8),
						http("request_10")
							.get(uri1 + "/assets/images/icons/search-white_@2x.png")
							.headers(headers_8),
						http("request_11")
							.get(uri1 + "/assets/images/mygov-logos/mygovscot_195px.png")
							.headers(headers_8),
						http("request_12")
							.get(uri1 + "/assets/images/mygov-logos/govscot_165px.png")
							.headers(headers_8),
						http("request_13")
							.get(uri1 + "/assets/images/icons/notification_close_grey.png")
							.headers(headers_8),
						http("request_14")
							.get(uri1 + "/assets/images/icons/notification_close_white.png")
							.headers(headers_8)))

	}
		.pause(43)
		.feed(feeder)
		  .group ("navigate to PDF Landing page"){
				exec(http("request_15")
					.get("/${landingpageUrl}")
					.headers(headers_0)
					.resources(http("request_16")
						.get(uri1 + "/${landingpageUrl}/")
						.headers(headers_0),
						http("request_17")
							.get(uri1 + "/assets/styles/main.2f08972e.css")
							.headers(headers_1),
						http("request_18")
							.get(uri1 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
							.headers(headers_2),
						http("request_19")
							.get(uri1 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
							.headers(headers_2),
						http("request_20")
							.get(uri1 + "/assets/scripts/vendor/responsive.js")
							.headers(headers_2),
						http("request_21")
							.get(uri1 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
							.headers(headers_2),
						http("request_22")
							.get(uri1 + "/assets/scripts/global.9cc41def.js")
							.headers(headers_2),
						http("request_23")
							.get(uri1 + "/assets/scripts/document-landing.3814bcc0.js")
							.headers(headers_2),
						http("request_24")
							.get(uri1 + "/assets/images/icons/arrows/download.png")
							.headers(headers_8),
						http("request_25")
							.get(uri1 + "/assets/images/icons/search-white_@2x.png")
							.headers(headers_8),
						http("request_26")
							.get(uri1 + "/procurement-strategy/procurement-strategy.165.jpg")
							.headers(headers_8),
						http("request_27")
							.get(uri1 + "/assets/images/mygov-logos/mygovscot_195px.png")
							.headers(headers_8),
						http("request_28")
							.get(uri1 + "/assets/images/mygov-logos/govscot_165px.png")
							.headers(headers_8),
						http("request_29")
							.get(uri1 + "/assets/images/icons/notification_close_grey.png")
							.headers(headers_8),
						http("request_30")
							.get(uri1 + "/assets/images/icons/notification_close_white.png")
							.headers(headers_8))
					.check(status.is(301)))

			}

		.pause(7)
		 .feed(feeder)
		  .group("Download pdf landing page") {


				exec(http("request_23")
					.get("/${landingpageUrl}/${pdfdownloadUrl}")
					.headers(headers_0))

			}

}