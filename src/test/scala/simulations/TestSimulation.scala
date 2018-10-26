package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class TestSimulation extends Simulation {

  val url = "http://dummy.restapiexample.com/"
  val httpProtocol = http
    .baseUrl(url)

  val getSpecificEmployee = "api/v1/employee/885"

  val getByIdScenario = scenario("getById")
    .exec(http("request_1")
      .get(getSpecificEmployee))

  setUp(getByIdScenario.inject(atOnceUsers(5))).protocols(httpProtocol)

}
