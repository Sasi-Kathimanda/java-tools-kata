package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(EXPECTED_ENUM, actualEnumString);// This achieved by using this @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    }

    @Test
    void testEnumWriterWithJsonPropertyShapeObjectIsON() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        var actualEnumString = sut.writeEnumAsJsonString(Language.TELUGU , objectMapper);
        assertEquals(EXPECTED_ENUM, actualEnumString);
    }

}