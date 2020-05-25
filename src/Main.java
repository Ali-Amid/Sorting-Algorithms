import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        // make a new instance of Quicksort class
//        Quicksort quicksort = new Quicksort();
//        // Define an unsorted array
//        int[] array = {5,5,5,4,8,0,0,8,8,1000,2,3,4,0,0,4,4,4};
//        // call quicksort method and pass the array
//        quicksort.quicksort(array);
//        // print out the sorted array on the terminal
//        System.out.println(Arrays.toString(array));

        Countingsort countingsort = new Countingsort();
        int[] array = {5,6,4,3,10,10,100,0,0};
        countingsort.Countingsort(array);





    }
}
