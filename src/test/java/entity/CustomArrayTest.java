package entity;

import com.epam.firsttaskarray.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayTest {
    private int []testData = {1, 3, 2, -4};
    private CustomArray testArray = new CustomArray(testData);

    @Test
    public void getSizeTest(){
        Assert.assertEquals(testArray.getSize(), 4);
    }

    @Test
    public void findSumTest(){
        Assert.assertEquals(testArray.getArray(), testData);
    }

}