package tools.kata.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonWriterTest {
    public static final String PERSON_JSON = "{\"name\":\"Sas\",\"age\":18,\"dob\":470830530000}";
    public static final String PERSON_JSON_HUMAN_READABLE_DATE = "{\"name\":\"Sas\",\"age\":18,\"dob\":\"1984-12-02T10:15:30.000+00:00\"}";
    JsonWriter sut;
    Person person = new Person("Sas", 18, Residence.FLAT, Date.from(Instant.parse("1984-12-02T10:15:30.00Z")));

    @BeforeEach
    void setUp() {
        sut = new JsonWriter();
    }

    @Test
    void writeJsonAsString() throws JsonProcessingException {
        var actual = sut.writeJsonAsString(person, new ObjectMapper());
        assertEquals(PERSON_JSON, actual);
    }

    @Test
    @DisplayName("WRITE_DATES_AS_TIMESTAMPS")
    void writeDatesAsHumanReadable() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        var actual = sut.writeJsonAsString(person, mapper);
        assertEquals(PERSON_JSON_HUMAN_READABLE_DATE, actual);
    }
}