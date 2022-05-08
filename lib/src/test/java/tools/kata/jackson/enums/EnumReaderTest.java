package tools.kata.jackson.enums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumReaderTest {
    EnumReader sut;
    @BeforeEach
    void setUp(){
        sut = new EnumReader();
    }
    @Test
    void givenJsonWithEnum_ShouldReturnEnumName() {
        Language actual = sut.readValue("",Language.class);
        assertEquals(Language.TELUGU, actual);
    }

}