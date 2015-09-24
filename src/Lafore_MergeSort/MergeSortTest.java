package Lafore_MergeSort;

public class MergeSortTest {
    public static void main(String[] args) {
        int maxSize = 20;
        MergeSort arr = new MergeSort(maxSize);
        arr.shouldDisplayDataFromArray();
        arr.mergeSort();
        arr.shouldDisplayDataFromArrayAfterSorting();
    }
}
