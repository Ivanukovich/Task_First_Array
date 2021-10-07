package parser;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.exception.CustomException;
import com.epam.firsttaskarray.parser.TextParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TextParserTest {
    private String line1 = "1 -2 3";
    private String line2 = "4a -5 6";
    private String line3 = "7, -8 9";
    private int[] array = {1, -2, 3, 7, -8, 9};
    private List<String> text = new ArrayList<String>();
    private TextParser parser = new TextParser();

    @Test
    public void parseLinesTest() throws CustomException {
        text.add(line1);
        text.add(line2);
        text.add(line3);
        CustomArray customArray = parser.parseLines(text);
        Assert.assertEquals(customArray.getArray(), array);
    }
}
