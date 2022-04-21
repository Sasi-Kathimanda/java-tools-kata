package tools.kata.jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtil {

    public <T> String writeJsonAsString(T person) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(person);
    }
}
