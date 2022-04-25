package tools.kata.jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class ObjectMapperUtil {

    protected  <T> String writeJsonAsString(T anyType) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(anyType);
    }

    protected  <T> T readFromJsonString(String jsonString, Class<T> aClass) throws JsonProcessingException {
        return new ObjectMapper().readValue(jsonString, aClass);
    }

    protected <T> T readFromJsonFile(File file, Class<T> aClass) throws IOException {
        return new ObjectMapper().readValue(file, aClass);
    }

    protected <T> T readFromURL(URL url, Class<T> aClass) throws IOException {
        return new ObjectMapper().readValue(url, aClass);
    }
    //TODO: accept generic type ?
    protected List<Person> readListFromJsonString(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, new TypeReference<>() {});
    }

    public Map<String, String> readAsMapFromJson(String json) {
        return Map.of();
    }
}
