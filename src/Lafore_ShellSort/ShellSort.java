package Lafore_ShellSort;

public class ShellSort {
    private long[] theArray;
    private int nElements;

    public ShellSort(int max) {
        theArray = new long[max];
        nElements = 0;
    }

    public void insert(long value){
        theArray[nElements] = value;
        nElements++;
    }

    public void shouldDisplayDataFromArray() {
        System.out.println("Before Sorting");
        for (int i = 0; i < nElements; i++) {
            theArray[i] = (int) (Math.random() * 100);
            System.out.print(theArray[i] + " ");
        }
        System.out.println("");
    }

    public void shellSort() {
        int inner, outer;
        long temp;
        int h = 1;
        while (h <= nElements / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < nElements; outer++) {
                temp = theArray[outer];
                inner = outer;

                while (inner > h - 1 && theArray[inner - h] >= temp) {
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
    public void shouldDisplayDataFromArrayAfterSorting() {
        System.out.println("After Sorting");
        for (int i = 0; i < nElements; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println("");
    }
}
