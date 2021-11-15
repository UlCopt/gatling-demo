package api.base

import api.demo.DemoConfig
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class BaseSimulation extends Simulation{

  before {
    println("Running hook BEFORE...")
    println("Simulation is about to start!")
    Thread.sleep(5000)
    println("Started...")
  }

  after {
    println("Simulation is finished!")
    println("Running hook AFTER...")
  }



  val httpConf: HttpProtocolBuilder = http
    .baseUrl(DemoConfig.BASE_URL)
    .warmUp(DemoConfig.BASE_URL)
    .silentResources
    .userAgentHeader("")

}
