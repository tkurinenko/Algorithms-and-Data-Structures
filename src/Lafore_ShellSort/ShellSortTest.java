package Lafore_ShellSort;

public class ShellSortTest {
    public static void main(String[] args) {
        int maxSize = 10;
        ShellSort arr = new ShellSort(maxSize);
        for (int i = 0; i < maxSize; i++) {
            long n = (int) (Math.random()*99);
            arr.insert(n);
        }
        arr.shouldDisplayDataFromArray();
        arr.shellSort();
        arr.shouldDisplayDataFromArrayAfterSorting();
    }
}
