package tools.kata.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutRule {

    @Rule
    public Timeout timeout = new Timeout(2, TimeUnit.SECONDS);

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(1000);
    }
}
