package org.govscot.website

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import util.Environment

object Search  {

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

	val headers_4 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_35 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val uri1 =  Environment.baseURL
	val feeder = csv("govscotSearchTerms.csv").random

	val browse = group("Homepage") {
		// Launch Homepage
				exec(http("request_0")
					.get("/")
					.headers(headers_0)
					.resources(http("request_1")
						.get(uri1 + "/assets/styles/main.c8140e68.css")
						.headers(headers_1),
						http("request_2")
							.get(uri1 + "/assets/scripts/vendor/jquery.min.js")
							.headers(headers_2),
						http("request_3")
							.get(uri1 + "/assets/scripts/global.d1a16f50.js")
							.headers(headers_2),
						http("request_4")
							.get(uri1 + "/assets/images/logos/scotgovlogo.png")
							.headers(headers_4),
						http("request_5")
							.get(uri1 + "/assets/scripts/home.0cb35b08.js")
							.headers(headers_2),
						http("request_6")
							.get(uri1 + "/images/carousel/full/education.jpg")
							.headers(headers_4),
						http("request_7")
							.get(uri1 + "/images/carousel/full/europe.jpg")
							.headers(headers_4),
						http("request_8")
							.get(uri1 + "/assets/images/icons/arrows/small_arrow_right.png")
							.headers(headers_4),
						http("request_9")
							.get(uri1 + "/assets/images/icons/search-white.png")
							.headers(headers_4),
						http("request_10")
							.get(uri1 + "/assets/images/icons/close_quote_42.png")
							.headers(headers_4),
						http("request_11")
							.get(uri1 + "/images/carousel/full/baby-box-beta.jpg")
							.headers(headers_4),
						http("request_12")
							.get(uri1 + "/assets/images/people/first_minister_home_mob.jpg")
							.headers(headers_4),
						http("request_13")
							.get(uri1 + "/assets/images/people/first_minister_home_768.jpg")
							.headers(headers_4),
						http("request_14")
							.get(uri1 + "/assets/images/people/first_minister_home_1024.jpg")
							.headers(headers_4),
						http("request_15")
							.get(uri1 + "/assets/images/people/first_minister_home_hd.jpg")
							.headers(headers_4),
						http("request_16")
							.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
							.headers(headers_4),
						http("request_17")
							.get(uri1 + "/assets/images/icons/close-white.png")
							.headers(headers_4),
						http("request_18")
							.get(uri1 + "/assets/images/icons/search-grey.png")
							.headers(headers_4),
						http("request_19")
							.get(uri1 + "/assets/images/icons/publication_desktop.png")
							.headers(headers_4),
						http("request_20")
							.get(uri1 + "/assets/images/icons/consultation_desktop.png")
							.headers(headers_4),
						http("request_21")
							.get(uri1 + "/assets/images/icons/social/flickr.png")
							.headers(headers_4),
						http("request_22")
							.get(uri1 + "/assets/images/icons/social/youtube.png")
							.headers(headers_4),
						http("request_23")
							.get(uri1 + "/assets/images/icons/social/twitter.png")
							.headers(headers_4),
						http("request_24")
							.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
							.headers(headers_4)))
					.pause(1)
					.exec(http("request_25")
						.get("/assets/images/icons/youtube-play.png")
						.headers(headers_4))
	}
		.pause(10)
		// Perform site search
		.feed(feeder)
		  .group("Perform Site search") {
				exec(http("request_26")
					.get("/search/?q=${SearchTerm}")
					.headers(headers_0)
					.resources(http("request_27")
						.get(uri1 + "/assets/styles/main.c8140e68.css")
						.headers(headers_1),
						http("request_28")
							.get(uri1 + "/assets/scripts/vendor/jquery.min.js")
							.headers(headers_2),
						http("request_29")
							.get(uri1 + "/assets/scripts/global.d1a16f50.js")
							.headers(headers_2),
						http("request_30")
							.get(uri1 + "/assets/scripts/search.20c08522.js")
							.headers(headers_2),
						http("request_31")
							.get(uri1 + "/assets/images/logos/scotgovlogo.png")
							.headers(headers_4),
						http("request_32")
							.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
							.headers(headers_4),
						http("request_33")
							.get(uri1 + "/assets/images/icons/close-white.png")
							.headers(headers_4),
						http("request_34")
							.get(uri1 + "/assets/images/icons/search-white.png")
							.headers(headers_4),
						http("request_35")
							.get(uri1 + "/service/search/direct/?didyoumean=true&q=business&from=0&size=10")
							.headers(headers_35),
						http("request_36")
							.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
							.headers(headers_4)))

	}
		.pause(10)
		// Choose a search result
		  .group("Choose a search result") {
					exec(http("request_37")
						.get("/policies/financial-and-business-services/")
						.headers(headers_0)
						.resources(http("request_38")
							.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
							.headers(headers_4),
							http("request_39")
								.get(uri1 + "/assets/images/icons/close-white.png")
								.headers(headers_4),
							http("request_40")
								.get(uri1 + "/assets/images/icons/search-white.png")
								.headers(headers_4),
							http("request_41")
								.get(uri1 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
								.headers(headers_4),
							http("request_42")
								.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
								.headers(headers_4)))

	}


}