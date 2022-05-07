package tools.kata.jackson.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Language {
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
}
