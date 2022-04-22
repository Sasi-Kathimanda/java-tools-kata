package tools.kata.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ObjectMapperUtilTest {
    public static final String PERSON_JSON = "{\"name\":\"Sas\",\"age\":18}";
    ObjectMapperUtil sut;
    Person person = new Person("Sas", 18);

    @BeforeEach
    void setUp() {
        sut = new ObjectMapperUtil();
    }

    @Test
    void writeJsonAsString() throws JsonProcessingException {
        var actual = sut.writeJsonAsString(person);
        assertEquals(PERSON_JSON, actual);
    }

    @Test
    void readPersonFromJson() throws JsonProcessingException {
        Person actual = sut.readFromJsonString(PERSON_JSON, Person.class);
        assertEquals("Sas", actual.getName());
        assertEquals(18, actual.getAge());
    }

    @Test
    void readPersonFromJsonAsFile() throws IOException {
        Person actual = sut.readFromJsonFile(new File("src/test/resources/person.json"), Person.class);
        assertEquals("Sas", actual.getName());
        assertEquals(18, actual.getAge());
    }
}