package org.mygovscot.website

import io.gatling.http.Predef._
import io.gatling.core.Predef._

/**
 * Created by z608174 on 24/09/2015.
 */
object bankHolidaysDesktop {

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_2 = Map("Accept" -> "image/webp,image/*,*/*;q=0.8")

  val headers_14 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_39 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Origin" -> "https://perwww.mygov.scot",
    "X-Requested-With" -> "XMLHttpRequest")

  val uri1 = "https://fonts.googleapis.com/css"
  val uri2 = "https://perwww.mygov.scot:443"


  var browse =  group("Homepage"){


                      exec(http("request_0")
                        .get("/")
                        .headers(headers_0)
                        .resources(http("request_1")
                        .get(uri2 + "/assets/scripts/vendor/bootstrap/dist/fonts/glyphicons-halflings-regular.woff2"),
                          http("request_2")
                            .get(uri2 + "/assets/images/icons/arrows/int_arrow_right_70px.png")
                            .headers(headers_2),
                          http("request_3")
                            .get(uri2 + "/assets/images/icons/arrows/int_arrow_right_42px.png")
                            .headers(headers_2),
                          http("request_4")
                            .get(uri2 + "/assets/images/mygov-logos/mygovscot_beta_195px.png")
                            .headers(headers_2),
                          http("request_5")
                            .get(uri2 + "/assets/images/scotland-office/so_crest_48px.png")
                            .headers(headers_2),
                          http("request_6")
                            .get(uri2 + "/assets/scripts/main.js"),
                          http("request_7")
                            .get(uri2 + "/assets/scripts/app/pubsub.js"),
                          http("request_8")
                            .get(uri2 + "/assets/scripts/app/index.js"),
                          http("request_9")
                            .get(uri2 + "/assets/scripts/app/analytics.js"),
                          http("request_10")
                            .get(uri2 + "/assets/scripts/app/global.js"),
                          http("request_11")
                            .get(uri2 + "/assets/scripts/app/gup.js"),
                          http("request_12")
                            .get(uri2 + "/assets/scripts/vendor/jquery-auto-complete/jquery.auto-complete.min.js"),
                          http("request_13")
                            .get(uri2 + "/assets/images/icons/notification_close_white.png")
                            .headers(headers_2)))
                    }

               .pause(5)


               .group("Search for Bank holidays"){

                  exec(http("request_14")
                    .get("/service/search/ac?q=Bank")
                    .headers(headers_14)
                    .resources(http("request_15")
                    .get(uri2 + "/service/search/ac?q=Bank+")
                    .headers(headers_14),
                      http("request_16")
                        .get(uri2 + "/service/search/ac?q=Bank+ho")
                        .headers(headers_14),
                      http("request_17")
                        .get(uri2 + "/service/search/ac?q=Bank+holid")
                        .headers(headers_14),
                      http("request_18")
                        .get(uri2 + "/service/search/ac?q=Bank+holiday")
                        .headers(headers_14),
                      http("request_19")
                        .get(uri2 + "/service/search/ac?q=Bank+holidays")
                        .headers(headers_14)))

                    .pause(1)

                    .exec(http("request_20")
                      .get("/search?q=Bank+holidays&cat=sitesearch")
                      .headers(headers_0)
                      .resources(http("request_21")
                      .get(uri2 + "/assets/scripts/app/search.js"),
                        http("request_22")
                          .get(uri2 + "/assets/scripts/app/ajax.js"),
                        http("request_23")
                          .get(uri2 + "/assets/scripts/app/paginator.js"),
                        http("request_24")
                          .get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs.js"),
                        http("request_25")
                          .get(uri2 + "/assets/scripts/vendor/q/q.js"),
                        http("request_26")
                          .get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs/json2.js"),
                        http("request_27")
                          .get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs/underscore.js"),
                        http("request_28")
                          .get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs/i18nprecompile.js"),
                        http("request_29")
                          .get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs/handlebars.js"),
                        http("request_30")
                          .get(uri2 + "/assets/scripts/templates/searchresultsitems.hbs"),
                        http("request_31")
                          .get(uri2 + "/assets/scripts/templates/didyoumean.hbs"),
                        http("request_32")
                          .get(uri2 + "/assets/images/async/ajax-loader-white.gif")
                          .headers(headers_2),
                        http("request_33")
                          .get(uri2 + "/service/search/direct/?fuzzy=true&didyoumean=true&q=Bank+holidays&from=0&size=10")
                          .headers(headers_14)))

                 }

                .pause(5)

                .group("Navigate to Bank holidays"){

                  exec(http("request_34")
                    .get("/scottish-bank-holidays/")
                    .headers(headers_0)
                    .resources(http("request_35")
                    .get(uri2 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
                    .headers(headers_2),
                      http("request_36")
                        .get(uri2 + "/assets/scripts/app/article.js"),
                      http("request_37")
                        .get(uri2 + "/assets/scripts/app/feedback.js")))
                    .pause(19)
                    .exec(http("request_38")
                    .get("/assets/images/icons/arrows/ext_arrow_text_17px_hover.png")
                    .headers(headers_2))
                    .pause(22)
                    .exec(http("request_39")
                    .post("/feedback/")
                    .headers(headers_39)
                    .body(RawFileBody("RecordedSimulation_0039_request.txt")))


                  }

}
