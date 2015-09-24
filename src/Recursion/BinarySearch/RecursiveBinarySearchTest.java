package Recursion.BinarySearch;

public class RecursiveBinarySearchTest {
    public static void main(String[] args) {
        int maxSize = 20;
        RecursiveBinarySearch arr = new RecursiveBinarySearch(maxSize);
        arr.shouldDisplayDataFromArray();
        int searchKey = 0;
        if (arr.find(searchKey) != arr.size()) {
            System.out.println("Found " + searchKey);
        } else System.out.println("Can't find " + searchKey);
        arr.find(10);
  /*      arr.shouldDisplayDataFromArrayAfterSearch();*/
    }
}
