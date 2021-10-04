package service;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.exception.CustomException;
import com.epam.firsttaskarray.service.CustomArrayEditor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayEditorTest {
    private int []testData = {1, 3, 2, -4};
    private int []editedArrayData = {1, 3, -1, -4};
    private CustomArray testArray = new CustomArray(testData);
    private CustomArrayEditor testEditor = new CustomArrayEditor();

    @Test
    public void setElementAtTest() throws CustomException {
        CustomArray editedArray = new CustomArray(testArray.getArray());
        testEditor.setElementAt(editedArray, 2, -1);
        Assert.assertEquals(editedArray.getArray(), editedArrayData);
    }
}
