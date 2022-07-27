package tools.kata.jackson.enums.extension;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ExtendedStringOperationTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void givenText_WhenMd5OperationApplied_ShouldGiveMd5Encoded() {
        var actual = ExtendedStringOperation.MD5_ENCODE.apply("Hello");
        assertEquals("8b1a9953c4611296a827abf8c47804d7", actual);
    }

    @Test
    void givenText_WhenBase64OperationApplied_ShouldGiveBase64Encoded() {
        var actual = ExtendedStringOperation.BASE64_ENCODE.apply("Hello");
        assertEquals("SGVsbG8=", actual);
    }

    @Test
    void givenText_WhenSHA256OperationApplied_ShouldGiveSHA256HASH() {
        var actual = ExtendedStringOperation.SHA256_HASH.apply("Hello");
        assertEquals("185f8db32271fe25f561a6fc938b2e264306ec304eda518007d1764826381969", actual);
    }
}