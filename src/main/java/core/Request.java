package core;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import enums.StatusCode;

import java.util.Map;

public class Request {
    private static Gson gson = new GsonBuilder().serializeNulls().serializeSpecialFloatingPointValues().create();

    public static  Response POST(String url, Map body, StatusCode statusCode){
        Response response = createRequestSpecification()
                .body(gson.toJson(body))
                .when()
                .expect().statusCode(statusCode.getStatusCode())
                .post(url);
        return response;
    }

    public static Response GET(String url, StatusCode statusCode){
        Response response = createRequestSpecification()
                .when()
                .expect().statusCode(statusCode.getStatusCode())
                .get(url);
        return response;
    }

    private static RequestSpecification createRequestSpecification() {
        return RestAssured.given();
    }
}
