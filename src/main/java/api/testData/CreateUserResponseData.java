package api.testData;

import api.bodies.ResponseCreateUserBody;

public class CreateUserResponseData {

    public static ResponseCreateUserBody defaultResponse() {
        ResponseCreateUserBody responseCreateUserBody = new ResponseCreateUserBody();
        responseCreateUserBody.setEmail("test_cu_6@mail.com");
        return responseCreateUserBody;
    }
}