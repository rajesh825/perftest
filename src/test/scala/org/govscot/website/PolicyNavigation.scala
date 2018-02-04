package org.govscot.website

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import util.Environment

object PolicyNavigation   {

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

	val headers_3 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_39 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://beta.gov.scot",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val uri1 =  Environment.baseURL

	val feeder = csv("policies.csv").circular

	val browse = group("Homepage"){

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
												.get(uri1 + "/assets/images/logos/scotgovlogo.png")
												.headers(headers_3),
											http("request_4")
												.get(uri1 + "/images/carousel/full/education.jpg")
												.headers(headers_3),
											http("request_5")
												.get(uri1 + "/images/carousel/full/europe.jpg")
												.headers(headers_3),
											http("request_6")
												.get(uri1 + "/assets/scripts/global.d1a16f50.js")
												.headers(headers_2),
											http("request_7")
												.get(uri1 + "/assets/scripts/home.0cb35b08.js")
												.headers(headers_2),
											http("request_8")
												.get(uri1 + "/images/carousel/full/baby-box-beta.jpg")
												.headers(headers_3),
											http("request_9")
												.get(uri1 + "/assets/images/people/first_minister_home_mob.jpg")
												.headers(headers_3),
											http("request_10")
												.get(uri1 + "/assets/images/icons/arrows/small_arrow_right.png")
												.headers(headers_3),
											http("request_11")
												.get(uri1 + "/assets/images/icons/search-white.png")
												.headers(headers_3),
											http("request_12")
												.get(uri1 + "/assets/images/icons/close_quote_42.png")
												.headers(headers_3),
											http("request_13")
												.get(uri1 + "/assets/images/people/first_minister_home_768.jpg")
												.headers(headers_3),
											http("request_14")
												.get(uri1 + "/assets/images/people/first_minister_home_1024.jpg")
												.headers(headers_3),
											http("request_15")
												.get(uri1 + "/assets/images/people/first_minister_home_hd.jpg")
												.headers(headers_3),
											http("request_16")
												.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
												.headers(headers_3),
											http("request_17")
												.get(uri1 + "/assets/images/icons/close-white.png")
												.headers(headers_3),
											http("request_18")
												.get(uri1 + "/assets/images/icons/search-grey.png")
												.headers(headers_3),
											http("request_19")
												.get(uri1 + "/assets/images/icons/publication_desktop.png")
												.headers(headers_3),
											http("request_20")
												.get(uri1 + "/assets/images/icons/consultation_desktop.png")
												.headers(headers_3),
											http("request_21")
												.get(uri1 + "/assets/images/icons/social/flickr.png")
												.headers(headers_3),
											http("request_22")
												.get(uri1 + "/assets/images/icons/social/youtube.png")
												.headers(headers_3),
											http("request_23")
												.get(uri1 + "/assets/images/icons/social/twitter.png")
												.headers(headers_3),
											http("request_24")
												.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
												.headers(headers_3)))
										.pause(1)
										.exec(http("request_25")
											.get("/assets/images/icons/youtube-play.png")
											.headers(headers_3))


	              }

		.pause(17)


		// Navigate to Policies Landing page

		  .group("Navigate to Policy Landing page"){

					exec(http("request_26")
						.get("/policies/")
						.headers(headers_0)
						.resources(http("request_27")
							.get("/assets/styles/main.c8140e68.css")
							.headers(headers_1)
							.resources(http("request_28")
								.get(uri1 + "/assets/scripts/vendor/jquery.min.js")
								.headers(headers_2),
								http("request_29")
									.get(uri1 + "/assets/images/logos/scotgovlogo.png")
									.headers(headers_3),
								http("request_30")
									.get(uri1 + "/assets/scripts/global.d1a16f50.js")
									.headers(headers_2),
								http("request_31")
									.get(uri1 + "/assets/scripts/policy-landing-page.0f951947.js")
									.headers(headers_2),
								http("request_32")
									.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
									.headers(headers_3),
								http("request_33")
									.get(uri1 + "/assets/images/icons/close-white.png")
									.headers(headers_3),
								http("request_34")
									.get(uri1 + "/assets/images/icons/search-white.png")
									.headers(headers_3),
								http("request_35")
									.get(uri1 + "/assets/images/icons/close-grey.png")
									.headers(headers_3),
								http("request_36")
									.get(uri1 + "/assets/images/icons/search-grey.png")
									.headers(headers_3),
								http("request_37")
									.get(uri1 + "/assets/images/icons/arrows/int_arrow_up_blue_35px.png")
									.headers(headers_3),
								http("request_38")
									.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
									.headers(headers_3),
								http("request_39")
									.post( "/service/search/policy?sort=title.sortable:asc&from=0&size=10")
									.headers(headers_39)
									.body(RawFileBody("PolicySimulation_0039_request.txt")))))

		}

		.pause(5)

		//Choose a policy
		.feed(feeder)
		.group("Choose a policy") {

						exec(http("request_40")
						//	.get("/policies/building-standards/")
							.get("${policies}")
							.headers(headers_0)
							.resources(http("request_41")
								.get(uri1 + "/assets/styles/main.c8140e68.css")
								.headers(headers_1),
								http("request_42")
									.get(uri1 + "/assets/scripts/vendor/jquery.min.js")
									.headers(headers_2),
								http("request_43")
									.get(uri1 + "/assets/images/logos/scotgovlogo.png")
									.headers(headers_3),
								http("request_44")
									.get(uri1 + "/assets/scripts/global.d1a16f50.js")
									.headers(headers_2),
								http("request_45")
									.get(uri1 + "/assets/scripts/policy.77c940c1.js")
									.headers(headers_2),
								http("request_46")
									.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
									.headers(headers_3),
								http("request_47")
									.get(uri1 + "/assets/images/icons/close-white.png")
									.headers(headers_3),
								http("request_48")
									.get(uri1 + "/assets/images/icons/search-white.png")
									.headers(headers_3),
								http("request_49")
									.get(uri1 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
									.headers(headers_3),
								http("request_50")
									.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
									.headers(headers_3)))

							.pause(2)
							.exec(http("request_65")
								.post("/service/search/policy?sort=title.sortable:asc&from=0&size=10")
								.headers(headers_39)
								.body(RawFileBody("PolicySimulation_0065_request.txt")))
		}

		//Navigate Back to Policy Landing page
		   .group("Navigate Back to Policy landing page"){

						exec(http("request_51")
							.get("/policies/")
							.headers(headers_0)
							.resources(http("request_52")
								.get(uri1 + "/assets/styles/main.c8140e68.css")
								.headers(headers_1),
								http("request_53")
									.get(uri1 + "/assets/scripts/vendor/jquery.min.js")
									.headers(headers_2),
								http("request_54")
									.get(uri1 + "/assets/scripts/global.d1a16f50.js")
									.headers(headers_2),
								http("request_55")
									.get(uri1 + "/assets/images/logos/scotgovlogo.png")
									.headers(headers_3),
								http("request_56")
									.get(uri1 + "/assets/scripts/policy-landing-page.0f951947.js")
									.headers(headers_2),
								http("request_57")
									.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
									.headers(headers_3),
								http("request_58")
									.get(uri1 + "/assets/images/icons/close-white.png")
									.headers(headers_3),
								http("request_59")
									.get(uri1 + "/assets/images/icons/search-white.png")
									.headers(headers_3),
								http("request_60")
									.get(uri1 + "/assets/images/icons/search-grey.png")
									.headers(headers_3),
								http("request_61")
									.get(uri1 + "/assets/images/icons/arrows/int_arrow_up_blue_35px.png")
									.headers(headers_3),
								http("request_62")
									.get(uri1 + "/assets/images/icons/close-grey.png")
									.headers(headers_3),
								http("request_63")
									.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
									.headers(headers_3),
								http("request_64")
									.post( "/service/search/policy?sort=title.sortable:asc&from=0&size=10")
									.headers(headers_39)
									.body(RawFileBody("PolicySimulation_0064_request.txt"))))

			}

		// Choose Policy Filters for Topics
		  .group("Choose Policy Filters for topics"){

				exec(http("request_65")
					.post("/service/search/policy?sort=title.sortable:asc&from=0&size=10")
					.headers(headers_39)
					.body(RawFileBody("PolicySimulation_0065_request.txt")))

		}

		.pause(5)


		// Choose a Policy
		.feed(feeder)
		  .group("Choose a policy"){

				exec(http("request_66")
					.get("${policies}")
					.headers(headers_0)
					.resources(http("request_67")
						.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
						.headers(headers_3),
						http("request_68")
							.get(uri1 + "/assets/images/icons/close-white.png")
							.headers(headers_3),
						http("request_69")
							.get(uri1 + "/assets/images/icons/search-white.png")
							.headers(headers_3),
						http("request_70")
							.get(uri1 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
							.headers(headers_3),
						http("request_71")
							.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
							.headers(headers_3)))


	}

		  .pause(5)
		.feed(feeder)
		  .group("Navigate to policy latest section") {
				exec(http("request_27")
					.get("${latest}")
					.headers(headers_0))


			}




}