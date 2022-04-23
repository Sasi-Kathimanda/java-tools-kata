package tools.kata.jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ObjectMapperUtil {

    public <T> String writeJsonAsString(T anyType) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(anyType);
    }

    public <T> T readFromJsonString(String jsonString, Class<T> personClass) throws JsonProcessingException {
        return new ObjectMapper().readValue(jsonString, personClass);
    }

    public <T> T readFromJsonFile(File file, Class<T> aClass) throws IOException {
        return new ObjectMapper().readValue(file, aClass);
    }

    public <T> T readFromURL(URL url, Class<T> aClass) throws IOException {
        return new ObjectMapper().readValue(url, aClass);
    }
}
