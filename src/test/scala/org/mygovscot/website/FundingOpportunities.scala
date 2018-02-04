package org.mygovscot.website

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object FundingOpportunities  {

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

	val headers_61 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://perwww.mygov.scot",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")


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
					.get(uri4 + "/assets/scripts/global.9cc41def.js")
					.headers(headers_2),
				http("request_7")
					.get(uri4 + "/assets/scripts/index.b4996494.js")
					.headers(headers_2),
				http("request_8")
					.get(uri4 + "/assets/images/icons/arrows/int_arrow_right_42px.png")
					.headers(headers_8),
				http("request_9")
					.get(uri4 + "/assets/images/icons/arrows/int_arrow_right_70px.png")
					.headers(headers_8),
				http("request_10")
					.get(uri4 + "/assets/images/icons/search-white_@2x.png")
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
	}
		.pause(18)
		// Navigate to Business

		  .group("Navigate to Cateogry List - Business ") {
		exec(http("request_15")
			.get("/business/")
			.headers(headers_0)
			.resources(http("request_16")
				.get(uri4 + "/assets/styles/main.2f08972e.css")
				.headers(headers_1),
				http("request_17")
					.get(uri4 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
					.headers(headers_2),
				http("request_18")
					.get(uri4 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
					.headers(headers_2),
				http("request_19")
					.get(uri4 + "/assets/scripts/vendor/responsive.js")
					.headers(headers_2),
				http("request_20")
					.get(uri4 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
					.headers(headers_2),
				http("request_21")
					.get(uri4 + "/assets/scripts/global.9cc41def.js")
					.headers(headers_2),
				http("request_22")
					.get(uri4 + "/assets/scripts/categories.75cdb5aa.js")
					.headers(headers_2),
				http("request_23")
					.get(uri4 + "/assets/images/mygov-logos/mygovscot_195px.png")
					.headers(headers_8),
				http("request_24")
					.get(uri4 + "/assets/images/icons/search-white_@2x.png")
					.headers(headers_8),
				http("request_25")
					.get(uri4 + "/assets/images/mygov-logos/govscot_165px.png")
					.headers(headers_8),
				http("request_26")
					.get(uri4 + "/assets/images/icons/notification_close_grey.png")
					.headers(headers_8),
				http("request_27")
					.get(uri4 + "/assets/images/icons/notification_close_white.png")
					.headers(headers_8),
				http("request_28")
					.get(uri4 + "/assets/images/icons/arrows/int_arrow_up_70px.png")
					.headers(headers_8)))

	}
		.pause(29)
		// Navigate to Funding and Grants
		  .group("Navigate to Category List - Funding and Grants") {


		exec(http("request_29")
			.get("/business/funding-and-grants/")
			.headers(headers_0)
			.resources(http("request_30")
				.get(uri4 + "/assets/styles/main.2f08972e.css")
				.headers(headers_1),
				http("request_31")
					.get(uri4 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
					.headers(headers_2),
				http("request_32")
					.get(uri4 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
					.headers(headers_2),
				http("request_33")
					.get(uri4 + "/assets/scripts/vendor/responsive.js")
					.headers(headers_2),
				http("request_34")
					.get(uri4 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
					.headers(headers_2),
				http("request_35")
					.get(uri4 + "/assets/scripts/global.9cc41def.js")
					.headers(headers_2),
				http("request_36")
					.get(uri4 + "/assets/scripts/categories.75cdb5aa.js")
					.headers(headers_2),
				http("request_37")
					.get(uri4 + "/assets/images/mygov-logos/mygovscot_195px.png")
					.headers(headers_8),
				http("request_38")
					.get(uri4 + "/assets/images/icons/search-white_@2x.png")
					.headers(headers_8),
				http("request_39")
					.get(uri4 + "/assets/images/mygov-logos/govscot_165px.png")
					.headers(headers_8),
				http("request_40")
					.get(uri4 + "/assets/images/icons/notification_close_grey.png")
					.headers(headers_8),
				http("request_41")
					.get(uri4 + "/assets/images/icons/notification_close_white.png")
					.headers(headers_8),
				http("request_42")
					.get(uri4 + "/assets/images/icons/arrows/int_arrow_up_70px.png")
					.headers(headers_8)))

	}
		.pause(13)
		// Navigate to Funding Opportunities
		  .group("Launch Funding Opporutinities") {
		exec(http("request_43")
			.get("/funding-opportunities/")
			.headers(headers_0)
			.resources(http("request_44")
				.get(uri4 + "/assets/styles/main.2f08972e.css")
				.headers(headers_1),
				http("request_45")
					.get(uri4 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
					.headers(headers_2),
				http("request_46")
					.get(uri4 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
					.headers(headers_2),
				http("request_47")
					.get(uri4 + "/assets/scripts/vendor/responsive.js")
					.headers(headers_2),
				http("request_48")
					.get(uri4 + "/assets/scripts/vendor/ie10-viewport-bug-workaround.js")
					.headers(headers_2),
				http("request_49")
					.get(uri4 + "/assets/scripts/global.9cc41def.js")
					.headers(headers_2),
				http("request_50")
					.get(uri4 + "/assets/scripts/funding-list.c629e684.js")
					.headers(headers_2),
				http("request_51")
					.get(uri4 + "/assets/images/mygov-logos/mygovscot_195px.png")
					.headers(headers_8),
				http("request_52")
					.get(uri4 + "/assets/images/icons/search-white_@2x.png")
					.headers(headers_8),
				http("request_53")
					.get(uri4 + "/assets/images/mygov-logos/govscot_165px.png")
					.headers(headers_8),
				http("request_54")
					.get(uri4 + "/assets/images/icons/note.png")
					.headers(headers_8),
				http("request_55")
					.get(uri4 + "/assets/images/icons/notification_close_grey.png")
					.headers(headers_8),
				http("request_56")
					.get(uri4 + "/assets/images/icons/notification_close_white.png")
					.headers(headers_8),
				http("request_57")
					.get(uri4 + "/assets/images/icons/search.png")
					.headers(headers_8),
				http("request_58")
					.get(uri4 + "/assets/images/icons/checkbox.png")
					.headers(headers_8),
				http("request_59")
					.get(uri4 + "/assets/images/icons/info.png")
					.headers(headers_8),
				http("request_60")
					.get(uri4 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
					.headers(headers_8),
				http("request_61")
					.post( "/service/search/funding_opportunity?sort=title:ASC,fundingModified:DESC&from=0&size=10")
					.headers(headers_61)
					.body(RawFileBody("fundingSimulation_0061_request.txt")),
				http("request_62")
					.get(uri4 + "/assets/images/async/ajax-loader-white.gif")
					.headers(headers_8)))

	}
		.pause(5)
		// Enable Secotr Filter in Funding Opportunities

  .group("Fudning Opporutnities - Filter by Sector"){

            exec(http("request_88")
            .post("/service/search/funding_opportunity?sort=title:ASC,fundingModified:DESC&from=0&size=10")

            )

	}

		.pause(7)

		  .group("Launch a Funding Opportunity"){

				exec(http("request_63")
					.get("/hsbc-10-billion-lending-fund/")
					.headers(headers_0)
					.resources(http("request_64")
						.get(uri4 + "/assets/images/icons/notification_close_grey.png")
						.headers(headers_8),
						http("request_65")
							.get(uri4 + "/assets/images/icons/notification_close_white.png")
							.headers(headers_8),
						http("request_66")
							.get(uri4 + "/assets/images/icons/arrows/ext_arrow_text_17px_white.png")
							.headers(headers_8),
						http("request_67")
							.get(uri4 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
							.headers(headers_8)))

			}

}