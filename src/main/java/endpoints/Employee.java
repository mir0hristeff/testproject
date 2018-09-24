package endpoints;

import core.Request;

import java.util.HashMap;
import java.util.Map;

public class Employee extends Request {
    private String baseUrl = "http://dummy.restapiexample.com/api/v1/";

    public static Map<String, String> createEmployeeDto(String name, String salary, String age) {
        Map<String, String> requestBody = new HashMap<String, String>();
        requestBody.put("name", name);
        requestBody.put("salary",salary);
        requestBody.put("age", age);
        return requestBody;
    }
}
