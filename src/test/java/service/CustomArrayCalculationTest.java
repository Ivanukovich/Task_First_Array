package service;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.service.CustomArrayCalculation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayCalculationTest {
    private static final int []testArray = {1, 3, 2, -4};
    private static final CustomArray testCustomArray = new CustomArray(testArray);
    private static final CustomArrayCalculation testCalculator = new CustomArrayCalculation();

    @Test
    public void findSumTest(){
        Assert.assertEquals(testCalculator.findSum(testCustomArray), 2);
    }

    @Test
    public void findMedianTest(){
        Assert.assertEquals(testCalculator.findMedian(testCustomArray), 0.5);
    }
}
