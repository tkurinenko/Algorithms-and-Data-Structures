package ElementarySorts.Lafore_InsertionSort;

public class InsertionSortTest {
    public static void main(String[] args) {
        int maxSize = 20;
        InsertionSort arr = new InsertionSort(maxSize);
        arr.shouldDisplayDataFromArray();
        arr.shouldMakeInsertionSort();
        arr.shouldDisplayDataFromArrayAfterSorting();
    }
}
