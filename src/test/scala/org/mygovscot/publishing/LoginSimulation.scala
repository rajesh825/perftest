package org.mygovscot.publishing

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class LoginSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("https://intpub.mygov.scot")
		.inferHtmlResources()
		.acceptHeader("""application/hal+json""")
		.acceptEncodingHeader("""gzip, deflate, sdch""")
		.acceptLanguageHeader("""en-US,en;q=0.8""")
		.authorizationHeader("""Bearer f92295b6-a698-4074-89e9-32bf8403afeb""")
		.connection("""keep-alive""")
		.contentTypeHeader("""application/json;charset=UTF-8""")
		.userAgentHeader("""Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.63 Safari/537.36""")

	val headers_0 = Map(
		"""Accept-Encoding""" -> """gzip, deflate""",
		"""Authorization""" -> """""",
		"""Origin""" -> """https://intpub.mygov.scot""")

	val headers_2 = Map("""Accept""" -> """application/compacthal+json""")

	val headers_4 = Map("""Accept""" -> """text/html""")

	val headers_18 = Map("""Accept""" -> """*/*""")

    val uri1 = """https://intpub.mygov.scot"""

	val scn = scenario("LoginSimulation")
		.exec(http("request_0")
			.post("""/security/sessions?cacheBuster=1424431344864""")
			.headers(headers_0)
			.body(RawFileBody("LoginSimulation_request_0000.txt"))
			.resources(http("request_1")
			.get(uri1 + """/content/lists"""),
            http("request_2")
			.get(uri1 + """/content/items?cacheBuster=1424431344965""")
			.headers(headers_2),
            http("request_3")
			.get(uri1 + """/content/items/parentage?cacheBuster=1424431344965"""),
            http("request_4")
			.get(uri1 + """/views/content-list.html""")
			.headers(headers_4),
            http("request_5")
			.get(uri1 + """/content/lists/localauthorityservices"""),
            http("request_6")
			.get(uri1 + """/content/lists/formats"""),
            http("request_7")
			.get(uri1 + """/content/lists/geographies"""),
            http("request_8")
			.get(uri1 + """/content/lists/servicetypes"""),
            http("request_9")
			.get(uri1 + """/content/lists/aggregators"""),
            http("request_10")
			.get(uri1 + """/content/lists/audiences"""),
            http("request_11")
			.get(uri1 + """/content/lists/estimatedreadingtimes"""),
            http("request_12")
			.get(uri1 + """/content/lists/regions"""),
            http("request_13")
			.get(uri1 + """/content/lists/serviceproviders"""),
            http("request_14")
			.get(uri1 + """/content/lists/predicates"""),
            http("request_15")
			.get(uri1 + """/content/lists/sectors"""),
            http("request_16")
			.get(uri1 + """/content/lists/businesstypes"""),
            http("request_17")
			.get(uri1 + """/content/items?cacheBuster=1424431345079""")
			.headers(headers_2)))
		.pause(2)
		.exec(http("request_18")
			.get("""/bower_components/bootstrap/dist/fonts/glyphicons-halflings-regular.woff""")
			.headers(headers_18))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}