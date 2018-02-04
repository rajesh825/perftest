package org.govscot.website

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import util.Environment

import scala.concurrent.duration._

class BrexitForm extends Simulation {



	val httpProtocol = http
		.baseURL(Environment.baseURL)
		.disableFollowRedirect
		.inferHtmlResources(BlackList("""https://platform.twitter.com""", """https://farm1.staticflickr.com""", """https://s.ytimg.com/yts""", """https://pbs.twimg.com""", """https://www.google-analytics.com""", """static.doubleclick.net""", """https://syndication.twitter.com""", """https://www.googletagmanager.com/.*""", """https://maxcdn.bootstrapcdn.com""", """https://fonts.gstatic.com""", """https://i.ytimg.com""", """https://www.youtube.com""", """www.google.com""", """farm6.staticflickr.com""", """https://fonts.googleapis.com/css""", """creatingahealthierscotland.files.wordpress.com"""), WhiteList())

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

   // val uri1 = "https://www.google-analytics.com"
   // val uri2 = "https://www.gstatic.com/recaptcha/api2"
    val uri3 = "https://perwww.mygov.scot"
    val uri4 = "https://fonts.gstatic.com/s/roboto/v15"
    val uri5 = "https://www.google.com"
  //  val uri6 = "https://fonts.googleapis.com/css"

	val scn = scenario("BrexitForm")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(
//				http("request_1")
//			.get(uri6 + "?family=Roboto:100,300,400,700,900"),
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
//            http("request_9")
//			.get(uri4 + "/Hgo13k-tfSpn0qi1SFdUfZBw1xU1rKptJj_0jans920.woff2")
//			.headers(headers_9),
//            http("request_10")
//			.get(uri4 + "/oMMgfZMQthOryQo9n22dcuvvDin1pK8aKteLpeZ5c0A.woff2")
//			.headers(headers_9),
//            http("request_11")
//			.get(uri4 + "/2tsd397wLxj96qwHyNIkxHYhjbSpvc47ee6xR_80Hnw.woff2")
//			.headers(headers_9),
//            http("request_12")
//			.get(uri4 + "/d-6IYplOFocCacKzxwXSOJBw1xU1rKptJj_0jans920.woff2")
//			.headers(headers_9),
            http("request_13")
			.get(uri3 + "/assets/images/icons/search-white_@2x.png")
			.headers(headers_13),
            http("request_14")
			.get(uri3 + "/assets/images/icons/arrows/int_arrow_right_42px.png")
			.headers(headers_13),
            http("request_15")
			.get(uri3 + "/assets/images/icons/arrows/int_arrow_right_70px.png")
			.headers(headers_13),
//            http("request_16")
//			.get(uri1 + "/analytics.js"),
//            http("request_17")
//			.get(uri1 + "/plugins/ua/linkid.js"),
//            http("request_18")
//			.post(uri1 + "/collect")
//			.headers(headers_18)
//			.body(RawFileBody("BrexitForm_0018_request.txt")),
            http("request_19")
			.get(uri3 + "/assets/images/mygov-logos/mygovscot_195px.png")
			.headers(headers_13),
            http("request_20")
			.get(uri3 + "/assets/images/mygov-logos/govscot_165px.png")
			.headers(headers_13),
//            http("request_21")
//			.get(uri2 + "/r20160411084021/recaptcha__en.js"),
            http("request_22")
			.get(uri3 + "/assets/images/icons/notification_close_white.png")
			.headers(headers_13)))
		.pause(5)
		.exec(http("request_23")
			.get("/service/search/ac?q=bre")
			.headers(headers_23)
			.resources(http("request_24")
			.get(uri3 + "/service/search/ac?q=brexi")
			.headers(headers_23),
            http("request_25")
			.get(uri3 + "/service/search/ac?q=brexit")
			.headers(headers_23),
//            http("request_26")
//			.post(uri1 + "/collect")
//			.headers(headers_18)
//			.body(RawFileBody("BrexitForm_0026_request.txt")),
            http("request_27")
			.get(uri3 + "/brexit-form/")
			.headers(headers_0),
//            http("request_28")
//			.get(uri6 + "?family=Roboto:100,300,400,700,900"),
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
//            http("request_36")
//			.get(uri4 + "/oMMgfZMQthOryQo9n22dcuvvDin1pK8aKteLpeZ5c0A.woff2")
//			.headers(headers_9),
//            http("request_37")
//			.get(uri4 + "/d-6IYplOFocCacKzxwXSOJBw1xU1rKptJj_0jans920.woff2")
//			.headers(headers_9),
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
//            http("request_43")
//			.get(uri1 + "/analytics.js"),
//            http("request_44")
//			.get(uri1 + "/plugins/ua/linkid.js"),
//            http("request_45")
//			.get(uri2 + "/r20160411084021/recaptcha__en.js"),
            http("request_46")
			.get(uri3 + "/assets/images/icons/notification_close_white.png")
			.headers(headers_13),
            http("request_47")
			.get(uri3 + "/assets/images/icons/arrows/int_arrow_up_70px.png")
			.headers(headers_13)
//            http("request_48")
//			.get(uri4 + "/Hgo13k-tfSpn0qi1SFdUfZBw1xU1rKptJj_0jans920.woff2")
//			.headers(headers_9),
//            http("request_49")
//			.post(uri1 + "/collect")
//			.headers(headers_18)
//			.body(RawFileBody("BrexitForm_0049_request.txt")),
//            http("request_50")
//			.get(uri5 + "/recaptcha/api2/anchor?k=6LcUYh0TAAAAAA6iiQvC89XlohAUW1m29GwDxGkV&co=aHR0cHM6Ly9wZXJ3d3cubXlnb3Yuc2NvdDo0NDM.&hl=en&v=r20160411084021&size=normal&cb=rls3fl3nyblh")
//			.headers(headers_50),
//            http("request_51")
//			.get(uri2 + "/r20160411084021/styles__ltr.css"),
//            http("request_52")
//			.get(uri2 + "/r20160411084021/recaptcha__en.js"),
//            http("request_53")
//			.get(uri4 + "/oMMgfZMQthOryQo9n22dcuvvDin1pK8aKteLpeZ5c0A.woff2"),
//            http("request_54")
//			.get(uri2 + "/logo_48.png"),
//            http("request_55")
//			.get(uri5 + "/js/bg/GBZBwqafHTOZn5ff4OohUr-Um2_2yuQ4HHnd3XGz0Nc.js"),
//            http("request_56")
//			.get(uri5 + "/recaptcha/api2/webworker.js?hl=en&v=r20160411084021"),
//            http("request_57")
//			.get(uri2 + "/r20160411084021/recaptcha__en.js")
			)
		)
		.pause(188)
		.exec(http("request_58")
			.get("/assets/images/icons/arrows/ext_arrow_text_15px_hover.png")
			.headers(headers_13))
		.pause(2)
//		.exec(http("request_59")
//			.get(uri5 + "/recaptcha/api2/frame?c=03AHJ_Vuu_gLctwnrJRExhLLUHvvACeS9bieUOwRuS1AOZCb6U3E5jYiPkXkDJziA3xjTAHg20f2ArlpFrkrSlCn0r6d0-GQ8s10V6zZo1rwt_c_SPGLYOxyTmsmO7X69TkVZP6NEEt2aqDolBHQ_aaxsgY8yIPfjkMR4ofa4pWJHOArkYEHZW7MWGkzBJjnNx5Cpdpn8gwk-7vss4IIDxECiiCqX5GC72Cakqw9XTMZi4cBAcu3pRCN7ecuhAHuG1dEFZaLfZn0HLE4deIx7vyX8piZ1UpLceUO4SuEvFbNo5aBzysecOzrz_YqQFXEJsdbnnT3giDzEwELysZmEi1fvZ1TnMQTeNgPCBzXH5IIsGDwMMtj7v94_3DcyTnO00W4TYXwsqpPr5CTcgp15Zq8swoCNZsQNPlDdjeX82HZWcnWi2atmHmpdh8uSfpEtKjK7zQeh_oVmARzq9bCJmLtBEcXnglFhfx0YM6O7OCxz1nxR8yqN21nDH8FFuHYXntTilKdEgwjbwfdDd6VSAnHUJkSZ8OF4W-Kg6016zvebZ1cNSY28dxl5d5KLXVt1t3QKMjRdgHoKzmvKUusSXr764METSR8T7Zs2IeYlGcLF6ZUbJui_NTas&hl=en&k=6LcUYh0TAAAAAA6iiQvC89XlohAUW1m29GwDxGkV&v=r20160411084021&bcr=%5B-81439955%2C207443037%2C803303480%2C1673273781%2C2003861714%2C2088883488%2C-1727466291%2C1194071061%2C233505086%2C1718377147%2C-706510358%2C-1444769263%2C-1079877513%2C1901595971%2C1635834988%5D&bg=!eH6gfl9HKcVqH8vynL1BzMiB19XdoVsHAAAAOFcAAACCnAOHs-ECp6MnrUS918HA_TD8o0jCU2UmxVfg28Ac0HlQTzNNj6p4NiQUjvauLNOe4jWahVuUQDSXFLhQzLU6wCHDoI8DsMEMQ1mMhssnqvVliedwh8por0ImNUahNe_U4joeyAis0YlfZgH71uFwwho5JKr0bQkQ4lw9B_bNbK_NflLv_UAkEz65nbK-PVyDVyWReN4I511vpbzNA8r5Y0cB8sjKCBSwjP6aiiMsHwA2Fm_gcU1hZFj53mGvME2sEpAIJbEliCrTZjpUMppNo7IN7fCAnrW5GmQYtx9dm6R-67yqG0kKzhPW0ungsIrPiKL1ia6chj_OtWqipKW9CoMgKG3YGOKWFOn8kb6zoyoaRAZ2ZbGMQyEALc8zxxqSzLyK5luo--yphUobrkTnOdUpiqjhG7J56wqD-OA-hdO2TePvmdaatquvuqo7iq2igBAYvH_rh4MB1aLo-eo7oJXOaBIgLChhEMEwOLPG9vu5PqPgNq3TvuD9PLGU8eaXLrdLtAoLp1xetszN11tjdIb7ecPUNbOtmQsyH-x21gdpS3kFEr24p9zdXh34QoAQhwxVPG6hWzHK-SEzcO9hoySAR5V_IxFMeGWeWyy8-JdEtqTsbb_NimjMR23c0e1KGSc81DtvcYiLYepyZ8ZoG7TBLsC0nS8NHIEIyYzo8qGsSgUUMp8or8gxKr_7Tf1ID63hIXHS-q4B1ba3XrCWiJwYtiqSSQ9JUP1x7djkVOZ6Jv4FU5Dso9m_mC7CAo-d4DFSRt4GLSd6VZNNQEB2-hjpX-qisz0_zEJwqAz0hcylM5OVGad9I9RmcHBkjiwZwf4QjxWBYAeULn9uLO2kdWoAOVEFGbQJp1l6Xp9oB--fcKMnpSqqVfCc4wVSmuBD_zF6TP83t8AgMfmGTOyoidbFGkx3UylygvRSRxDvi-UCdnMfVty8bcrT4_X5uTHWFUYbTp-Sx89tnogTbdII5S19lhF7OI6krti2_yWNRW4xe-BpLrkFfah2O5gGT3rZdy6FmEmxbHQOLRmuSmvOl2_MkcUh_fSqNNb5prWr6ufo6bOz-667mc_Jnws2-TOCncMbhSZBdkjXdKMB2cARJ9IOpPxL2IrET3oP5c1KN2GTkCsXTpdCkU-TlaUDmB_VORybnq-7q-H3Pl01uKPBVoSDwG_2OiKv62J0zPkiBNhBxI0DedO8WG4Y&chr=%5B57%2C45%2C60%5D")
//			.headers(headers_50)
//			.resources(
//
//            http("request_62")
//			.get(uri4 + "/oMMgfZMQthOryQo9n22dcuvvDin1pK8aKteLpeZ5c0A.woff2"),
////            http("request_63")
////			.get(uri2 + "/refresh.png"),
////            http("request_64")
////			.get(uri2 + "/audio.png"),
////            http("request_65")
////			.get(uri2 + "/image.png"),
////            http("request_66")
////			.get(uri2 + "/info.png"),
//            http("request_67")
//			.get(uri4 + "/RxZJdnzeo3R5zSexge8UUZBw1xU1rKptJj_0jans920.woff2")
//			.headers(headers_67),
////            http("request_68")
////			.get(uri5 + "/js/bg/GBZBwqafHTOZn5ff4OohUr-Um2_2yuQ4HHnd3XGz0Nc.js"),
////            http("request_69")
////			.post(uri5 + "/recaptcha/api2/userverify?k=6LcUYh0TAAAAAA6iiQvC89XlohAUW1m29GwDxGkV")
////			.headers(headers_69)
////			.formParam("v", "r20160411084021")
////			.formParam("c", "03AHJ_VusCIO6x1TXQcOu3kgZa5cD3zBC2jC-OixIvdEpLl12K2ZA9WgVCkCNbQf9momB3IWS0sppuzBdT2-FsD1dVhK3hFHrOuUquJ1J8emFp_LSqKznpRwX2x_2_WgaryOaiZXu-BdLd1J7Xf4rdEZ90bUVfT49lo2DRyWd30E7UGzk2v6hIWGOy5u3OWvylsrlRo5zCl4SEJHZiS3liasnDePVBnHHqYAjMRZOYVIQzsQh3_MiR_GY5YlSaQdqRm3buZ-CYBGx2h6C0u1l3lbOBZqqHwMkF5NETqNsSeBVeA6axDXj18pbkwl15v6mmKtgX2TA6AVME8-7nvZjN54kfsio1Ze5Cw1_lR6L9nPvWsnwSbsY9S_Tz9bhH82BmD--WqmKBhlezRklYj5T7U-n7Ag-n9IKn_tGi_cq8xluz0LsZ8rL2hZGvsf-YODJ80Y0l3YBSdNgP9bOg4slhsz2lOvENy9tREoOO6aeWzqF_C858vziIRMxMXQi6btqLy8SQSB0fcR9vra_hgGDwSi2QlOBP1od867IjnnTNhkjBBzPENRrfuXRDroW03GjF2aR383bRIxujwDrd2pl39iFbnZu-n7Iw4lkv8AvrXDjVjRt1Xki2BQ4TpWNUpZCRWq6CLEjuNeTG62JRwtiayHlR2Pn7LKbscI4Ms7MAaldFJZ82tx2yOe6WywhHU-1zPZ7_ChbUNtuy1oFoBTQUAro5rD0zpmcARD81l8yCjQMvRhjqfgMhxg2GYhvOlFcHmkRJHizA0KwoZh4EDEPAwKh6bL3-anrWd_BaFv_uVhP37nU-7oTChz5J5E1KMOSUxHxAFWX6jn-D5z2BLnuZJFaY0HwCj5aQJ9cPX6xomwOBskR7UC0ms5n0JSZgWTNy7Exi4gKXhDuLXpST1tCR8S9ACc37BOYgvOZWDlzhS5YjqZkEbjEhy94")
////			.formParam("response", "eyJyZXNwb25zZSI6IiJ9")
////			.formParam("t", "286")
////			.formParam("ct", "286")
////			.formParam("bg", "!aW-gb05Hm2oxU4zoQLZB7axzkfEsA58HAAAAOFcAAACenANzE_3AqAxpf2kDbsiJKEhpyx-RyRCIy1lBc3hL3O78DzlXSRRa91Mhs7hMXwUdPfBuOvEQd8t0OOz0vnJ4Vjx3n3OqzThDsiZPHNEkjoWzV_Zt2QtSwIb9rJ3hZYkEpRWmJYgPY_npLXvHfWXrCVyiutlsc-TK5K-d3Hg5nCL0Ece6vRZW7bzKpaoFiWt6efXeO_sHeIcybjFZfvxoB0c9e6yofxtI334dwH8TM9jWfu4Mu9NKEzedtSsUlfzVCbMsVF0dpIMuvu9w-JDtmRv0PlIUd4BD3AYIbBGFmEubrLzbOhOZIAg0BTzt1H2ieh5zl02GeVpUYTnvsNrhzyNheisSedYCTcG6PlV3r9it4LHLhwFiTHFwTnKOjBr5A8TJBkgvh6DItS6Aw5uLe-BrS9awlcjlKniSzorzs7do6uYfE98ftcY2c3Au_XUIXm8cfHOdVTMC2A3qMqqInMVm9miAKtZ9mouG1pnr5VS8T4J9n20-GX19mxrCQjLSfsKF0PORYJyuYOQ70UM9pyw5CmbN6OGhosO6vi03M5ZsQlV4e0VS_dyV25ev5Qu7WnZX8zj30xub7aI76WWdURAQbeotxTKcJsI3UGKCpkNuewJSINy565QPeuWzz3t52JqB5qWH0afPTAfIGLI6GuC-iGslGJch4dE6VpGcc9UR7jfkovAhjlD-PfUK3sbROa_WYoy0GVlwqy0Zmc0ZRs87iFdj3dU6uLmmzFq9fSEY5J7nD8ean0Vn-U6OqQjJiQ5yU6vNDF6Fh0yEQuYFzca73CyB6nSxcZZGsbxQQYGu9FUXG6vNayBFeqKmZczBmY20QvO9xXs4MN8_7JmkJCT8xnUexaaY9jTsY1WpKqf_IKf5hy1q3lapAxQNiz4H8B-5xwpk9Xb98rbU4o9_VFecKAhZqUYQPFW6jGRC969l__83KRmmh0_gpqBboZBXC_ULojVBocUX086rVaFWEKv-KUHrP7cOmylnoEaJvhxggV0202uYhoX7aS9elHJ-0D_QenMaUlshXCQcyD1JaeLi6OqVKFoZuVbl6Ro9rrBuS2ijh4o_7fwrSatM6Vaiv63KxSNO2fm1WkRPOQuFWCJ3KYPoKhZbpMUKfgC4IKGSP6HUzlXt4dRRMw8mOzjAYKvGLvRsjHxySjECKKFbUKHRX5WV8Q")))
		.pause(5)
		.exec(http("request_70")
			.post("/service/brexit/submit")
			.headers(headers_70)
			.body(RawFileBody("BrexitForm_0070_request.txt")))

	setUp(scn.inject(constantUsersPerSec(1) during(15 seconds))).protocols(httpProtocol)
}