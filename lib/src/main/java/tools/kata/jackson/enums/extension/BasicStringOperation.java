package tools.kata.jackson.enums.extension;

import java.util.Locale;

public enum BasicStringOperation implements StringOperation {
    TRIM("trim the leading and lagging spaces in the text") {
        @Override
        public String apply(String input) {
            return input.trim();
        }
    },
    UPPERCASE("convert the text to upper case") {
        @Override
        public String apply(String input) {
            return input.toUpperCase(Locale.ENGLISH);
        }
    },
    REVERSE("revers the text") {
        @Override
        public String apply(String input) {
            return new StringBuilder(input).reverse().toString();
        }
    };

    BasicStringOperation(String description) {
    }


}
