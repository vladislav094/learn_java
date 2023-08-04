package debug.specification;

import debug.ReadCountry;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

import static io.restassured.RestAssured.given;

public class WarmingUpTests {
    static int count = 0;
    @Test
    public void warmingUpForEachGEO() {
        ReadCountry.readFile(ReadCountry.outputFilePath).forEach((geo) -> {
            sendRequest(geo);
        });
        System.out.println(count);
    }

    @Test
    public void writeAllResultForEachGEO() {
        Set<String> set = new HashSet<>();
        ReadCountry.clearFileIfFull();
        ReadCountry.readFile(ReadCountry.outputFilePath).forEach((geo) -> {
            getResponse(geo);
        });

        System.out.println(count);
        for (String s: ReadCountry.set) {
            System.out.println(s);
        }
    }


    @Test
    public void sendRequest(String geo) {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpec());
        Response response = given()
                .post(geo);
        response.then().statusCode(200);
        count++;
    }

    @Test
    public void getResponse(String geo) {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpec());

        Response response = given()
                .queryParam("offset", 1)
                .get(geo);
        count++;
        String resp = response.asString();
        ReadCountry.set.add(resp);
//        ReadCountry.writeInFile(resp);

    }
}
