package tools.kata.beanvalidators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserAccountTest {
    private UserAccount sut;

    @Test
    void throwsExceptionWhenUserNameIsNull() {
        //Given
        Assertions.assertThrows(IllegalArgumentException.class, () -> new UserAccount( null, null));
    }
}