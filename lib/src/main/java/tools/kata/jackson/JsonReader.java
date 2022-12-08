package tools.kata.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class JsonReader {
    protected  <T> T readFromJsonString(String jsonString, Class<T> aClass) throws JsonProcessingException {
        return new ObjectMapper().readValue(jsonString, aClass);
    }

    protected <T> T readFromJsonString(String jsonString, Class<T> aClass, ObjectMapper mapper) throws JsonProcessingException {
        return mapper.readValue(jsonString, aClass);
    }

    protected <T> T readFromJsonFile(File file, Class<T> aClass) throws IOException {
        return new ObjectMapper().readValue(file, aClass);
    }

    protected <T> T readFromURL(URL url, Class<T> aClass) throws IOException {
        return new ObjectMapper().readValue(url, aClass);
    }

    protected <T> T readListFromJsonString(String json, TypeReference<T> typeReference) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, typeReference);
    }

    public Map<String, String> readAsMapFromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, new TypeReference<>() {
        });
    }
}
