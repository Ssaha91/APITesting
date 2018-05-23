package pages;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class APIPage {

    public void statusCodeVerification(){
        given()
                .param("units", "imperial")
                .param("origins", "Washington,DC")
                .param("destinations", "New+York+City,NY")
                .param("key", "AIzaSyDJCanQ624S8bIpdfOXHgnG8JiJJ2Y2FAI")
                .when()
                .get("/distancematrix/json")
                .then()
                .statusCode(200);
    }

    public void responseVerification(){
        Response rs  =
                given()
                        .param("units", "imperial")
                        .param("origins", "Washington,DC")
                        .param("destinations", "New+York+City,NY")
                        .param("key", "AIzaSyDJCanQ624S8bIpdfOXHgnG8JiJJ2Y2FAI")
                        .when()
                        .get("/distancematrix/json");

        System.out.println(rs.body().prettyPrint());

    }


}
