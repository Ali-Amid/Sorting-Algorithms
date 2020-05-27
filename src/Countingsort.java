public class Countingsort {

    private int SizeOfCountArray = 0;
    private int[] SortedArray;

    // This method performs Counting sort and returns the SortedArray
    public int[] CountingSort(int[] Array) {

        CountArray(Array);
        return this.SortedArray;

    }

    // This method creates a CountArray according to the maximum integer in the unsorted Array
    private void CountArray(int[] Array) {
        for (int i = 0; i <= Array.length - 1; i++) {
            if (Array[i] > this.SizeOfCountArray) {
                this.SizeOfCountArray = Array[i];
            }
        }
        int[] CountArray = new int[this.SizeOfCountArray + 1];
        Sort(Array, CountArray);
    }

    private void Sort(int[] Array, int[] CountArray) {
        int CountArrayIndex = 0;
        for (int i = 0; i <= Array.length - 1; i++) {

            CountArrayIndex = Array[i];
            CountArray[CountArrayIndex] = CountArray[CountArrayIndex] + 1;
        }
        for (int i = 1; i <= CountArray.length - 1; i++) {
            CountArray[i] = CountArray[i - 1] + CountArray[i];
        }
        SortedArray = new int[Array.length];
        for (int i = 0; i <= Array.length - 1; i++) {
            SortedArray[(CountArray[Array[i]]) - 1] = Array[i];
            CountArray[Array[i]]--;
        }

    }
}


