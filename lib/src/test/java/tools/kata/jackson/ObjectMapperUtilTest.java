package tools.kata.jackson;

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
    void writeJsonAsString() {
        Person person = new Person("Sas", 18);
        var actual = sut.writeJsonAsString(person, Person.class);
        assertEquals("{\"name\":\"Sas\",\"age\":18}", actual);
    }
}