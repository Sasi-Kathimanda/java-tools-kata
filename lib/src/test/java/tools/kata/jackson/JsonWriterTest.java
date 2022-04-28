package tools.kata.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonWriterTest {
    public static final String PERSON_JSON = "{\"name\":\"Sas\",\"age\":18}";
    JsonWriter sut;
    Person person = new Person("Sas", 18);

    @BeforeEach
    void setUp() {
        sut = new JsonWriter();
    }

    @Test
    void writeJsonAsString() throws JsonProcessingException {
        var actual = sut.writeJsonAsString(person);
        assertEquals(PERSON_JSON, actual);
    }
}