package api.testData;

import api.bodies.ResponseCompanyBody;

public class CompanyResponseData {

    public static ResponseCompanyBody defaultResponse() {
        ResponseCompanyBody responseCompanyBody = new ResponseCompanyBody();
        responseCompanyBody.setId_company(123);

        return responseCompanyBody;
    }
}