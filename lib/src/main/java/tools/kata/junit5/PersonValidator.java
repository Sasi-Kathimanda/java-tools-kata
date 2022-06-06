package tools.kata.junit5;

import tools.kata.jackson.Person;

public class PersonValidator {

    public boolean validPerson(Person person) {
        if (person != null)
            throw new IllegalArgumentException("fail me");
        return false;
    }
}
