package tools.kata.junit4;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class TestMethodNameLogger implements TestRule {
    private static final Logger LOG = LoggerFactory.getLogger(TestMethodNameLogger.class);

    @Override
    public Statement apply(Statement base, Description description) {
        logInfo("Before test --> ", description);
        try {
            return base;
        } finally {
            logInfo("After test --> ", description);
        }
    }

    private void logInfo(String msg, Description description) {
        LOG.info(() -> msg + description.getMethodName());
    }
}
