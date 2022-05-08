package tools.kata.jackson.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Language {
    @JsonProperty("TELUGU")
    TELUGU(1, "TEL", "Namaskaram"),
    ENGLISH(2, "ENG", "HELLO"),
    TAMIL(3, "TAM", "Vanakkam");

    final int index;
    final String prefix;
    final String message;

    Language(int index, String prefix, String message) {
        this.index = index;
        this.prefix = prefix;
        this.message = message;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getMessage() {
        return message;
    }

    @JsonCreator
    public static Language forValues(@JsonProperty("prefix") String prefix, @JsonProperty("message") String message) {
        for (Language language : Language.values()) {
            if (language.prefix.equals(prefix) && language.message.equalsIgnoreCase(message)) {
                return language;
            }
        }
        throw new IllegalArgumentException(String.format("Unknown Language with details %s %s", prefix, message));
    }
}
