package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class JacksonTest {

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void pojoToJsonString() throws JsonProcessingException {

        SingleUserData userData1 = new SingleUserData(1, "mase@mail.com", "Tom", "Hanks", "avatar.png");
        String json = objectMapper.writeValueAsString(userData1);
        SingleUserData userData = new SingleUserData();
        System.out.println(json);
    }

    @Test
    void jsonStringToPojo() throws JsonProcessingException {
        String employee = "{\"id\": \"2\", \"email\": \"garbage@gmail.com\", \"first_name\": \"Jalil\", \"last_name\": \"Toi\", \"avatar\": \"ava2.pdf\"}";
        SingleUserData userData2 = objectMapper.readValue(employee, SingleUserData.class);
        System.out.println(userData2.getId());

    }
}
