package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LanguageDeserializerTest {
    ObjectMapper mapper;

    @BeforeEach
    void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    void givenLanguageDeserializer_ThenDeserialize_Json() throws JsonProcessingException {
        mapper.registerModule(new SimpleModule().addDeserializer(Language.class, new LanguageDeserializer()));
        LanguageDto languageDto = mapper.readValue("{\"language\":\"TELUGU\"}", LanguageDto.class);
        Assertions.assertEquals(Language.TELUGU, languageDto.getLanguage());
    }

    private static final class LanguageDto {
        private Language language;
        public LanguageDto() {
        }
        public Language getLanguage() {
            return language;
        }
    }
}