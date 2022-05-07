package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class LanguageSerializerWithMaskedMsg extends JsonSerializer<Language> {

    @Override
    public void serialize(Language value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

    }
}
