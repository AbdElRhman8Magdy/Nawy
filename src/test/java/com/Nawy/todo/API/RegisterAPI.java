package com.Nawy.todo.API;

import com.Nawy.todo.base.config.EndPoint;
import com.Nawy.todo.objects.User;
import io.restassured.response.Response;

import static com.Nawy.todo.base.utils.UserUtils.getRandomString;
import static io.restassured.RestAssured.given;

public class RegisterAPI {


    public String RegisterBody;
    private String APIUser;




    public User register(TaskAPI api) {


//        User RegisterBody = UserUtils.GenAPIUSerData();
        String UserName = "Magdy"+getRandomString(6,true,true) + "@gmail.com";
        String Password = "Magdy"+getRandomString(6,true,true) ;
        User APIUser = new User(UserName,Password);



        Response response=
                given()
                        .baseUri(EndPoint.API_BaseURI_ENDPOINT_Task)

                        .headers("Content-Type","application/json")
                        .body(APIUser)
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



     return (APIUser);


    }

    protected String getRegisterBody() {
        return APIUser;
    }
}
