package tools.kata.junit5.parameter.resolver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import tools.kata.jackson.Person;
import tools.kata.junit5.PersonValidator;


@DisplayName("Testing PersonValidator")
class PersonValidatorTest {
    @Nested
    @ExtendWith(ValidPersonResolver.class)
    class ValidPersonValidator {
        @RepeatedTest(value = 10)
        void validatePersonName(Person person) {
            Assertions.assertDoesNotThrow(() -> new PersonValidator().validPerson(person));
        }
    }

    @Nested
    @ExtendWith(InvalidPersonResolver.class)
    class InValidPersonValidator {
        @RepeatedTest(value = 10)
        void validatePersonName(Person person) {
            var validator = new PersonValidator();
            Assertions.assertThrows(IllegalArgumentException.class, () -> validator.validPerson(person), "Invalid personName=" + person.getName());
        }
    }
}