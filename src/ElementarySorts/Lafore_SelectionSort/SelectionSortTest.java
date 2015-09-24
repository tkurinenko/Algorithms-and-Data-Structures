package ElementarySorts.Lafore_SelectionSort;

public class SelectionSortTest {
    public static void main(String[] args) {
        int maxSize = 20;
        SelectionSort arr = new SelectionSort(maxSize);
        arr.shouldDisplayDataFromArray();
        arr.shouldMakeSelectionSort();
        arr.shouldDisplayDataFromArrayAfterSorting();
    }
}