package api.demo.feeders


object DemoFeederData extends DemoFeeders {


  val userLoginFeeder :Iterator[Map[String, String]] = Iterator.continually(Map(
    "LOGIN_EMAIL" -> "eve.holt@reqres.in",
    "LOGIN_PASSWORD" -> "cityslicka"
  ))

}
