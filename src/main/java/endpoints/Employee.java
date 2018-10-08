package endpoints;

import com.jayway.restassured.response.Response;
import core.Request;
import enums.StatusCode;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String salary;
    private String age;

    public static Response createEmployee(String name, String salary, String age, String url) {
        Map<String, String> requestBody = new HashMap<String, String>();
        requestBody.put("name", name);
        requestBody.put("salary",salary);
        requestBody.put("age", age);

       Response employee  = Request.POST(url, requestBody, StatusCode.OK);
       return employee;

    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
