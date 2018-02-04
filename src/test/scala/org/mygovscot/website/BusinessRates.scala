package org.mygovscot.website

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object BusinessRates{

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

	val headers_37 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val uri1 = "https://perwww.mygov.scot"

	val feeder = csv("postcode.csv").random

	val browse = group("Homepage") {
		// Homepage
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
					.get(uri1 + "/assets/images/icons/search-white_@2x.png")
					.headers(headers_8),
				http("request_10")
					.get(uri1 + "/assets/images/icons/arrows/int_arrow_right_70px.png")
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
		.pause(20)
		.group("Search for Business rates calculator") {

			exec(http("request_15")
				.get("/service/search/ac?q=Bus")
				.headers(headers_15)
				.resources(http("request_16")
					.get(uri1 + "/service/search/ac?q=Busines")
					.headers(headers_15),
					http("request_17")
						.get(uri1 + "/service/search/ac?q=Business+rate")
						.headers(headers_15),
					http("request_18")
						.get(uri1 + "/service/search/ac?q=Business+rates")
						.headers(headers_15),
					http("request_19")
						.get(uri1 + "/service/search/ac?q=Business+rates+")
						.headers(headers_15),
					http("request_20")
						.get(uri1 + "/service/search/ac?q=Business+rates+calc")
						.headers(headers_15),
					http("request_21")
						.get(uri1 + "/service/search/ac?q=Business+rates+calcu")
						.headers(headers_15),
					http("request_22")
						.get(uri1 + "/business-rates-calculator/")
						.headers(headers_0),
					http("request_23")
						.get(uri1 + "/assets/styles/main.2f08972e.css")
						.headers(headers_1),
					http("request_24")
						.get(uri1 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
						.headers(headers_2),
					http("request_25")
						.get(uri1 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
						.headers(headers_2),
					http("request_26")
						.get(uri1 + "/assets/scripts/vendor/responsive.js")
						.headers(headers_2),
					http("request_27")
						.get(uri1 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
						.headers(headers_2),
					http("request_28")
						.get(uri1 + "/assets/scripts/global.9cc41def.js")
						.headers(headers_2),
					http("request_29")
						.get(uri1 + "/assets/scripts/business-rates-calculator.fe550605.js")
						.headers(headers_2),
					http("request_30")
						.get(uri1 + "/assets/images/mygov-logos/mygovscot_195px.png")
						.headers(headers_8),
					http("request_31")
						.get(uri1 + "/assets/images/icons/search-white_@2x.png")
						.headers(headers_8),
					http("request_32")
						.get(uri1 + "/assets/images/icons/note.png")
						.headers(headers_8),
					http("request_33")
						.get(uri1 + "/assets/images/mygov-logos/govscot_165px.png")
						.headers(headers_8),
					http("request_34")
						.get(uri1 + "/assets/images/icons/notification_close_grey.png")
						.headers(headers_8),
					http("request_35")
						.get(uri1 + "/assets/images/icons/notification_close_white.png")
						.headers(headers_8),
					http("request_36")
						.get(uri1 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
						.headers(headers_8)))

			}
		.pause(1)




		.pause(3)

		  .group("Launch Business rates calculator") {


				exec(http("request_49")
					.get("/business-rates-calculator/"))


			}


		.pause(7)
		.feed(feeder)
		.group("Perform post code search") {

			exec(http("request_37")
				.get("/address/?search=${validPostCode}")
				.headers(headers_37)
				.resources(http("request_38")
					.get(uri1 + "/assets/images/async/ajax-loader-blue-lightest.gif")
					.headers(headers_8)))



		}
		.pause(14)

		.group("Perform street and City search") {


			exec(http("request_39")
				.get("/address/?search=Leith%20Walk%20Edinburgh")
				.headers(headers_37))
				.pause(16)
				.exec(http("request_40")
					.get("/assets/images/icons/info_grey.png")
					.headers(headers_8)
					.resources(http("request_41")
						.get(uri1 + "/assets/images/icons/arrows/ext_arrow_text_17px_white.png")
						.headers(headers_8),
						http("request_42")
							.get(uri1 + "/assets/images/icons/refresh-primary_@2x.png")
							.headers(headers_8)))

		}


}