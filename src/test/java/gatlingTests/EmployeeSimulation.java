package gatlingTests;

import com.jayway.restassured.response.Response;
import core.Request;
import enums.StatusCode;
import io.gatling.core.scenario.Simulation;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class EmployeeSimulation extends Simulation {

    static  String url = "http://dummy.restapiexample.com/api/v1/create";

    public static void main(String[] args) {
        int users = 5;
        List<Runnable> tasks = new ArrayList<Runnable>();

        for (int i = 0; i < users; i++){
            tasks.add(createEmployee());
        }

        ExecutorService executorService = Executors.newFixedThreadPool(users);
        tasks.forEach(executorService::execute);

    }

    public static Runnable createEmployee() {
        final Map<String, String> requestBody = new HashMap<String, String>();
        requestBody.put("name","newOne" + new Date().getTime());
        requestBody.put("salary", "3333");
        requestBody.put("age", "34");

        Runnable runnable = new Runnable() {
            public void run() {
                Response rc =  Request.POST(url, requestBody, StatusCode.OK);
                System.out.println(rc.asString());
            }
        };
        return runnable;
    }
}
