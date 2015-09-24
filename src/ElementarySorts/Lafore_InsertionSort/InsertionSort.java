package ElementarySorts.Lafore_InsertionSort;

public class InsertionSort {

    private int[] a;
    private int nElements;

    public InsertionSort(int max) {
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

    public void shouldMakeInsertionSort() {
        int i, j;
        for (j = 1; j < nElements; j++) {
            int temp = a[j];
            i = j;
            while (i > 0 && a[i - 1] >= temp) {
                a[i] = a[i - 1];
                --i;
            }
            a[i] = temp;
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
