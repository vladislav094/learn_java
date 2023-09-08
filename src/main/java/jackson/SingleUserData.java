package jackson;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


//@Getter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SingleUserData {
    @Getter(AccessLevel.PUBLIC)
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

}
