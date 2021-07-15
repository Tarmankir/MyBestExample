package api.testData;

import api.bodies.ResponseUserBody;

public class UserResponseData {

    public static ResponseUserBody defaultResponse() {
        ResponseUserBody responseUserBody = new ResponseUserBody();
        responseUserBody.setType("error");
        responseUserBody.setMessage("Пользователь с таким email уже существует ");
        return responseUserBody;
    }
}