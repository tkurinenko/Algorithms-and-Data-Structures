package ElementarySorts.Lafore_InsertionSort;

public class InsertionSort {

    private int[] a;
    private int nElements;

    public InsertionSort(int max) {
        a = new int[max];
        nElements = a.length;
    }

    public void shouldDisplayDataFromArray() {
        System.out.println("Before Sorting");
        for (int i = 0; i < nElements - 1; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public void shouldMakeInsertionSort() {
        int i, j;
        for (j = 1; j < nElements - 1; j++) {
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
        for (int i = 0; i < nElements - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
