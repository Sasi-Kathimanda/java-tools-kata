package tools.kata.junit5.parameter.resolver;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import tools.kata.jackson.Person;
import tools.kata.jackson.Residence;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class InvalidPersonResolver implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getParameterizedType() == Person.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        List<Person> persons = List.of(
                new Person("Sasi1", 24, Residence.FLAT, Date.from(Instant.parse("1984-12-02T10:15:30.00Z"))),
                new Person("Kiran*", 14, Residence.FLAT, Date.from(Instant.parse("1994-12-02T10:15:30.00Z"))),
                new Person("@Raja@", 18, Residence.HOUSE, Date.from(Instant.parse("2004-12-02T10:15:30.00Z"))));
        return persons.get(new Random().nextInt(persons.size()));
    }
}
