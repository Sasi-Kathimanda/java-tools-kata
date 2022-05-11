package tools.kata.jackson.enums.thirdparty;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class ImmutableOperation {
    protected static final Map<RemoteEnum, Function<String, String>> OPERATION_MAP;

    static {
        OPERATION_MAP = new EnumMap<>(RemoteEnum.class);
        OPERATION_MAP.put(RemoteEnum.LOWERCASE, String::toLowerCase);
        OPERATION_MAP.put(RemoteEnum.INVERT_CASE, ImmutableOperation::reverseCase);
        OPERATION_MAP.put(RemoteEnum.REMOVE_WHITESPACES, s -> "");
    }

    private static String reverseCase(final String text) {
        var chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    private ImmutableOperation() {
    }
}
