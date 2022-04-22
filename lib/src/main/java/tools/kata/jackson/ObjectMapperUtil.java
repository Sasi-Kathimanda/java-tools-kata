package tools.kata.jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtil {

    public <T> String writeJsonAsString(T anyType) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(anyType);
    }

    public Person readFromJsonString(String jsonString, Class<Person> personClass) {
        return new Person("", 1);
    }
}
