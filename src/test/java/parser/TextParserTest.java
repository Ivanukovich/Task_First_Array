package parser;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.exception.CustomException;
import com.epam.firsttaskarray.parser.TextParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TextParserTest {
    private static final TextParser parser = new TextParser();

    @Test
    public void parseLinesTest() throws CustomException {
        List<String> text = new ArrayList<String>();
        text.add("1 -2 3");
        text.add("4a -5 6");
        text.add("7, -8 9");
        int[] array = {1, -2, 3, 7, -8, 9};
        CustomArray customArray = parser.parseLines(text);
        Assert.assertEquals(customArray.getArray(), array);
    }
}
