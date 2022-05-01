package tools.kata.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptedExceptionRuleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testWhenNPEThrown() {
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }
}
