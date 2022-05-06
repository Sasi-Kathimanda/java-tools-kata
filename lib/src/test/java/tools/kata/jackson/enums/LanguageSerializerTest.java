package tools.kata.jackson.enums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class LanguageSerializerTest {
    LanguageSerializer sut;

    @BeforeEach
    void setUp() {
        sut = new LanguageSerializer();
    }

    @Test
    void serializeWillSpecifyTheStructureOfEnumYouLike() throws IOException {
        sut.serialize(Language.TELUGU, null, null);
    }
}