package ElementarySorts.Lafore_BubbleSort;

public class BubbleSort {
    private int[] a;
    private int nElements;

    public BubbleSort(int max) {
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

    public void shouldMakeBubbleSort() {
        int i, j;
        for (i = nElements; i > 1; i--) {
            for (j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void shouldDisplayDataFromArrayAfterSorting() {
        System.out.println("After Sorting");
        for (int i = 0; i < nElements; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}