package tools.kata.jackson.enums;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class LanguageSerializerTest {
    LanguageSerializer sut;
    ObjectMapper mapper;

    @BeforeEach
    void setUp() {
        sut = new LanguageSerializer();
        mapper = new ObjectMapper();
    }

    @Test
    void serializeWillSpecifyTheStructureOfEnumYouLike() throws IOException {
        String actual = mapper.writeValueAsString(Language.TELUGU);
        Assertions.assertEquals("{\"prefix\":\"TEL\",\"message\":\"Namaskaram\"}", actual);
    }
}