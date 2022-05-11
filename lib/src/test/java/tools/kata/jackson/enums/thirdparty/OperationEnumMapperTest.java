package tools.kata.jackson.enums.thirdparty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationEnumMapperTest {
    @Test
    void shouldUseThirdPartyEnumLowerCase_ReturnsLowercase() {
        var actual = ImmutableOperation.OPERATION_MAP.get(RemoteEnum.LOWERCASE).apply("Sas");
        assertEquals("sas", actual);
    }
}