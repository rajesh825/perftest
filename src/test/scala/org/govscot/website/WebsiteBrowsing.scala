package org.govscot.website

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import util.Environment

object WebsiteBrowsing  {

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


	val uri1 = Environment.baseURL


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
												.get(uri1 + "/assets/images/logos/scotgovlogo.png")
												.headers(headers_3),
											http("request_4")
												.get(uri1 + "/assets/scripts/global.d1a16f50.js")
												.headers(headers_2),
											http("request_5")
												.get(uri1 + "/assets/scripts/home.0cb35b08.js")
												.headers(headers_2),
											http("request_6")
												.get(uri1 + "/images/carousel/full/education.jpg")
												.headers(headers_3),
											http("request_7")
												.get(uri1 + "/images/carousel/full/europe.jpg")
												.headers(headers_3),
											http("request_8")
												.get(uri1 + "/assets/images/icons/arrows/small_arrow_right.png")
												.headers(headers_3),
											http("request_9")
												.get(uri1 + "/assets/images/icons/search-white.png")
												.headers(headers_3),
											http("request_10")
												.get(uri1 + "/assets/images/icons/close_quote_42.png")
												.headers(headers_3),
											http("request_11")
												.get(uri1 + "/images/carousel/full/baby-box-beta.jpg")
												.headers(headers_3),
											http("request_12")
												.get(uri1 + "/assets/images/people/first_minister_home_mob.jpg")
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
		.pause(10)
		.group("Navigate to About Section") {

			exec(http("request_26")
				.get("/about/")
				.headers(headers_0)
				.resources(http("request_27")
					.get(uri1 + "/assets/styles/main.c8140e68.css")
					.headers(headers_1),
					http("request_28")
						.get(uri1 + "/assets/scripts/vendor/jquery.min.js")
						.headers(headers_2),
					http("request_29")
						.get(uri1 + "/assets/images/logos/scotgovlogo.png")
						.headers(headers_3),
					http("request_30")
						.get(uri1 + "/assets/scripts/global.d1a16f50.js")
						.headers(headers_2),
					http("request_31")
						.get(uri1 + "/assets/scripts/default.03a57364.js")
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
						.get(uri1 + "/assets/images/icons/note.png")
						.headers(headers_3),
					http("request_36")
						.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
						.headers(headers_3)))

		}
		  .pause(10)


		  .group("Navigate to Cabinet and Ministers") {
				exec(http("request_37")
					.get("/about/who-runs-government/cabinet-and-ministers/")
					.headers(headers_0)
					.resources(http("request_38")
						.get(uri1 + "/assets/styles/main.c8140e68.css")
						.headers(headers_1),
						http("request_39")
							.get(uri1 + "/assets/scripts/vendor/jquery.min.js")
							.headers(headers_2),
						http("request_40")
							.get(uri1 + "/assets/scripts/global.d1a16f50.js")
							.headers(headers_2),
						http("request_41")
							.get(uri1 + "/assets/images/logos/scotgovlogo.png")
							.headers(headers_3),
						http("request_42")
							.get(uri1 + "/images/portrait_263/square/nicola-sturgeon.jpg")
							.headers(headers_3),
						http("request_43")
							.get(uri1 + "/images/portrait_263/square/john-swinney.jpg")
							.headers(headers_3),
						http("request_44")
							.get(uri1 + "/assets/scripts/default.03a57364.js")
							.headers(headers_2),
						http("request_45")
							.get(uri1 + "/images/portrait_263/square/michael-matheson.jpg")
							.headers(headers_3),
						http("request_46")
							.get(uri1 + "/images/portrait_263/square/angela-constance.jpg")
							.headers(headers_3),
						http("request_47")
							.get(uri1 + "/images/portrait_263/square/fiona-hyslop.jpg")
							.headers(headers_3),
						http("request_48")
							.get(uri1 + "/images/portrait_263/square/derek-mackay.jpg")
							.headers(headers_3),
						http("request_49")
							.get(uri1 + "/images/portrait_263/square/shona-robison.jpg")
							.headers(headers_3),
						http("request_50")
							.get(uri1 + "/assets/images/people/placeholder.png")
							.headers(headers_3),
						http("request_51")
							.get(uri1 + "/assets/images/icons/search-white.png")
							.headers(headers_3),
						http("request_52")
							.get(uri1 + "/images/portrait_263/square/keith-brown.jpg")
							.headers(headers_3),
						http("request_53")
							.get(uri1 + "/images/portrait_263/square/roseanna-cunningham.jpg")
							.headers(headers_3),
						http("request_54")
							.get(uri1 + "/images/portrait_263/square/fergus-ewing.jpg")
							.headers(headers_3),
						http("request_55")
							.get(uri1 + "/images/portrait_263/square/joe-fitzpatrick.jpg")
							.headers(headers_3),
						http("request_56")
							.get(uri1 + "/images/portrait_263/square/humza-yousaf.jpg")
							.headers(headers_3),
						http("request_57")
							.get(uri1 + "/images/portrait_263/square/annabelle-ewing.jpg")
							.headers(headers_3),
						http("request_58")
							.get(uri1 + "/images/portrait_263/square/mark-mcdonald.jpg")
							.headers(headers_3),
						http("request_59")
							.get(uri1 + "/images/portrait_263/square/shirley-anne-somerville.jpg")
							.headers(headers_3),
						http("request_60")
							.get(uri1 + "/images/portrait_263/square/kevin-stewart.jpg")
							.headers(headers_3),
						http("request_61")
							.get(uri1 + "/images/portrait_263/square/paul-wheelhouse.jpg")
							.headers(headers_3),
						http("request_62")
							.get(uri1 + "/images/portrait_263/square/jamie-hepburn.jpg")
							.headers(headers_3),
						http("request_63")
							.get(uri1 + "/images/portrait_263/square/aileen-campbell.jpg")
							.headers(headers_3),
						http("request_64")
							.get(uri1 + "/images/portrait_263/square/maureen-watt.jpg")
							.headers(headers_3),
						http("request_65")
							.get(uri1 + "/images/portrait_263/square/alasdair-allan.jpg")
							.headers(headers_3),
						http("request_66")
							.get(uri1 + "/images/portrait_263/square/jeane-freeman.jpg")
							.headers(headers_3),
						http("request_67")
							.get(uri1 + "/images/portrait_263/square/mike-russell.jpg")
							.headers(headers_3),
						http("request_68")
							.get(uri1 + "/assets/images/icons/close-white.png")
							.headers(headers_3),
						http("request_69")
							.get(uri1 + "/images/portrait_263/square/james-wolffe.jpg")
							.headers(headers_3),
						http("request_70")
							.get(uri1 + "/images/portrait_263/square/alison-di-rollo.jpg")
							.headers(headers_3),
						http("request_71")
							.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
							.headers(headers_3),
						http("request_72")
							.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
							.headers(headers_3)))

			}
		.pause(5)




		  .group("Navigate to Civil Services Section"){
				exec(http("request_73")
					.get("/about/how-government-is-run/civil-service/")
					.headers(headers_0)
					.resources(http("request_74")
						.get(uri1 + "/assets/styles/main.c8140e68.css")
						.headers(headers_1),
						http("request_75")
							.get(uri1 + "/assets/images/logos/scotgovlogo.png")
							.headers(headers_3),
						http("request_76")
							.get(uri1 + "/assets/scripts/vendor/jquery.min.js")
							.headers(headers_2),
						http("request_77")
							.get(uri1 + "/assets/scripts/global.d1a16f50.js")
							.headers(headers_2),
						http("request_78")
							.get(uri1 + "/assets/scripts/default.03a57364.js")
							.headers(headers_2),
						http("request_79")
							.get(uri1 + "/images/portrait_263/square/leslie-evans.jpg")
							.headers(headers_3),
						http("request_80")
							.get(uri1 + "/images/portrait_263/square/sarah-davidson.jpg")
							.headers(headers_3),
						http("request_81")
							.get(uri1 + "/images/portrait_263/square/liz-ditchburn.jpg")
							.headers(headers_3),
						http("request_82")
							.get(uri1 + "/images/portrait_263/square/alyson-stafford.jpg")
							.headers(headers_3),
						http("request_83")
							.get(uri1 + "/images/portrait_263/square/paul-gray.jpg")
							.headers(headers_3),
						http("request_84")
							.get(uri1 + "/images/portrait_263/square/paul-johnston.jpg")
							.headers(headers_3),
						http("request_85")
							.get(uri1 + "/images/portrait_263/square/ken-thomson.jpg")
							.headers(headers_3),
						http("request_86")
							.get(uri1 + "/images/portrait_263/square/annie-gunner-logan.jpg")
							.headers(headers_3),
						http("request_87")
							.get(uri1 + "/assets/images/icons/search-white.png")
							.headers(headers_3),
						http("request_88")
							.get(uri1 + "/images/portrait_263/square/bob-downes.jpg")
							.headers(headers_3),
						http("request_89")
							.get(uri1 + "/images/portrait_263/square/hugh-mckay.jpg")
							.headers(headers_3),
						http("request_90")
							.get(uri1 + "/images/portrait_263/square/janet-hamblin.jpg")
							.headers(headers_3),
						http("request_91")
							.get(uri1 + "/images/portrait_263/square/linda-mckay.jpg")
							.headers(headers_3),
						http("request_92")
							.get(uri1 + "/images/portrait_263/square/ronnie-hinds.jpg")
							.headers(headers_3),
						http("request_93")
							.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
							.headers(headers_3),
						http("request_94")
							.get(uri1 + "/assets/images/icons/close-white.png")
							.headers(headers_3),
						http("request_95")
							.get(uri1 + "/assets/images/people/placeholder.png")
							.headers(headers_3),
						http("request_96")
							.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
							.headers(headers_3)))

			}

		  .pause(10)
		// Navigate to Civil Services
		  .group("Navigate to Person Page section"){

		exec(http("request_97")
			.get("/about/how-government-is-run/civil-service/annie-gunner-logan/")
			.headers(headers_0)
			.resources(http("request_98")
				.get(uri1 + "/assets/images/icons/grey_arrow_down.png")
				.headers(headers_3),
				http("request_99")
					.get(uri1 + "/assets/images/icons/close-white.png")
					.headers(headers_3),
				http("request_100")
					.get(uri1 + "/assets/images/icons/search-white.png")
					.headers(headers_3),
				http("request_101")
					.get(uri1 + "/assets/images/people/placeholder.png")
					.headers(headers_3),
				http("request_102")
					.get(uri1 + "/assets/images/icons/grey_arrow_up.png")
					.headers(headers_3)))

	}


}