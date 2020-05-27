import java.lang.reflect.Array;
import java.util.Arrays;

public class Quicksort {

    public void quicksort(int[] array) {
        quicksort(array, 0, array.length );


    }

    // This method performs recursion, which means the method calls itself
    private void quicksort(int[] array, int Lowindex, int Highindex) {
        if (Lowindex < Highindex) {
            int pivot = partition(array, Lowindex, Highindex);
            quicksort(array, Lowindex, pivot );
            quicksort(array, pivot + 1, Highindex);
        }
    }

    // This method changes the order of two values in the array
    private void swap(int[] array, int index1, int index2) {
        int value = array[index1];
        array[index1] = array[index2];
        array[index2] = value;
    }

    // This method takes the first index of each partition as a Pivot
    private int partition(int[] array, int Lowindex, int Highindex) {
        int lowindexPointer = Lowindex;
        int highindexPointer = Highindex;
        int pivot = array[lowindexPointer];

        while (lowindexPointer < highindexPointer) {

            do {
                lowindexPointer++;
                if(lowindexPointer==array.length){
                    break;
                }
            } while (array[lowindexPointer] <= pivot);

            do {
                highindexPointer--;
            } while (array[highindexPointer] > pivot);
            if (lowindexPointer < highindexPointer) {
                swap(array, lowindexPointer, highindexPointer);
            }

        }
        swap(array, Lowindex, highindexPointer);
        return highindexPointer;
    }
}
