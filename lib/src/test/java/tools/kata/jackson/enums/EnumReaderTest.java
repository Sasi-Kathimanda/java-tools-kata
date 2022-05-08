package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumReaderTest {
    EnumReader sut;

    @BeforeEach
    void setUp() {
        sut = new EnumReader();
    }

    @Test
    void givenJsonWithEnumName_ShouldReturnMatchingEnum() throws JsonProcessingException {
        Language actual = sut.readValue("\"TELUGU\"", Language.class);
        assertEquals(Language.TELUGU, actual);
    }

}