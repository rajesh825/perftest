package org.mygovscot.website

/**
* Created by z608174 on 14/11/2014.
*/

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object BRCDesktop {

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_1 = Map("Accept" -> "text/css,*/*;q=0.1")

  val headers_2 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache")

  val headers_3 = Map(
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache")

  val headers_4 = Map(
    "Accept" -> "*/*",
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache")

  val headers_10 = Map("Accept" -> "*/*")

  val headers_13 = Map("Origin" -> "https://perwww.mygov.scot")

  val headers_31 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_75 = Map(
    "Accept" -> "*/*",
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "X-Requested-With" -> "XMLHttpRequest")

  val uri1 = "https://www.google-analytics.com"
  val uri2 = "https://perwww.mygov.scot"
  val uri3 = "https://www.googletagmanager.com/gtm.js"
  val uri4 = "https://fonts.gstatic.com/s/roboto/v15"
  val uri5 = "https://fonts.googleapis.com/css"



  val feeder = csv("postcode.csv").random

  val browse = group("Homepage") {

                  exec(http("request_0")
                    .get("/")
                    .headers(headers_0)
                    .resources(http("request_1")
                    .get(uri5 + "?family=Roboto:100,300,400,700,900")
                    .headers(headers_1),
                      http("request_2")
                        .get(uri2 + "/assets/styles/main.css")
                        .headers(headers_2),
                      http("request_3")
                        .get(uri2 + "/assets/images/icons/search-white_@2x.png")
                        .headers(headers_3),
                      http("request_4")
                        .get(uri2 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
                        .headers(headers_4),
                      http("request_5")
                        .get(uri2 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
                        .headers(headers_4),
                      http("request_6")
                        .get(uri2 + "/assets/scripts/mygov/responsive.js")
                        .headers(headers_4),
                      http("request_7")
                        .get(uri2 + "/assets/scripts/ie10-viewport-bug-workaround.js")
                        .headers(headers_4),
                      http("request_8")
                        .get(uri2 + "/assets/scripts/vendor/require.js/require.js")
                        .headers(headers_4),
                      http("request_9")
                        .get(uri2 + "/assets/images/scottish-government-footer-logo-340.png")
                        .headers(headers_3),
//                      http("request_10")
//                        .get(uri1 + "/analytics.js")
//                        .headers(headers_10),
//                      http("request_11")
//                        .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=1164931309&t=pageview&_s=1&dl=https%3A%2F%2Fperwww.mygov.scot%2F&ul=en-us&de=UTF-8&dt=Access%20to%20public%20services%20in%20Scotland%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1670x575&je=0&fl=21.0%20r0&_u=QAEAAEABI~&jid=&cid=2114033079.1458150508&tid=UA-51758325-1&cd1=The%20Home%20Page&cd2=Citizen&cd3=Scottish%20Government&z=903183820"),
//                      http("request_12")
//                        .get(uri3 + "?id=GTM-5VLWP7")
//                        .headers(headers_10),
//                      http("request_13")
//                        .get(uri4 + "/d-6IYplOFocCacKzxwXSOJBw1xU1rKptJj_0jans920.woff2")
//                        .headers(headers_13),
//                      http("request_14")
//                        .get(uri4 + "/oMMgfZMQthOryQo9n22dcuvvDin1pK8aKteLpeZ5c0A.woff2")
//                        .headers(headers_13),
                      http("request_15")
                        .get(uri2 + "/assets/images/mygov-logos/mygovscot_195px.png")
                        .headers(headers_3),
                      http("request_16")
                        .get(uri2 + "/assets/images/scotland-office/so_crest_48px.png")
                        .headers(headers_3),
//                      http("request_17")
//                        .get(uri4 + "/Hgo13k-tfSpn0qi1SFdUfZBw1xU1rKptJj_0jans920.woff2")
//                        .headers(headers_13),
                      http("request_18")
                        .get(uri2 + "/assets/images/icons/arrows/int_arrow_right_42px.png")
                        .headers(headers_3),
//                      http("request_19")
//                        .get(uri4 + "/2tsd397wLxj96qwHyNIkxHYhjbSpvc47ee6xR_80Hnw.woff2")
//                        .headers(headers_13),
                      http("request_20")
                        .get(uri2 + "/assets/images/icons/arrows/int_arrow_right_70px.png")
                        .headers(headers_3),
                      http("request_21")
                        .get(uri2 + "/assets/scripts/main.js")
                        .headers(headers_4),
//                      http("request_22")
//                        .get(uri1 + "/plugins/ua/linkid.js")
//                        .headers(headers_10),
                      http("request_23")
                        .get(uri2 + "/assets/scripts/mygov/format.index.js")
                        .headers(headers_4),
                      http("request_24")
                        .get(uri2 + "/assets/scripts/mygov/analytics.js")
                        .headers(headers_4),
                      http("request_25")
                        .get(uri2 + "/assets/scripts/mygov/global.js")
                        .headers(headers_4),
                      http("request_26")
                        .get(uri2 + "/assets/scripts/mygov/pubsub.js")
                        .headers(headers_4),
//                      http("request_27")
//                        .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=1164931309&t=pageview&_s=1&dl=https%3A%2F%2Fperwww.mygov.scot%2F&dp=%2F&ul=en-us&de=UTF-8&dt=Access%20to%20public%20services%20in%20Scotland%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1655x575&je=0&fl=21.0%20r0&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-66930174-4&cd1=Citizen&cd2=The%20Home%20Page&cd3=Scottish%20Government&gtm=GTM-5VLWP7&cd4=internal&linkid=search-box&z=1341547485"),
                      http("request_28")
                        .get(uri2 + "/assets/scripts/mygov/gup.js")
                        .headers(headers_4),
                      http("request_29")
                        .get(uri2 + "/assets/scripts/vendor/jquery-auto-complete/jquery.auto-complete.min.js")
                        .headers(headers_4),
                      http("request_30")
                        .get(uri2 + "/assets/images/icons/notification_close_white.png")
                        .headers(headers_3)))

                  }

                  .pause(10)
                  .group("Search for Business Rates Calculator"){
                          exec(http("request_31")
                            .get("/service/search/ac?q=Bus")
                            .headers(headers_31)
                            .resources(http("request_32")
                            .get(uri2 + "/service/search/ac?q=Busines")
                            .headers(headers_31),
//                              http("request_33")
//                                .get(uri2 + "/service/search/ac?q=Business")
//                                .headers(headers_31),
//                              http("request_34")
//                                .get(uri2 + "/service/search/ac?q=Business+")
//                                .headers(headers_31),
//                              http("request_35")
//                                .get(uri2 + "/service/search/ac?q=Business+R")
//                                .headers(headers_31),
//                              http("request_36")
//                                .get(uri2 + "/service/search/ac?q=Business+Rate")
//                                .headers(headers_31),
//                              http("request_37")
//                                .get(uri2 + "/service/search/ac?q=Business+Rates")
//                                .headers(headers_31),
//                              http("request_38")
//                                .get(uri2 + "/service/search/ac?q=Business+Rates+")
//                                .headers(headers_31),
//                              http("request_39")
//                                .get(uri2 + "/service/search/ac?q=Business+Rates+cal")
//                                .headers(headers_31),
                              http("request_40")
                                .get(uri2 + "/service/search/ac?q=Business+Rates+calc")
                                .headers(headers_31)))
                            .pause(1)
                            .exec(http("request_41")
                            .get("/business-rates-calculator/")
                            .headers(headers_0)
                            .resources(
//                              http("request_42")
//                            .get(uri5 + "?family=Roboto:100,300,400,700,900")
//                            .headers(headers_1),
                              http("request_43")
                                .get(uri2 + "/assets/styles/main.css")
                                .headers(headers_2),
                              http("request_44")
                                .get(uri2 + "/assets/images/icons/search-white_@2x.png")
                                .headers(headers_3),
                              http("request_45")
                                .get(uri2 + "/assets/scripts/vendor/jquery/dist/jquery.min.js")
                                .headers(headers_4),
                              http("request_46")
                                .get(uri2 + "/assets/scripts/vendor/bootstrap-toolkit.min.js")
                                .headers(headers_4),
                              http("request_47")
                                .get(uri2 + "/assets/scripts/mygov/responsive.js")
                                .headers(headers_4),
                              http("request_48")
                                .get(uri2 + "/assets/scripts/ie10-viewport-bug-workaround.js")
                                .headers(headers_4),
                              http("request_49")
                                .get(uri2 + "/assets/scripts/vendor/require.js/require.js")
                                .headers(headers_4),
                              http("request_50")
                                .get(uri2 + "/assets/images/scottish-government-footer-logo-340.png")
                                .headers(headers_3),
//                              http("request_51")
//                                .get(uri1 + "/analytics.js")
//                                .headers(headers_10),
//                              http("request_52")
//                                .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=pageview&_s=1&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1670x575&je=0&fl=21.0%20r0&_u=QAEAAEABI~&jid=&cid=2114033079.1458150508&tid=UA-51758325-1&cd1=Business%20Rates%20Calculator&cd2=Business&cd3=Business%20Portal&z=161378490"),
//                              http("request_53")
//                                .get(uri3 + "?id=GTM-5VLWP7")
//                                .headers(headers_10),
//                              http("request_54")
//                                .get(uri4 + "/d-6IYplOFocCacKzxwXSOJBw1xU1rKptJj_0jans920.woff2")
//                                .headers(headers_13),
//                              http("request_55")
//                                .get(uri4 + "/oMMgfZMQthOryQo9n22dcuvvDin1pK8aKteLpeZ5c0A.woff2")
//                                .headers(headers_13),
                              http("request_56")
                                .get(uri2 + "/assets/images/icons/arrows/ext_arrow_text_17px.png")
                                .headers(headers_3),
//                              http("request_57")
//                                .get(uri4 + "/Hgo13k-tfSpn0qi1SFdUfZBw1xU1rKptJj_0jans920.woff2")
//                                .headers(headers_13),
                              http("request_58")
                                .get(uri2 + "/assets/images/icons/note.png")
                                .headers(headers_3),
                              http("request_59")
                                .get(uri2 + "/assets/images/mygov-logos/mygovscot_195px.png")
                                .headers(headers_3),
                              http("request_60")
                                .get(uri2 + "/assets/images/scotland-office/so_crest_48px.png")
                                .headers(headers_3),
                              http("request_61")
                                .get(uri2 + "/assets/scripts/main.js")
                                .headers(headers_4),
                              http("request_62")
                                .get(uri2 + "/assets/scripts/mygov/format.business-rates-calculator.js")
                                .headers(headers_4),
                              http("request_63")
                                .get(uri2 + "/assets/scripts/mygov/analytics.js")
                                .headers(headers_4),
                              http("request_64")
                                .get(uri2 + "/assets/scripts/mygov/global.js")
                                .headers(headers_4),
                              http("request_65")
                                .get(uri2 + "/assets/scripts/mygov/pubsub.js")
                                .headers(headers_4),
                              http("request_66")
                                .get(uri2 + "/assets/scripts/vendor/require-handlebars-plugin/hbs/handlebars.js")
                                .headers(headers_4),
                              http("request_67")
                                .get(uri2 + "/assets/scripts/vendor/q/q.js")
                                .headers(headers_4),
                              http("request_68")
                                .get(uri2 + "/assets/scripts/mygov/gup.js")
                                .headers(headers_4),
                              http("request_69")
                                .get(uri2 + "/assets/scripts/vendor/jquery-auto-complete/jquery.auto-complete.min.js")
                                .headers(headers_4),
                              http("request_70")
                                .get(uri2 + "/assets/images/icons/notification_close_white.png")
                                .headers(headers_3)))
                          //,
//                              http("request_71")
//                                .get(uri1 + "/plugins/ua/linkid.js")
//                                .headers(headers_10),
//                              http("request_72")
//                                .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=pageview&_s=1&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&dp=%2Fbusiness-rates-calculator%2F%23introduction&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1655x575&je=0&fl=21.0%20r0&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-66930174-4&cd1=Business&cd2=Business%20Rates%20Calculator&cd3=Business%20Portal&gtm=GTM-5VLWP7&cd4=internal&z=1241331376")))
//                            .pause(3)
//                            .exec(http("request_73")
//                            .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=event&_s=2&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1670x575&je=0&fl=21.0%20r0&ec=link.internal&ea=click&el=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F%23property-address&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-51758325-1&cd1=Business%20Rates%20Calculator&cd2=Business&cd3=Business%20Portal&z=1408210318")
//                            .resources(
//                              http("request_74")
//                                .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=pageview&_s=1&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&dp=%2Fbusiness-rates-calculator%2F%23property-address&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1655x575&je=0&fl=21.0%20r0&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-66930174-4&cd1=Business&cd2=Business%20Rates%20Calculator&cd3=Business%20Portal&gtm=GTM-5VLWP7&cd4=internal&linkid=introduction&z=2111299159")))


                            }

                  .pause(5)




                  .feed(feeder)
                  .group("Perform postcode search") {


                      exec(http("request_75")
                        .get("/address/?search=${validPostCode}")
                        .headers(headers_75)
                        .resources(
//                          http("request_76")
//                        .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=event&_s=3&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1670x575&je=0&fl=21.0%20r0&ec=form&ea=submit&el=postcode-form&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-51758325-1&cd1=Business%20Rates%20Calculator&cd2=Business&cd3=Business%20Portal&z=1286059152"),
//                          http("request_77")
//                            .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=pageview&_s=4&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&dp=%2Fbusiness-rates-calculator%2F%3Fq%3DEH6%206QQ%26cat%3Dbusiness-rates-calculator&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1670x575&je=0&fl=21.0%20r0&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-51758325-1&cd1=Business%20Rates%20Calculator&cd2=Business&cd3=Business%20Portal&z=1141229008"),
                          http("request_78")
                            .get(uri2 + "/assets/images/async/ajax-loader-blue-lightest.gif")
                            .headers(headers_3)))
                        .pause(4)
//                        .exec(http("request_79")
//                        .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=event&_s=5&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1670x575&je=0&fl=21.0%20r0&ec=form&ea=submit&el=property-list&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-51758325-1&cd1=Business%20Rates%20Calculator&cd2=Business&cd3=Business%20Portal&z=308733115")
//                        .resources(http("request_80")
//                        .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=pageview&_s=1&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&dp=%2Fbusiness-rates-calculator%2F%23property-vacancy&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1655x575&je=0&fl=21.0%20r0&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-66930174-4&cd1=Business&cd2=Business%20Rates%20Calculator&cd3=Business%20Portal&gtm=GTM-5VLWP7&cd4=internal&linkid=property-list&z=622924946")))
//                        .pause(1)
                        .exec(http("request_81")
                        .get("/assets/images/icons/info_grey.png")
                        .headers(headers_3)
                        .resources(
//                          http("request_82")
//                        .get(uri4 + "/mnpfi9pxYH-Go5UiibESIpBw1xU1rKptJj_0jans920.woff2")
//                        .headers(headers_13),
                          http("request_83")
                            .get(uri2 + "/assets/images/icons/arrows/ext_arrow_text_17px_white.png")
                            .headers(headers_3),
//                          http("request_84")
//                            .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=event&_s=6&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1670x575&je=0&fl=21.0%20r0&ec=form&ea=submit&el=additional-data-form&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-51758325-1&cd1=Business%20Rates%20Calculator&cd2=Business&cd3=Business%20Portal&z=448818022"),
                          http("request_85")
                            .get(uri2 + "/assets/images/icons/refresh-primary_@2x.png")
                            .headers(headers_3)))
//                          http("request_86")
//                            .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=pageview&_s=1&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&dp=%2Fbusiness-rates-calculator%2F%23results&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1655x575&je=0&fl=21.0%20r0&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-66930174-4&cd1=Business&cd2=Business%20Rates%20Calculator&cd3=Business%20Portal&gtm=GTM-5VLWP7&cd4=internal&linkid=additional-data-form&z=1077907043")))
//                        .pause(5)
//                        .exec(http("request_87")
//                        .get(uri1 + "/collect?v=1&_v=j41&aip=1&a=332544856&t=event&_s=7&dl=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F&ul=en-us&de=UTF-8&dt=Business%20rates%20calculator%20-%20mygov.scot&sd=24-bit&sr=2048x1152&vp=1670x575&je=0&fl=21.0%20r0&ec=link.internal&ea=click&el=https%3A%2F%2Fperwww.mygov.scot%2Fbusiness-rates-calculator%2F%23introduction&_u=SCEAAEAjI~&jid=&cid=2114033079.1458150508&tid=UA-51758325-1&cd1=Business%20Rates%20Calculator&cd2=Business&cd3=Business%20Portal&z=1409246414")
//                        .resources(http("request_88")
//                        .get(uri1 + "/collect?v=1&_v=j41&aip=1&




                        }

                  .pause(5)

                  .group("Navigate back to Business Rates calculator"){


                      exec(http("request_89")
                        .get("/business-rates-calculator/")
                        .headers(headers_1))



                  }

                  .pause(5)

                  .group("Perform Street and City search"){

                          exec(http("request_90")
                            .get("/address/?search=Leith%20walk%20Edinburgh")
                            //.headers(headers_44)
                          )


                    }




}





