package tools.kata.jackson.enums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LanguageTest {
    Language sut;

    @BeforeEach
    void setUp() {
    }

    @Test
    void values() {
        assertEquals(3, Language.values().length);
        assertEquals(Language.TELUGU, Language.values()[0]);
        assertEquals(Language.ENGLISH, Language.values()[1]);
        assertEquals(Language.TAMIL, Language.values()[2]);
    }

    @Test
    void valueOf() {
    }
}