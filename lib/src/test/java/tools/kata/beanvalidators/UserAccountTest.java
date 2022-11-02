package tools.kata.beanvalidators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UserAccountTest {
    private UserAccount sut;

    @Test
    void throwsExceptionWhenUserNameIsNull() {
        //Given
        assertThrows(IllegalArgumentException.class, () -> new UserAccount( null, null));
    }
}