package Lafore_QuickSort;

public class QuickSort {
    private int[] a;
    private int nElements;

    public QuickSort(int max) {
        a = new int[max];
        nElements = a.length - 1;
    }

    public void shouldDisplayDataFromArray() {
        System.out.println("Before Sorting");
        for (int i = 0; i < nElements; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public void quickSort() {
        recQuickSort(0, nElements - 1);
    }

    public void recQuickSort(int left, int right) {
        int size = right - left + 1;
        if (size <= 3) {
            manualSort(left, right);
        } else {
            long median = medianOf3(left, right);
            int partition = partitionIt(left, right, median);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    private long medianOf3(int left, int right) {
        int center = (left + right) / 2;
        if (a[left] > a[center]) {
            swap(left, center);
        }
        if (a[left] > a[right]) {
            swap(left, right);
        }
        if (a[center] > a[right]) {
            swap(center, right);
        }
        swap(center, right - 1);
        return a[right - 1];
    }

    private void swap(int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    private int partitionIt(int left, int right, long median) {
        int leftPtr = left;
        int rightPtr = right - 1;
        while (true) {
            while (a[++leftPtr] < median)
                ;
            while (a[--rightPtr] > median)
                ;
            if (leftPtr >= rightPtr)
                break;
            else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right - 1);
        return leftPtr;
    }

    public void manualSort(int left, int right) {
        int size = right - left + 1;
        if (size <= 1)
            return;
        if (size == 2) {
            if (a[left] > a[right])
                swap(left, right);
        } else {
            if (a[left] > a[right - 1]) {
                if (a[left] > a[right]) {
                    swap(left, right);
                }
            }
            if (a[right - 1] > a[right]) {
                swap(right - 1, right);
            }
        }
    }

    public void shouldDisplayDataFromArrayAfterSorting() {
        System.out.println("After Sorting");
        for (int i = 0; i < nElements; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}