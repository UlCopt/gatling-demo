package api.demo.scenarios

import api.demo.chainbuilders.DemoChainBuilder
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder

object DemoScenario {

  def userLogin(stage:String): ScenarioBuilder = {
    scenario(s"User Login - Stage: ${stage}")
      .exec(DemoChainBuilder.userLogin)
  }



}
