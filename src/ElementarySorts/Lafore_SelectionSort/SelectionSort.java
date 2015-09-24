package ElementarySorts.Lafore_SelectionSort;

public class SelectionSort {
    private int[] a;
    private int nElements;

    public SelectionSort(int max) {
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

    public void shouldMakeSelectionSort() {
        int i, j, min;
        for (i = 0; i < nElements - 1; i++) {
            min = i;
            for (j = i + 1; j < nElements - 1; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(i, min);
        }
    }

    private void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void shouldDisplayDataFromArrayAfterSorting() {
        System.out.println("After Sorting");
        for (int i = 0; i < nElements - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}