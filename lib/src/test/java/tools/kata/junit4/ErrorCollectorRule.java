package tools.kata.junit4;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class ErrorCollectorRule {
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void GivenErrorAdd_ThenCheckErrorIsAdded() {
        collector.addError(new Throwable("First Error"));
        collector.addError(new Throwable("Second Error"));

        collector.checkThat(5, is(8)); //First Error
        collector.checkThat(5, is(not(8))); //Passed
        collector.checkThat(5, is(equalTo(9))); //Second Error
    }
}
