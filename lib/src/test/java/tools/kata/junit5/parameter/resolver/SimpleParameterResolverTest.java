package tools.kata.junit5.parameter.resolver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tools.kata.jackson.Person;

@ExtendWith(SimpleParameterResolver.class)
class SimpleParameterResolverTest {
    @Test
    void testIt(Person person) {
        Assertions.assertNotNull(person);
    }
}
