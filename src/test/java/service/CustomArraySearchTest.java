package service;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.service.CustomArrayCalculation;
import com.epam.firsttaskarray.service.CustomArraySearch;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArraySearchTest {
    private int []testData = {1, 3, 2, -4};
    private CustomArray testArray = new CustomArray(testData);
    private CustomArraySearch testSearcher = new CustomArraySearch();

    @Test
    public void findMaxTest(){
        Assert.assertEquals(testSearcher.findMax(testArray), 3);
    }

    @Test
    public void findMinTest(){
        Assert.assertEquals(testSearcher.findMin(testArray), -4);
    }

    @Test
    public void findPositiveAmountTest(){
        Assert.assertEquals(testSearcher.findPositiveAmount(testArray), 3);
    }

    @Test
    public void findNegativeAmountTest(){
        Assert.assertEquals(testSearcher.findNegativeAmount(testArray), 1);
    }
}
