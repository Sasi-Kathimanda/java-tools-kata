package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumWriterTest {
    EnumWriter sut;
    private final String EXPECTED_DEFAULT_ENUM = "\"TELUGU\"";
    private final String EXPECTED_ENUM = "{\"prefix\":\"TEL\",\"message\":\"Namaskaram\"}";

    @BeforeEach
    void setUp() {
        sut = new EnumWriter();
    }

    @Test
    void testEnumWriterDefaultBehaviour() throws JsonProcessingException {
        var actualEnumString = sut.writeEnumAsJsonString(Language.TELUGU);
        assertEquals(EXPECTED_ENUM, actualEnumString);
    }

    @Test
    void testEnumWriterWithJsonPropertyShapeObjectIsON() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING); //TODO: no impact?
        var actualEnumString = sut.writeEnumAsJsonString(Language.TELUGU , objectMapper);
        assertEquals(EXPECTED_ENUM, actualEnumString);
    }

}