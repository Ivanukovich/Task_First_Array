package customSort;

import com.epam.firsttaskarray.customSort.BubbleSort;
import com.epam.firsttaskarray.customSort.InsertSort;
import com.epam.firsttaskarray.customSort.QuickSort;
import com.epam.firsttaskarray.entity.CustomArray;
import com.epam.firsttaskarray.exception.CustomException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArraySortTest {
    private static final int []unsortedArray = {1, 3, 2, -4};
    private static final int []sortedArray = {-4, 1, 2, 3};
    private static final CustomArray unsortedCustomArray = new CustomArray(unsortedArray);
    private static final BubbleSort bubbleSorter = new BubbleSort();
    private static final QuickSort quickSorter = new QuickSort();
    private static final InsertSort insertSorter = new InsertSort();

    @Test
    public void quickSortTest() throws CustomException {
        CustomArray arrayForSort = new CustomArray(unsortedCustomArray.getArray());
        quickSorter.quickSort(arrayForSort);
        Assert.assertEquals(arrayForSort.getArray(), sortedArray);
    }

    @Test
    public void bubbleSortTest() throws CustomException {
        CustomArray arrayForSort = new CustomArray(unsortedCustomArray.getArray());
        bubbleSorter.bubbleSort(arrayForSort);
        Assert.assertEquals(arrayForSort.getArray(), sortedArray);
    }

    @Test
    public void insertSortTest() throws CustomException {
        CustomArray arrayForSort = new CustomArray(unsortedCustomArray.getArray());
        insertSorter.insertSort(arrayForSort);
        Assert.assertEquals(arrayForSort.getArray(), sortedArray);
    }
}
