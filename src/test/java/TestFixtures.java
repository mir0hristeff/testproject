import com.jayway.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestFixtures {

    String employee;
    String employees;
    String create;
    String update;
    String delete;

    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/";
        employee = "emplooyee";
        employees = "employees";
        create = "create";
        update = "update";
        delete = "delete";
    }
}
