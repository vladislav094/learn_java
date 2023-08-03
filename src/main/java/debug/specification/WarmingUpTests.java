package debug.specification;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class WarmingUpTests {

    @Test
    public void sendRequest() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpec());

        Response response = given()
                .get(Specifications.URL);

    }
}
