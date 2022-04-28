package tools.kata.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class JsonWriterTest {
    public static final String PERSON_JSON = "{\"name\":\"Sas\",\"age\":18,\"dob\":470830530000}";
    JsonWriter sut;
    Person person = new Person("Sas", 18 , Date.from(Instant.parse("1984-12-02T10:15:30.00Z")));

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