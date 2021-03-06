package org.mygovscot.website

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object browsing {

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
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_15 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_35 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

//	val uri1 = "maxcdn.bootstrapcdn.com"
//	val uri2 = "www.google.com"
//	val uri3 = "fonts.googleapis.com"
	val uri4 = "https://perwww.mygov.scot"


	val browse = group("Homepage") {

		// Homepage
		exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
				.get(uri4 + "/assets/styles/main.2f08972e.css")
				.headers(headers_1),
				http("request_2")
					.get(uri4 + "/assets/images/mygov-logos/mygovscot_195px.png")
					.headers(headers_2),
				http("request_3")
					.get(uri4 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
					.headers(headers_3),
				http("request_4")
					.get(uri4 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
					.headers(headers_3),
				http("request_5")
					.get(uri4 + "/assets/scripts/vendor/responsive.js")
					.headers(headers_3),
				http("request_6")
					.get(uri4 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
					.headers(headers_3),
				http("request_7")
					.get(uri4 + "/assets/scripts/global.9cc41def.js")
					.headers(headers_3),
				http("request_8")
					.get(uri4 + "/assets/scripts/index.b4996494.js")
					.headers(headers_3),
				http("request_9")
					.get(uri4 + "/assets/images/icons/search-white_@2x.png")
					.headers(headers_2),
				http("request_10")
					.get(uri4 + "/assets/images/mygov-logos/govscot_165px.png")
					.headers(headers_2),
				http("request_11")
					.get(uri4 + "/assets/images/icons/notification_close_grey.png")
					.headers(headers_2),
				http("request_12")
					.get(uri4 + "/assets/images/icons/notification_close_white.png")
					.headers(headers_2),
				http("request_13")
					.get(uri4 + "/assets/images/icons/arrows/int_arrow_right_42px.png")
					.headers(headers_2),
				http("request_14")
					.get(uri4 + "/assets/images/icons/arrows/int_arrow_right_70px.png")
					.headers(headers_2)))


	}

		.pause(13)
		// Search for a content item
	//		  .feed(feeder)
		.group("Search for Bank Holidays"){

		exec(http("request_15")
			.get("/service/search/ac?q=ban")
			.headers(headers_15)
			.resources(http("request_16")
				.get(uri4 + "/service/search/ac?q=bank")
				.headers(headers_15),
				http("request_17")
					.get(uri4 + "/service/search/ac?q=bank+ho")
					.headers(headers_15),
				http("request_18")
					.get(uri4 + "/service/search/ac?q=bank+holid")
					.headers(headers_15),
				http("request_19")
					.get(uri4 + "/service/search/ac?q=bank+holida")
					.headers(headers_15),
				http("request_20")
					.get(uri4 + "/service/search/ac?q=bank+holiday")
					.headers(headers_15),
				http("request_21")
					.get(uri4 + "/service/search/ac?q=bank+holidays")
					.headers(headers_15),
				http("request_22")
					.get(uri4 + "/search/?q=bank+holidays&cat=sitesearch")
					.headers(headers_0),
				http("request_23")
					.get(uri4 + "/assets/styles/main.2f08972e.css")
					.headers(headers_1),
				http("request_24")
					.get(uri4 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
					.headers(headers_3),
				http("request_25")
					.get(uri4 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
					.headers(headers_3),
				http("request_26")
					.get(uri4 + "/assets/scripts/vendor/responsive.js")
					.headers(headers_3),
				http("request_27")
					.get(uri4 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
					.headers(headers_3),
				http("request_28")
					.get(uri4 + "/assets/scripts/global.9cc41def.js")
					.headers(headers_3),
				http("request_29")
					.get(uri4 + "/assets/scripts/search.75ae322d.js")
					.headers(headers_3),
				http("request_30")
					.get(uri4 + "/assets/images/mygov-logos/mygovscot_195px.png")
					.headers(headers_2),
				http("request_31")
					.get(uri4 + "/assets/images/icons/search-white_@2x.png")
					.headers(headers_2),
				http("request_32")
					.get(uri4 + "/assets/images/mygov-logos/govscot_165px.png")
					.headers(headers_2),
				http("request_33")
					.get(uri4 + "/assets/images/icons/notification_close_grey.png")
					.headers(headers_2),
				http("request_34")
					.get(uri4 + "/assets/images/icons/notification_close_white.png")
					.headers(headers_2),
				http("request_35")
					.get(uri4 + "/service/search/direct/?didyoumean=true&q=bank+holidays&from=0&size=10")
					.headers(headers_35),
				http("request_36")
					.get(uri4 + "/assets/images/async/ajax-loader-white.gif")
					.headers(headers_2)))


	}

		.pause(8)
		// Launch bank holidays page
		  .group("Navigate to Bank holidays page ") {

		  exec(

				exec(http("request_37")
					.get("/scotland-bank-holidays/")
					.headers(headers_0)
					.resources(http("request_38")
						.get(uri4 + "/assets/images/icons/notification_close_grey.png")
						.headers(headers_2),
						http("request_39")
							.get(uri4 + "/assets/images/icons/notification_close_white.png")
							.headers(headers_2),
						http("request_40")
							.get(uri4 + "/assets/images/icons/arrows/ext_arrow_text_17px_white.png")
							.headers(headers_2),
						http("request_41")
							.get(uri4 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
							.headers(headers_2),
						http("request_42")
							.get(uri4 + "/assets/images/icons/arrows/int_arrow_up_70px.png")
							.headers(headers_2))))


	}


}