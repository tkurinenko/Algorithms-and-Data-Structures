package ElementarySorts.Lafore_BubbleSort;

public class BubbleSortTest {
    public static void main(String[] args) {
        int maxSize = 20;
        BubbleSort arr = new BubbleSort(maxSize);
        arr.shouldDisplayDataFromArray();
        arr.shouldMakeBubbleSort();
        arr.shouldDisplayDataFromArrayAfterSorting();
    }
}
