//package computerdatabase
//
//import scala.concurrent.duration._
//
//import io.gatling.core.Predef._
//import io.gatling.http.Predef._
//import io.gatling.jdbc.Predef._
//
//class Search extends Simulation {
//
//	val httpProtocol = http
//		.baseURL("https://pgvwww.beta.gov.scot")
//		.disableFollowRedirect
//		.inferHtmlResources(BlackList("""https://platform.twitter.com""", """https://farm1.staticflickr.com""", """https://s.ytimg.com/yts""", """https://pbs.twimg.com""", """https://www.google-analytics.com""", """static.doubleclick.net""", """https://syndication.twitter.com""", """https://www.googletagmanager.com/.*""", """https://maxcdn.bootstrapcdn.com""", """https://fonts.gstatic.com""", """https://i.ytimg.com""", """https://www.youtube.com""", """www.google.com""", """farm6.staticflickr.com""", """https://fonts.googleapis.com/css""", """creatingahealthierscotland.files.wordpress.com"""), WhiteList())
//
//	val headers_0 = Map(
//		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
//		"Accept-Encoding" -> "gzip, deflate")
//
//	val headers_1 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
//
//	val headers_2 = Map("Accept" -> "text/css,*/*;q=0.1")
//
//	val headers_4 = Map("Accept" -> "*/*")
//
//	val headers_55 = Map(
//		"Accept" -> "application/json, text/javascript, */*; q=0.01",
//		"X-Requested-With" -> "XMLHttpRequest")
//
//    val uri1 = "https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"
//    val uri2 = "https://pgvwww.beta.gov.scot:443"
//    val uri3 = "pgvwww.beta.gov.scot"
//    val uri4 = "https://fonts.googleapis.com/css"
//
//	val scn = scenario("Search")
//		// Homepage
//		.exec(http("request_0")
//			.get("http://" + uri3 + "/")
//			.headers(headers_0)
//			.resources(http("request_1")
//			.get(uri2 + "/")
//			.headers(headers_1),
//            http("request_2")
//			.get(uri2 + "/assets/styles/main.css")
//			.headers(headers_2),
//            http("request_3")
//			.get(uri2 + "/assets/scripts/vendor/jquery-ui/jquery-ui.min.css")
//			.headers(headers_2),
//            http("request_4")
//			.get(uri2 + "/assets/scripts/vendor/require.js")
//			.headers(headers_4),
//            http("request_5")
//			.get(uri2 + "/assets/scripts/vendor/jquery.min.js")
//			.headers(headers_4),
//            http("request_6")
//			.get(uri2 + "/assets/scripts/vendor/jquery-ui/jquery-ui.min.js")
//			.headers(headers_4),
//            http("request_7")
//			.get(uri2 + "/assets/images/logos/scotgovlogo.png"),
//            http("request_8")
//			.get(uri2 + "/assets/images/people/first_minister_home_768.jpg"),
//            http("request_9")
//			.get(uri2 + "/assets/images/icons/grey_arrow_down.png"),
//            http("request_10")
//			.get(uri2 + "/assets/scripts/main.js")
//			.headers(headers_4),
//            http("request_11")
//			.get(uri2 + "/assets/images/people/first_minister_home_mob.jpg"),
//            http("request_12")
//			.get(uri2 + "/assets/images/icons/search-blue.png"),
//            http("request_13")
//			.get(uri2 + "/assets/images/icons/close-white.png"),
//            http("request_14")
//			.get(uri2 + "/assets/images/icons/menu.png"),
//            http("request_15")
//			.get(uri2 + "/images/carousel/full/fm-meets-pm.jpg"),
//            http("request_16")
//			.get(uri2 + "/assets/scripts/govscot/format.home.js")
//			.headers(headers_4),
//            http("request_17")
//			.get(uri2 + "/images/carousel/full/beta-web-devices.jpg"),
//            http("request_18")
//			.get(uri2 + "/assets/images/icons/search-white.png"),
//            http("request_19")
//			.get(uri2 + "/assets/scripts/govscot/global.js")
//			.headers(headers_4),
//            http("request_20")
//			.get(uri2 + "/assets/images/icons/arrows/int_arrow_left_blue_42px.png"),
//            http("request_21")
//			.get(uri2 + "/assets/images/icons/arrows/int_arrow_right_blue_42px.png"),
//            http("request_22")
//			.get(uri2 + "/assets/images/icons/publication_tablet.png"),
//            http("request_23")
//			.get(uri2 + "/assets/images/icons/search-grey.png"),
//            http("request_24")
//			.get(uri2 + "/assets/scripts/vendor/jquery.dotdotdot.min.js")
//			.headers(headers_4),
//            http("request_25")
//			.get(uri2 + "/assets/scripts/govscot/component.expand.js")
//			.headers(headers_4),
//            http("request_26")
//			.get(uri2 + "/assets/scripts/govscot/component.carousel.js")
//			.headers(headers_4),
//            http("request_27")
//			.get(uri2 + "/assets/scripts/govscot/cookie.js")
//			.headers(headers_4),
//            http("request_28")
//			.get(uri2 + "/assets/scripts/govscot/component.feedback.js")
//			.headers(headers_4),
//            http("request_29")
//			.get(uri2 + "/assets/images/icons/arrows/small_arrow_right.png"),
//            http("request_30")
//			.get(uri2 + "/assets/scripts/vendor/q.js")
//			.headers(headers_4),
//            http("request_31")
//			.get(uri2 + "/assets/images/icons/consultation_tablet.png"),
//            http("request_32")
//			.get(uri2 + "/assets/images/icons/social/youtube.png"),
//            http("request_33")
//			.get(uri2 + "/assets/images/icons/social/flickr.png"),
//            http("request_34")
//			.get(uri2 + "/assets/images/icons/social/twitter.png"),
//            http("request_35")
//			.get(uri2 + "/assets/images/people/first_minister_home_1024.jpg"),
//            http("request_36")
//			.get(uri2 + "/assets/images/people/first_minister_home_hd.jpg"),
//            http("request_37")
//			.get(uri2 + "/assets/scripts/vendor/hammer.js")
//			.headers(headers_4),
//            http("request_38")
//			.get(uri2 + "/assets/images/icons/grey_arrow_up.png"),
//            http("request_39")
//			.get(uri2 + "/assets/images/icons/menu-reduced.png"),
//            http("request_40")
//			.get(uri2 + "/assets/images/icons/search-blue-reduced.png"))
//			.check(status.is(301)))
//		.pause(2)
//		.exec(http("request_41")
//			.get("/assets/images/icons/close-blue.png"))
//		.pause(28)
//		// Perform Site search
//		.exec(http("request_42")
//			.get("/search/?q=business")
//			.headers(headers_1)
//			.resources(http("request_43")
//			.get(uri2 + "/assets/scripts/govscot/format.search.js")
//			.headers(headers_4),
//            http("request_44")
//			.get(uri2 + "/assets/scripts/utils/gup.js")
//			.headers(headers_4),
//            http("request_45")
//			.get(uri2 + "/assets/scripts/utils/ajax.js")
//			.headers(headers_4),
//            http("request_46")
//			.get(uri2 + "/assets/scripts/govscot/paginator.js")
//			.headers(headers_4),
//            http("request_47")
//			.get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs.js")
//			.headers(headers_4),
//            http("request_48")
//			.get(uri2 + "/assets/scripts/govscot/pubsub.js")
//			.headers(headers_4),
//            http("request_49")
//			.get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs/i18nprecompile.js")
//			.headers(headers_4),
//            http("request_50")
//			.get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs/json2.js")
//			.headers(headers_4),
//            http("request_51")
//			.get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs/underscore.js")
//			.headers(headers_4),
//            http("request_52")
//			.get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs/handlebars.js")
//			.headers(headers_4),
//            http("request_53")
//			.get(uri2 + "/assets/scripts/templates/search-results-items.hbs")
//			.headers(headers_1),
//            http("request_54")
//			.get(uri2 + "/assets/scripts/templates/did-you-mean.hbs")
//			.headers(headers_1),
//            http("request_55")
//			.get(uri2 + "/service/search/direct/?fuzzy=true&didyoumean=true&q=business&from=0&size=10")
//			.headers(headers_55)))
//		.pause(19)
//		// Choose a Search Results
//		.exec(http("request_56")
//			.get("/news/the-education-business/")
//			.headers(headers_1)
//			.resources(http("request_57")
//			.get(uri2 + "/assets/scripts/govscot/format.default.js")
//			.headers(headers_4)))
//
//	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
//}