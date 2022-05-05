package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumWriterTest {
    EnumWriter sut;
    private final String EXPECTED_DEFAULT_ENUM = "\"TELUGU\"";

    @BeforeEach
    void setUp() {
        sut = new EnumWriter();
    }

    @Test
    void testEnumWriterDefaultBehaviour() throws JsonProcessingException {
        var actualEnumString = sut.writeEnumAsJsonString(Language.TELUGU);
        assertEquals(EXPECTED_DEFAULT_ENUM, actualEnumString);
    }

}