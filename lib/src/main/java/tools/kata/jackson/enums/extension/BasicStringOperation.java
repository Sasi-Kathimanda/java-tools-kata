package tools.kata.jackson.enums.extension;

public enum BasicStringOperation implements StringOperation {
    TRIM("trim the leading and lagging spaces in the text") {
        @Override
        public String apply(String input) {
            return "";
        }

    },
    UPPERCASE("convert the text to upper case") {
        @Override
        public String apply(String input) {
            return null;
        }
    },
    REVERSE("revers the text") {
        @Override
        public String apply(String input) {
            return null;
        }
    };

    BasicStringOperation(String description) {
        this.description = description;
    }

    private final String description;

    @Override
    public String getDescription() {
        return description;
    }

}
