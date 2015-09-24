package Recursion.BinarySearch;

public class RecursiveBinarySearch {

    private long[] a;
    private int nElements;

    public RecursiveBinarySearch(int max) {
        a = new long[max];
        nElements = a.length;
    }

    public int size() {
        return nElements;
    }

    public void shouldDisplayDataFromArray() {
        System.out.println("Before Search");
        for (int i = 0; i < nElements - 1; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public int find(long searchKey) {
        return recFind(searchKey, 0, nElements - 1);
    }

    private int recFind(long searchKey, int lowerBound, int upperBound) {
        int curIn;
        curIn = (lowerBound + upperBound) / 2;
        if (a[curIn] == searchKey) {
            return curIn;
        } else if (lowerBound > upperBound) {
            return nElements;
        } else {
            if (a[curIn] < searchKey) {
                return recFind(searchKey, curIn + 1, upperBound);
            } else return recFind(searchKey, lowerBound, curIn - 1);
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElements - 1; j++) {
            if (a[j] > value) break;
        }
        for (int k = nElements - 1; k > j; k--) {
            a[k] = a[k - 1];
        }
        a[j] = value;
        nElements++;
    }

    public void shouldDisplayDataFromArrayAfterSearch() {
        System.out.println("After Search");
        for (int i = 0; i < nElements - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}

