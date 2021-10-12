package service;

import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.service.CustomArrayCalculation;
import com.epam.firsttaskarray.service.CustomArraySearch;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArraySearchTest {
    private static final int []testArray = {1, 3, 2, -4};
    private static final CustomArray testCustomArray = new CustomArray(testArray);
    private static final CustomArraySearch testSearcher = new CustomArraySearch();

    @Test
    public void findMaxTest(){
        Assert.assertEquals(testSearcher.findMax(testCustomArray), 3);
    }

    @Test
    public void findMinTest(){
        Assert.assertEquals(testSearcher.findMin(testCustomArray), -4);
    }

    @Test
    public void findPositiveAmountTest(){
        Assert.assertEquals(testSearcher.findPositiveAmount(testCustomArray), 3);
    }

    @Test
    public void findNegativeAmountTest(){
        Assert.assertEquals(testSearcher.findNegativeAmount(testCustomArray), 1);
    }
}
