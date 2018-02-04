package util



object Environment {

  val baseURL = scala.util.Properties.envOrElse("baseURL", "https://perwww.mygov.scot")

}
