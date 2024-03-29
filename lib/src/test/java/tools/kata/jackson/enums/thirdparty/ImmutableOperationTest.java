package tools.kata.jackson.enums.thirdparty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImmutableOperationTest {
    @Test
    void shouldUseThirdPartyEnumLowerCase_ReturnsLowercase() {
        var actual = ImmutableOperation.OPERATION_MAP.get(RemoteEnum.LOWERCASE).apply("Sas");
        assertEquals("sas", actual);
    }
    @Test
    void shouldUseThirdPartyEnumInvert_ReturnsInvertTheCase() {
        var actual = ImmutableOperation.OPERATION_MAP.get(RemoteEnum.INVERT_CASE).apply("Sas");
        assertEquals("sAS", actual);
    }
    @Test
    void shouldUseThirdPartyEnumRemoveWhiteSpace_ReturnsNoWhitespace() {
        var actual = ImmutableOperation.OPERATION_MAP.get(RemoteEnum.REMOVE_WHITESPACES).apply("S a s ");
        assertEquals("Sas", actual);
    }
}