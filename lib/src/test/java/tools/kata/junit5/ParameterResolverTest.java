package tools.kata.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tools.kata.jackson.Person;

@ExtendWith(ParameterResolver.class)
class ParameterResolverTest {

    @Test
    void testIt(Person person) {
        Assertions.assertNotNull(person);
    }
}
