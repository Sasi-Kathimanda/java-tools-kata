package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EnumWriter {

    public String writeEnumAsJsonString(Language enumObj) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(enumObj);
    }
}
