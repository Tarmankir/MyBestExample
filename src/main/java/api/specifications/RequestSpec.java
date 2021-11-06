package api.specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static api.settings.ApiConfig.getApiSetting;

public class RequestSpec {

    public RequestSpecification defaultRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(getApiSetting("baseUrl"))
                .setAccept(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }
}