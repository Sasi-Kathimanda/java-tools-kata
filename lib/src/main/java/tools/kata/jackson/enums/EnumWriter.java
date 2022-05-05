package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EnumWriter {

    public String writeEnumAsJsonString(Language enumObj) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(enumObj);
    }

    public String writeEnumAsJsonString(Language enumObj, ObjectMapper objectMapper) throws JsonProcessingException {
        return objectMapper.writeValueAsString(enumObj);
    }
}
