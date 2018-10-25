import com.jayway.restassured.response.Response;
import core.Request;
import enums.StatusCode;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeTest extends TestFixtures{

    @Test
    public void getAllemployeesAsJason() {
       Response rc =  Request.GET(employees, StatusCode.OK);
    }

    @Test
    public void createNewEmployee() {
        Map<String, String> requestBody = new HashMap<String, String>();
        requestBody.put("name","newOne" + new Date().getTime());
        requestBody.put("salary", "3333");
        requestBody.put("age", "34");

       Response rc =  Request.POST(create, requestBody, StatusCode.OK);
        System.out.println(rc.asString());
    }
}
