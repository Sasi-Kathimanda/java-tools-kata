package tools.kata.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObjectMapperUtilTest {
    public static final String PERSON_JSON = "{\"name\":\"Sas\",\"age\":18}";
    public static final String PERSONS_LIST_JSON = "[{\"name\":\"Sas\",\"age\":18}, {\"name\":\"Kiran\",\"age\":28}]";
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

    @Test
    void readPersonFromURL() throws IOException {
        Person actual = sut.readFromURL(new URL("file:src/test/resources/person.json"), Person.class);
        assertEquals("Sas", actual.getName());
        assertEquals(18, actual.getAge());
    }

    @Test
    void readPersonsFromJson() throws JsonProcessingException {
        List<Person> actual = sut.readListFromJsonString(PERSONS_LIST_JSON);
        assertEquals(2, actual.size());
        assertEquals("Sas", actual.get(0).getName());
        assertEquals(18, actual.get(0).getAge());
        assertEquals("Kiran", actual.get(1).getName());
        assertEquals(28, actual.get(1).getAge());
    }

    @Test
    void readAsMapFromJson() {
        Map<String, String> map = sut.readAsMapFromJson(PERSON_JSON);
        assertEquals(1, map.size());
    }
}