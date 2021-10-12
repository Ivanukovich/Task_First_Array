package service;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.exception.CustomException;
import com.epam.firsttaskarray.service.CustomArrayEditor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayEditorTest {
    private static final int []testArray = {1, 3, 2, -4};
    private static final int []testEditedArray = {1, 3, -1, -4};
    private static final CustomArrayEditor testEditor = new CustomArrayEditor();

    @Test
    public void setElementAtTest() throws CustomException {
        CustomArray testCustomArray = new CustomArray(testArray);
        testEditor.setElementAt(testCustomArray, 2, -1);
        Assert.assertEquals(testCustomArray.getArray(), testEditedArray);
    }
}
