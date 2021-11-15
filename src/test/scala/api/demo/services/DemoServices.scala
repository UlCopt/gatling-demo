package api.demo.services

import api.demo.DemoConfig
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.ChainBuilder

object DemoServices {

  private val SERVICE = "/api"
  private val POST_LOGIN = "/login"


  val demoHeaders = Map(

  )


  val userLogin: ChainBuilder = exec(http(s"POST $POST_LOGIN" )
    .post(DemoConfig.BASE_URL + SERVICE+  POST_LOGIN)
    .headers(demoHeaders)
    .body(ElFileBody("${request}")).asJson
    .check(status.is(200))
    .check(regex("token").find.exists)
    .check(jsonPath("$.token").saveAs("TOKEN"))
  )

}
