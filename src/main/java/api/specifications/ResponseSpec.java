package api.specifications;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

import static org.apache.http.HttpStatus.SC_OK;

public class ResponseSpec {

    public ResponseSpecification defaultResponseSpec() {
        return new ResponseSpecBuilder()
                .expectStatusCode(SC_OK)
                .expectContentType(ContentType.JSON)
                .build();
    }
}