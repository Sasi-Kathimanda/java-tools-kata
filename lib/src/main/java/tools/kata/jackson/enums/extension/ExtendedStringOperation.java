package tools.kata.jackson.enums.extension;

public enum ExtendedStringOperation implements StringOperation {
    MD5_ENCODE("encode the text to md5 string"){
        @Override
        public String apply(String input) {
            return "";
        }
    },
    BASE64_ENCODE("encode the text to base 64 encoded string") {
        @Override
        public String apply(String input) {
            return "";
        }
    };

    private final String description;

    ExtendedStringOperation(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
