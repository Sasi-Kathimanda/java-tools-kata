package tools.kata.jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ObjectMapperUtil {

    protected  <T> String writeJsonAsString(T anyType) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(anyType);
    }

    protected  <T> T readFromJsonString(String jsonString, Class<T> aClass) throws JsonProcessingException {
        return new ObjectMapper().readValue(jsonString, aClass);
    }

    protected  <T> T readFromJsonFile(File file, Class<T> aClass) throws IOException {
        return new ObjectMapper().readValue(file, aClass);
    }

    protected  <T> T readFromURL(URL url, Class<T> aClass) throws IOException {
        return new ObjectMapper().readValue(url, aClass);
    }

    protected  <T> List<T> readListFromJsonString(String json, Class<T> aClass) {
        return new ArrayList<>();
    }
}
