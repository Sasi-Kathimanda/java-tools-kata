package tools.kata.jackson.enums.thirdparty;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class ImmutableOperation {
    protected static final Map<RemoteEnum, Function<String, String>> OPERATION_MAP;

    static {
        OPERATION_MAP = new EnumMap<>(RemoteEnum.class);
        OPERATION_MAP.put(RemoteEnum.LOWERCASE, String::toLowerCase);
    }

    private ImmutableOperation() {
    }
}
