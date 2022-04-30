package tools.kata.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TemporaryFolderRuleTest {
    @Rule
    public TemporaryFolder temporaryFolder = TemporaryFolder.builder().assureDeletion().build();

    @Test
    public void givenTempFolder_WhenNewFile_TheFileIsCreated() throws IOException {
        File file = temporaryFolder.newFile("test.txt");

        assertTrue("file should be created", file.isFile());
        assertEquals("temp file and temp folder should match", temporaryFolder.getRoot(), file.getParentFile());
    }
}
