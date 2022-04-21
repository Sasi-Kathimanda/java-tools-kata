package tools.kata.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectMapperUtilTest {
    ObjectMapperUtil sut;

    @BeforeEach
    void setUp() {
        sut = new ObjectMapperUtil();
    }

    @Test
    void writeJsonAsString() throws JsonProcessingException {
        Person person = new Person("Sas", 18);
        var actual = sut.writeJsonAsString(person);
        assertEquals("{\"name\":\"Sas\",\"age\":18}", actual);
    }
}