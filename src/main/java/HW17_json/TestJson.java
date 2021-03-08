package HW17_json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestJson {
    public List<PersonJson> getPersons(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<PersonJson> personJson = new ArrayList<>();
        try {
            personJson = Arrays.asList(objectMapper.readValue(json, PersonJson.class));
        } catch (IOException e) {
            System.out.println(e);
        }
        return personJson;
    }
}
