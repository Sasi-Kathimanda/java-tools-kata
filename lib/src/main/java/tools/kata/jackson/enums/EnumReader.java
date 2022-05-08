package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EnumReader {
    public Language readValue(String json, Class<Language> languageClass) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, languageClass);
    }
}
