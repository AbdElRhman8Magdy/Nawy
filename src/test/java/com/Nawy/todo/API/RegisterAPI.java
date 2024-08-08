package com.Nawy.todo.API;

import com.Nawy.todo.base.config.EndPoint;
import com.Nawy.todo.base.utils.UserUtils;
import com.Nawy.todo.objects.User;
import com.Nawy.todo.pages.LoginPage;
import io.restassured.http.Cookie;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RegisterAPI {

    private List<Cookie> RestAssurCookeis;
    private String AccessToken;
    private String userID;
    private String employeeId;
    private String EmpNumber;

    public List<Cookie> getCookeis() {
        return this.RestAssurCookeis;
    }
    public String getToken() {
        return AccessToken;
    }
    public String getUserID() {
        return this.userID;
    }
    public String getEmployeeId() {
        return this.employeeId;
    }
    public String SetEmployeeId() {
        return this.employeeId;
    }
    public String getEmpNumber(){
        return this.EmpNumber;

    }



    public void register(LoginPage loginPage) {


        User RegisterBody = UserUtils.GenerateRndmUserNAme();



        Response response=
                given()
                        .baseUri(EndPoint.API_BaseURI_ENDPOINT_Task)

                        .headers("Content-Type","application/json")
                        .body(RegisterBody)
                        .log().all()
                .when()
                        .post(EndPoint.API_REGISTER_ENDPOINT_Task)
                        .then()
                        .log().all()
                        .extract().response()
                ;

        if(response.statusCode() !=200){
            throw new   RuntimeException("Error with request ->response code package com.nawy.todo.API line 65"+ response.statusCode());
        }






//        JsonPath jsonPathEvaluator = response.jsonPath();
//        EmpNumber = jsonPathEvaluator.getString("data.empNumber");
//        System.out.println((jsonPathEvaluator.getString("data.empNumber")));
//
//        return new String(EmpNumber);





    }
}
