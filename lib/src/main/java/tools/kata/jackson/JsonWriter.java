package tools.kata.jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWriter {

    protected  <T> String writeJsonAsString(T anyType , ObjectMapper mapper) throws JsonProcessingException {
        return mapper.writeValueAsString(anyType);
    }
}
