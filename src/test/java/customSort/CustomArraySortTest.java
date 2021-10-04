package customSort;

import com.epam.firsttaskarray.customSort.BubbleSort;
import com.epam.firsttaskarray.customSort.InsertSort;
import com.epam.firsttaskarray.customSort.QuickSort;
import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.exception.CustomException;
import com.epam.firsttaskarray.service.CustomArrayCalculation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArraySortTest {
    private int []testData = {1, 3, 2, -4};
    private int []sortedData = {-4, 1, 2, 3};
    private CustomArray testArray = new CustomArray(testData);
    private BubbleSort bubbleSorter = new BubbleSort();
    private QuickSort quickSorter = new QuickSort();
    private InsertSort insertSorter = new InsertSort();

    @Test
    public void quickSortTest() throws CustomException {
        CustomArray arrayForSort = new CustomArray(testArray.getArray());
        quickSorter.quickSort(arrayForSort);
        Assert.assertEquals(arrayForSort.getArray(), sortedData);
    }

    @Test
    public void bubbleSortTest() throws CustomException {
        CustomArray arrayForSort = new CustomArray(testArray.getArray());
        bubbleSorter.bubbleSort(arrayForSort);
        Assert.assertEquals(arrayForSort.getArray(), sortedData);
    }

    @Test
    public void insertSortTest() throws CustomException {
        CustomArray arrayForSort = new CustomArray(testArray.getArray());
        insertSorter.insertSort(arrayForSort);
        Assert.assertEquals(arrayForSort.getArray(), sortedData);
    }
}
