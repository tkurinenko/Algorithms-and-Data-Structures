package Lafore_QuickSort;

public class QuickSortTest {
    public static void main(String[] args) {
        int maxSize = 20;
        QuickSort arr = new QuickSort(maxSize);
        arr.shouldDisplayDataFromArray();
        arr.quickSort();
        arr.shouldDisplayDataFromArrayAfterSorting();
    }
}
