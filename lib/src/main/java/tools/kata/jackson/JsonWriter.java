package tools.kata.jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWriter {

    protected  <T> String writeJsonAsString(T anyType) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(anyType);
    }
}
