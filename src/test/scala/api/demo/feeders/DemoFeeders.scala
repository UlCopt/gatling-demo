package api.demo.feeders

import io.gatling.core.Predef._
import api.demo.DemoConfig
import io.gatling.core.feeder.BatchableFeederBuilder

class DemoFeeders {

  //location
  val dataFolder: String = DemoConfig.SITE_DATA_FOLDER

  //data
  val loginData: BatchableFeederBuilder[String]#F = csv(dataFolder + "loginCreds.csv").circular
}
