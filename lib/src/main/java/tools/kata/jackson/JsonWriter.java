package tools.kata.jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class JsonWriter {

    protected  <T> String writeJsonAsString(T anyType) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(anyType);
    }
}
