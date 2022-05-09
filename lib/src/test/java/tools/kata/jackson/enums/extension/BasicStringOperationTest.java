package tools.kata.jackson.enums.extension;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicStringOperationTest {

    @Test
    void givenOperationEnum_ShouldPerformTrimOperation() {
        String input = " Hello ";
        String actual = BasicStringOperation.TRIM.apply(input);
        assertEquals("Hello", actual);
    }

}