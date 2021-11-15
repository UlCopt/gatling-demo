package api.demo.chainbuilders
import api.demo.DemoConfig
import api.demo.feeders.DemoFeederData
import api.demo.services.DemoServices
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder

object DemoChainBuilder {

  val userLogin:ChainBuilder =
    exec(
      session => {
        session.set("request", DemoConfig.DEMO_BODIES_FOLDER + "login.json")
      }
    ).
      feed(DemoFeederData.loginData)
      .exec(DemoServices.userLogin)

}
