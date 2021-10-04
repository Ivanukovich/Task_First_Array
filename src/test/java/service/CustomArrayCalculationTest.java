package service;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.service.CustomArrayCalculation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayCalculationTest {
    private int []testData = {1, 3, 2, -4};
    private CustomArray testArray = new CustomArray(testData);
    private CustomArrayCalculation testCalculator = new CustomArrayCalculation();

    @Test
    public void getSizeTest(){
        Assert.assertEquals(testCalculator.findSum(testArray), 2);
    }

    @Test
    public void getMedianTest(){
        Assert.assertEquals(testCalculator.findMedian(testArray), 0.5);
    }
}
