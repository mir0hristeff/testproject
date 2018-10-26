package scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetUsers {

  val getUserHttp = http("get a given user").get("").check(status is 200)
  val getUsers = scenario("get users").exec(getUserHttp)
}
