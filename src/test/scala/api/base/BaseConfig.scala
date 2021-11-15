package api.base

class BaseConfig {

  //base configs
  val TOKEN_AUTH: String = System.getenv("TOKEN_AUTH")
  val ENVIRONMENT: String = System.getProperty("environment","staging")
  val tokenAuthorization: String = "Bearer " + TOKEN_AUTH

  val segPercentage: Array[Double] = Array(0.15,0.17,0.20,0.25,0.13,0.10)
}
