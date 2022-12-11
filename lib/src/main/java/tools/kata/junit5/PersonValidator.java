package tools.kata.junit5;

import tools.kata.jackson.Person;

import java.util.regex.Pattern;

public class PersonValidator {

    public boolean validPerson(Person person) {
        if (person == null) {
            return false;
        }
        var pattern = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);
        if (pattern.matcher(person.getName()).find()) {
            throw new IllegalArgumentException("invalid symbols or number in name" + person.getName());
        }
        return true;
    }
}
