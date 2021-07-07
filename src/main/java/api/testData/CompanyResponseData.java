package api.testData;

import api.bodies.ResponseCompanyBody;

public class CompanyResponseData {

    public static ResponseCompanyBody defaultResponse() {
        ResponseCompanyBody responseCompanyBody = new ResponseCompanyBody();
        responseCompanyBody.setType("error");
        responseCompanyBody.setMessage(" company_users  не указаны сотрудники");
        return responseCompanyBody;
    }
}