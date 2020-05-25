import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // make a new instance of Quicksort class
        Quicksort quicksort = new Quicksort();
        // Define an unsorted array
        int[] array1 = {5,5,5,4,8,0,0,8,8,1000,2,3,4,0,0,4,4,4};
        // call quicksort method and pass the array
        quicksort.quicksort(array1);
        // print out the sorted array on the terminal
        System.out.println(Arrays.toString(array1));


        // make a new instance of Countingsort class
        Countingsort countingsort = new Countingsort();
        // Define an unsorted array
        int[] array2 = {5,6,4,3,10,10,100,0,0,1000};
        // call Countingsort method and pass the array. this method returns the sorted array
        int[] SortedArray = countingsort.CountingSort(array2);
        //Print the SortedArray
        System.out.println(Arrays.toString(SortedArray));

    }
}
