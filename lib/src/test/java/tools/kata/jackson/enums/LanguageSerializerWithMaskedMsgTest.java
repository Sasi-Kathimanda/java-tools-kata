package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LanguageSerializerWithMaskedMsgTest {
    ObjectMapper mapper;

    @BeforeEach
    void setUp() {
        mapper = new ObjectMapper();
        mapper.registerModule(new SimpleModule().addSerializer(Language.class, new LanguageSerializerWithMaskedMsg()));
    }

    @Test
    void givenEnglishLanguage_ThenWelcomeMsg_ShouldMasked() throws JsonProcessingException {
        String actualJson = mapper.writeValueAsString(Language.ENGLISH);
        Assertions.assertEquals("{\"prefix\":\"ENG\",\"message\":\"****\"}", actualJson);


    }

}