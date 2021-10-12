package customReader;

import com.epam.firsttaskarray.customReader.TextReader;
import com.epam.firsttaskarray.exception.CustomException;
import com.epam.firsttaskarray.parser.TextParser;
import org.junit.function.ThrowingRunnable;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TextReaderTest {
    private static final String path = "testText.txt";
    private static final TextReader textReader = new TextReader();

    @Test
    public void readTextTest() throws CustomException {
        List<String> lines = textReader.readText(path);
        List<String> testLines = new ArrayList<>();
        testLines.add("1-2, 3z3,");
        testLines.add("1 2, 3");
        Assert.assertEquals(lines, testLines);
    }

    @Test
    public void readTextStreamTest() throws CustomException {
        List<String> lines = textReader.readTextStream(path);
        List<String> testLines = new ArrayList<>();
        testLines.add("1-2, 3z3,");
        testLines.add("1 2, 3");
        Assert.assertEquals(lines, testLines);
    }
}
