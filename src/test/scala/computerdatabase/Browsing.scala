package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Browsing extends Simulation {

	val httpProtocol = http
		.baseURL("https://pgvwww.beta.gov.scot")
		.disableFollowRedirect
		.inferHtmlResources(BlackList("""https://platform.twitter.com""", """https://farm1.staticflickr.com""", """https://s.ytimg.com/yts""", """https://pbs.twimg.com""", """https://www.google-analytics.com""", """static.doubleclick.net""", """https://syndication.twitter.com""", """https://www.googletagmanager.com/.*""", """https://maxcdn.bootstrapcdn.com""", """https://fonts.gstatic.com""", """https://i.ytimg.com""", """https://www.youtube.com""", """www.google.com""", """farm6.staticflickr.com""", """https://fonts.googleapis.com/css""", """creatingahealthierscotland.files.wordpress.com"""), WhiteList())

	val headers_0 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

    val uri1 = "https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"
    val uri2 = "pgvwww.beta.gov.scot"
    val uri3 = "https://fonts.googleapis.com/css"

	val scn = scenario("Browsing")
		// Launch homepage
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("https://" + uri2 + ":443/assets/images/icons/arrows/int_arrow_left_blue_42px.png"),
            http("request_2")
			.get("https://" + uri2 + ":443/images/carousel/full/europe.jpg"),
            http("request_3")
			.get("https://" + uri2 + ":443/images/carousel/full/beta-web-devices.jpg"),
            http("request_4")
			.get("https://" + uri2 + ":443/assets/images/icons/arrows/int_arrow_right_blue_42px.png"),
            http("request_5")
			.get("https://" + uri2 + ":443/assets/images/icons/consultation_tablet.png"),
            http("request_6")
			.get("https://" + uri2 + ":443/assets/images/icons/publication_tablet.png"),
            http("request_7")
			.get("https://" + uri2 + ":443/assets/images/icons/arrows/small_arrow_right.png"),
            http("request_8")
			.get("https://" + uri2 + ":443/assets/images/icons/social/youtube.png"),
            http("request_9")
			.get("https://" + uri2 + ":443/assets/images/icons/social/flickr.png"),
            http("request_10")
			.get("https://" + uri2 + ":443/assets/images/icons/social/twitter.png"),
            http("request_11")
			.get("https://" + uri2 + ":443/assets/images/icons/close-white.png"),
            http("request_12")
			.get("https://" + uri2 + ":443/assets/images/icons/search-blue.png"),
            http("request_13")
			.get("https://" + uri2 + ":443/assets/images/icons/search-white.png"),
            http("request_14")
			.get("https://" + uri2 + ":443/assets/images/icons/menu.png"),
            http("request_15")
			.get("https://" + uri2 + ":443/assets/images/icons/grey_arrow_up.png")))
		.pause(23)
		// Navigate to About Section
		.exec(http("request_16")
			.get("/assets/images/icons/search-blue-reduced.png")
			.resources(http("request_17")
			.get("https://" + uri2 + ":443/assets/images/icons/menu-reduced.png")))
		.pause(10)
		.exec(http("request_18")
			.get("/about/")
			.headers(headers_0))
		.pause(5)
		.exec(http("request_19")
			.get("/about/how-government-is-run/")
			.headers(headers_0))
		.pause(15)
		// Navigate to Directorates page
		.exec(http("request_20")
			.get("/about/how-government-is-run/directorates/")
			.headers(headers_0)
			.resources(http("request_21")
			.get("https://" + uri2 + ":443/assets/images/icons/arrows/int_arrow_up_70px.png")))
		.pause(3)
		.exec(http("request_22")
			.get("/about/")
			.headers(headers_0))
		.pause(3)
		.exec(http("request_23")
			.get("/about/how-government-is-run/")
			.headers(headers_0))
		.pause(23)
		// Navigate to Permanant Secretary
		.exec(http("request_24")
			.get("/roles/permanent-secretary/")
			.headers(headers_0)
			.check(status.is(404)))
		.pause(5)
		.exec(http("request_25")
			.get("/about/")
			.headers(headers_0))
		.pause(3)
		.exec(http("request_26")
			.get("/about/who-runs-government/")
			.headers(headers_0))
		.pause(5)
		.exec(http("request_27")
			.get("/about/who-runs-government/cabinet-and-ministers/")
			.headers(headers_0)
			.resources(http("request_28")
			.get("https://" + uri2 + ":443/images/portrait_130/square/nicola-sturgeon.jpg"),
            http("request_29")
			.get("https://" + uri2 + ":443/images/portrait_130/square/fergus-ewing.jpg"),
            http("request_30")
			.get("https://" + uri2 + ":443/images/portrait_130/square/keith-brown.jpg"),
            http("request_31")
			.get("https://" + uri2 + ":443/images/portrait_130/square/shona-robison.jpg"),
            http("request_32")
			.get("https://" + uri2 + ":443/images/portrait_130/square/roseanna-cunningham.jpg"),
            http("request_33")
			.get("https://" + uri2 + ":443/assets/images/people/placeholder.png"),
            http("request_34")
			.get("https://" + uri2 + ":443/images/portrait_130/square/joe-fitzpatrick.jpg"),
            http("request_35")
			.get("https://" + uri2 + ":443/images/portrait_130/square/humza-yousaf.jpg"),
            http("request_36")
			.get("https://" + uri2 + ":443/images/portrait_130/square/annabelle-ewing.jpg"),
            http("request_37")
			.get("https://" + uri2 + ":443/images/portrait_130/square/mark-mcdonald.jpg"),
            http("request_38")
			.get("https://" + uri2 + ":443/images/portrait_130/square/shirley-anne-somerville.jpg"),
            http("request_39")
			.get("https://" + uri2 + ":443/images/portrait_130/square/kevin-stewart.jpg"),
            http("request_40")
			.get("https://" + uri2 + ":443/images/portrait_130/square/paul-wheelhouse.jpg"),
            http("request_41")
			.get("https://" + uri2 + ":443/images/portrait_130/square/jamie-hepburn.jpg"),
            http("request_42")
			.get("https://" + uri2 + ":443/images/portrait_130/square/john-swinney.jpg"),
            http("request_43")
			.get("https://" + uri2 + ":443/images/portrait_130/square/michael-matheson.jpg"),
            http("request_44")
			.get("https://" + uri2 + ":443/images/portrait_130/square/fiona-hyslop.jpg"),
            http("request_45")
			.get("https://" + uri2 + ":443/images/portrait_130/square/derek-mackay.jpg"),
            http("request_46")
			.get("https://" + uri2 + ":443/images/portrait_130/square/angela-constance.jpg"),
            http("request_47")
			.get("https://" + uri2 + ":443/images/portrait_130/square/aileen-campbell.jpg"),
            http("request_48")
			.get("https://" + uri2 + ":443/images/portrait_130/square/maureen-watt.jpg"),
            http("request_49")
			.get("https://" + uri2 + ":443/images/portrait_130/square/jeane-freeman.jpg"),
            http("request_50")
			.get("https://" + uri2 + ":443/images/portrait_130/square/alasdair-allan.jpg"),
            http("request_51")
			.get("https://" + uri2 + ":443/images/portrait_130/square/james-wolffe.jpg"),
            http("request_52")
			.get("https://" + uri2 + ":443/images/portrait_130/square/alison-di-rollo.jpg")))
		.pause(9)
		.exec(http("request_53")
			.get("/about/who-runs-government/first-minister/")
			.headers(headers_0)
			.resources(http("request_54")
			.get("https://" + uri2 + ":443/assets/images/people/first_minister_mob.jpg")))
		.pause(2)
		.exec(http("request_55")
			.get("/about/")
			.headers(headers_0))
		.pause(4)
		.exec(http("request_56")
			.get("/about/how-government-is-run/")
			.headers(headers_0))
		.pause(8)
		.exec(http("request_57")
			.get("/about/")
			.headers(headers_0))
		.pause(2)
		.exec(http("request_58")
			.get("/about/what-the-government-does/")
			.headers(headers_0)
			.resources(http("request_59")
			.get("https://" + uri2 + ":443/assets/images/icons/arrows/ext_arrow_text_15px.png")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}