package tools.kata.jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ObjectMapperUtil {

    public <T> String writeJsonAsString(T anyType) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(anyType);
    }

    public Person readFromJsonString(String jsonString, Class<Person> personClass) throws JsonProcessingException {
        return new ObjectMapper().readValue(jsonString,personClass);
    }

    public Person readFromJsonFile(File file, Class<Person> personClass) {
        return new Person("",0);
    }
}
