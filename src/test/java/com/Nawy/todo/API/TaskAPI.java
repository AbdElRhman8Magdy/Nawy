package com.Nawy.todo.API;

import com.Nawy.todo.base.config.EndPoint;
import com.Nawy.todo.base.utils.ConfigUtils;
import com.Nawy.todo.objects.User;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TaskAPI extends RegisterAPI{
    private String RegisterBody;

    public TaskAPI() {
    }

    public void useRegisterBody() {
        RegisterAPI registerApi = new RegisterAPI();
        registerApi.register(new TaskAPI()); // Assuming you have a LoginPage instance

        String registerBody = registerApi.getRegisterBody();
        // Use registerBody as needed
    }


    public String AddTask(){

        RegisterAPI registerApi = new RegisterAPI();
//        registerApi.register(new TaskAPI());
        String UserName = ConfigUtils.GetInstance().ReturnEmail();
        String Password = ConfigUtils.GetInstance().ReturnPassword();
        User StticUser = new User(UserName,Password);

        Response response=
                given()
                        .baseUri(EndPoint.API_BaseURI_ENDPOINT_Task)
                        .cookie("orangehrm")
                        .header("Content-Type","application/json")
                        .body(StticUser)
                        .log().all()
                .when()
                        .post(EndPoint.API_TASK_ENDPOINT)
                .then()
                        .log().all()
                        .extract().response()
                ;

        if(response.statusCode() !=200){
            throw new   RuntimeException("2na 2ly kateb da   Error with request ->response code package com.qacart.todo.TaskAPI line 29"+ "  "+ response.statusCode());
        }

        JsonPath jsonPathEvaluator = response.jsonPath();
        String sinNumber = jsonPathEvaluator.get("data.Auth_token");
        System.out.println(sinNumber);
        return new String(sinNumber);
    }


}
