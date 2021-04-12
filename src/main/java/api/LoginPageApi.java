package api;

import static io.restassured.path.json.JsonPath.given;

public class LoginPageApi {

    public static void getSite() {
        given()
                .get("https://spb.rabota.ru/passport/sign-in/?redirectTo=%2F");
    }

    public static void main(String[] args) {
        getSite();
    }
}