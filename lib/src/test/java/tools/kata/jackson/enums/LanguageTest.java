package tools.kata.jackson.enums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanguageTest {
    Language sut;

    @BeforeEach
    void setUp() {
    }

    @Test
    void values() {
        assertEquals(3, Language.values().length);
    }

    @Test
    void valueOf() {
    }
}