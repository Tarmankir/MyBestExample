package api.testData;

import api.bodies.ResponseCreateUserBody;

public class CreateUserResponseData {

    public static ResponseCreateUserBody defaultResponse() {
        ResponseCreateUserBody responseCreateUserBody = new ResponseCreateUserBody();
        responseCreateUserBody.setType("error");
        responseCreateUserBody.setMessage("Пользователь с таким email уже существует ");
        return responseCreateUserBody;
    }
}