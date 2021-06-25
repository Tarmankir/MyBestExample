package api.testData;

import api.bodies.ResponseCompanyBody;

public class CompanyResponseData {

    public static ResponseCompanyBody defaultResponse() {
        ResponseCompanyBody responseCompanyBody = new ResponseCompanyBody();
        responseCompanyBody.setType("success");
//        responseCompanyBody.setId_company(63);
        return responseCompanyBody;
    }
}