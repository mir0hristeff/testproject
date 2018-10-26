package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scenarios.GetUsers

class EmployeesSimulation extends Simulation{
  val url = "http://dummy.restapiexample.com/api/v1/employees"
  val httpConfig = http.baseUrl(url)

  val employeeScenarios = List(
    GetUsers.getUsers.inject(atOnceUsers(5))
  )

  setUp(employeeScenarios)
    .protocols(httpConfig)
    .maxDuration(1)
}
