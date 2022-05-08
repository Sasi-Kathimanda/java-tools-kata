package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumReaderTest {
    EnumReader sut;

    @BeforeEach
    void setUp() {
        sut = new EnumReader();
    }

    @Test
    @Disabled
    void givenJsonWithEnumName_ShouldReturnMatchingEnum() throws JsonProcessingException {
        Language actual = sut.readValue("\"TELUGU\"", Language.class); //TODO: doesn't it accept it anymore after introducing JsonCreator?
        assertEquals(Language.TELUGU, actual);
    }

    @Test
    void givenValidJson_ShouldReturnMatchingEnum() throws JsonProcessingException {
        Language actual = sut.readValue("{\"prefix\":\"TAM\",\"message\":\"Vanakkam\"}", Language.class);
        assertEquals(Language.TAMIL, actual);
    }

}