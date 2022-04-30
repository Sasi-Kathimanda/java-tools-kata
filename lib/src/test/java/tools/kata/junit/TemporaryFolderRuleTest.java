package tools.kata.junit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class TemporaryFolderRuleTest {
    @Rule
    public TemporaryFolder temporaryFolder = TemporaryFolder.builder().assureDeletion().build();

    @Test
    public void givenTempFolder_WhenNewFile_TheFileIsCreated() throws IOException {
        File file = temporaryFolder.newFile("test.txt");

        Assert.assertTrue("file should be created", file.isFile());
    }
}
