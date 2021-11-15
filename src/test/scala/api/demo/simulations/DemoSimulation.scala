package api.demo.simulations

import api.base.BaseSimulation
import api.demo.DemoConfig

class DemoSimulation extends BaseSimulation{

  val segPercentage: Array[Double] = DemoConfig.segPercentage
}
