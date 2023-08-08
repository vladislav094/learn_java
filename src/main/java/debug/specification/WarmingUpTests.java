package debug.specification;

import debug.ReadCountry;
import io.restassured.filter.Filter;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import static io.restassured.RestAssured.given;

public class WarmingUpTests {
    static Set<String> setWithGetResponse = new HashSet<>();
    static Set<String> setWithPostResponse = new HashSet<>();

    @Test
    public void warmingUpForEachGEO() {
        ReadCountry.clearFileIfFull(ReadCountry.fileOfPostRequest);
        ReadCountry.readFile(ReadCountry.outputFilePath).stream().forEachOrdered(this::sendRequest);
        for (String s: setWithPostResponse) {
            ReadCountry.writeInFile(s, ReadCountry.fileOfPostRequest);
        }
    }

    @Test
    public void writeAllResultForEachGEO() {
        ReadCountry.clearFileIfFull(ReadCountry.fileWithGetRequestResults);
        ReadCountry.readFile(ReadCountry.outputFilePath).forEach(this::getResponse);
        for (String s: setWithGetResponse) {
            ReadCountry.writeInFile(s, ReadCountry.fileWithGetRequestResults);
        }

    }


    @Test
    public void sendRequest(String geo) {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpec());
        Response response = given()
                .post(geo);
        response.then().statusCode(200);
//        String resp = response.asPrettyString();
//        System.out.println(resp);
//        WarmingUpTests.setWithPostResponse.add(resp);

    }

    @Test
    public void getResponse(String geo) {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpec());
        Response response = given()
                .queryParam("offset", 1)
                .get(geo);
        String resp = response.asString();
        WarmingUpTests.setWithGetResponse.add(resp);
    }
}
