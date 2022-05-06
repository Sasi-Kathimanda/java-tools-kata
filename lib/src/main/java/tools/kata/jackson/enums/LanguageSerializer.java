package tools.kata.jackson.enums;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class LanguageSerializer extends StdSerializer<Language> {

    protected LanguageSerializer(Class<Language> t) {
        super(t);
    }

    public LanguageSerializer() {
        super(Language.class);
    }

    @Override
    public void serialize(Language value, JsonGenerator gen, SerializerProvider provider) throws IOException {
    }

}
