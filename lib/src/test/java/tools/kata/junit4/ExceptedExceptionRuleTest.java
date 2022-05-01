package tools.kata.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertThrows;

public class ExceptedExceptionRuleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testWhenNPEThrown() {
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }

    @Test
    public void testWhenNPEThrownWithExpectedMessage() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("Null Pointer Problem");
        throw new NullPointerException("Null Pointer Problem");
    }

    @Test
    public void testExceptionWithAssertThrows() {
        assertThrows(NumberFormatException.class, () -> Integer.parseInt("Sas"));
        assertThrows(IllegalArgumentException.class, () -> Integer.parseInt("Sas"));
    }
}
