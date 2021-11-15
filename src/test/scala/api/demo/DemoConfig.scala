package api.demo

import api.base.BaseConfig

object DemoConfig extends BaseConfig {


  //service's config
  val SITE_DATA_FOLDER = s"src/test/scala/data/${DemoConfig.ENVIRONMENT}/";
  val DEMO_BODIES_FOLDER = "src/test/scala/api/service/bodies/"
  val BASE_URL: String = System.getProperty("baseUrl","https://reqres.in") //


}
