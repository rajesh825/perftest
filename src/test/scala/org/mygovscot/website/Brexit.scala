package org.mygovscot.website

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Brexit  {


	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_2 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_9 = Map("Origin" -> "https://perwww.mygov.scot")

	val headers_13 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_18 = Map(
		"Cache-Control" -> "max-age=0",
		"Origin" -> "https://perwww.mygov.scot")

	val headers_23 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_50 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_67 = Map("Origin" -> "https://www.google.com")

	val headers_69 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
		"Origin" -> "https://www.google.com")

	val headers_70 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/json",
		"Origin" -> "https://perwww.mygov.scot",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val uri3 = "https://perwww.mygov.scot"

//	def nextString(length: Int) = {
//		def safeChar() = {
//			val surrogateStart: Int = 0xD800
//			val res = nextInt(surrogateStart - 1) + 1
//			res.toChar
//		}
//
//		List.fill(length)(safeChar()).mkString
//	}

//	val fakeData = Iterator.continually(
//		Map("companyName" ->  nextString(5),
//			"confirmation" -> nextString(5),
//			"email" -> "test@gov.scot",
//			"enquiry" -> nextString(25),
//			"location" -> "Aberdeen",
//			"name" ->   " ",
//			"sector" -> " ",
//			"telephone" -> " "
//		)
//	)


	//val feeder = csv("govscotSearchTerms.csv").random

	val browse = group("Homepage") {
		// Launch Homepage
		exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(

				http("request_2")
					.get(uri3 + "/assets/styles/main.6c7c2c1e.css")
					.headers(headers_2),
				http("request_3")
					.get(uri3 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
					.headers(headers_3),
				http("request_4")
					.get(uri3 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
					.headers(headers_3),
				http("request_5")
					.get(uri3 + "/assets/scripts/vendor/responsive.js")
					.headers(headers_3),
				http("request_6")
					.get(uri3 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
					.headers(headers_3),
				http("request_7")
					.get(uri3 + "/assets/scripts/global.074063b8.js")
					.headers(headers_3),
				http("request_8")
					.get(uri3 + "/assets/scripts/index.b4996494.js")
					.headers(headers_3),

				http("request_13")
					.get(uri3 + "/assets/images/icons/search-white_@2x.png")
					.headers(headers_13),
				http("request_14")
					.get(uri3 + "/assets/images/icons/arrows/int_arrow_right_42px.png")
					.headers(headers_13),
				http("request_15")
					.get(uri3 + "/assets/images/icons/arrows/int_arrow_right_70px.png")
					.headers(headers_13),

				http("request_19")
					.get(uri3 + "/assets/images/mygov-logos/mygovscot_195px.png")
					.headers(headers_13),
				http("request_20")
					.get(uri3 + "/assets/images/mygov-logos/govscot_165px.png")
					.headers(headers_13),

				http("request_22")
					.get(uri3 + "/assets/images/icons/notification_close_white.png")
					.headers(headers_13)))
	}
		.pause(5)
		// Perform site search

		  .group("Perform Site search") {
				exec(http("request_23")
					.get("/service/search/ac?q=bre")
					.headers(headers_23)
					.resources(http("request_24")
						.get(uri3 + "/service/search/ac?q=brexi")
						.headers(headers_23),
						http("request_25")
							.get(uri3 + "/service/search/ac?q=brexit")
							.headers(headers_23)))

	}
		.pause(5)
		// Launch Brexit form
		  .group("Launch Brexit form") {
		exec(http("request_27")
			.get(uri3 + "/brexit-form/")
			.headers(headers_0)
			.resources(

				http("request_29")
					.get(uri3 + "/assets/styles/main.6c7c2c1e.css")
					.headers(headers_2),
				http("request_30")
					.get(uri3 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
					.headers(headers_3),
				http("request_31")
					.get(uri3 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
					.headers(headers_3),
				http("request_32")
					.get(uri3 + "/assets/scripts/vendor/responsive.js")
					.headers(headers_3),
				http("request_33")
					.get(uri3 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
					.headers(headers_3),
				http("request_34")
					.get(uri3 + "/assets/scripts/global.074063b8.js")
					.headers(headers_3),
				http("request_35")
					.get(uri3 + "/assets/scripts/article.d3ed60e9.js")
					.headers(headers_3),

				http("request_38")
					.get(uri3 + "/assets/images/icons/search-white_@2x.png")
					.headers(headers_13),
				http("request_39")
					.get(uri3 + "/assets/images/mygov-logos/mygovscot_195px.png")
					.headers(headers_13),
				http("request_40")
					.get(uri3 + "/assets/images/mygov-logos/govscot_165px.png")
					.headers(headers_13),
				http("request_41")
					.get(uri3 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
					.headers(headers_13),
				http("request_42")
					.get(uri3 + "/assets/images/icons/arrows/ext_arrow_text_15px.png")
					.headers(headers_13),

				http("request_46")
					.get(uri3 + "/assets/images/icons/notification_close_white.png")
					.headers(headers_13),
				http("request_47")
					.get(uri3 + "/assets/images/icons/arrows/int_arrow_up_70px.png")
					.headers(headers_13)
			))

			.pause(5)
			.group("Submit Brexit Form"){
				exec(http("request_70")
						.post("https://perwww.mygov.scot/service/brexit/submit")
						.headers(headers_70)
						.body(RawFileBody("BrexitForm_0070_request.txt")))
			}





	}


}