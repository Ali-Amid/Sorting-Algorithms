import java.util.Arrays;

public class Countingsort {

    private int sizecountarray = 0;

   public void Countingsort(int[] Array){

        CountArray(Array);
    }
    private void CountArray(int[] Array){
       for(int i =0; i<=Array.length-1; i++){
           if(Array[i]>this.sizecountarray){
               this.sizecountarray=Array[i];
           }
       }
       int[] countarray = new int[this.sizecountarray+1];
       Sort(Array, countarray);
    }

    private void Sort(int[] Array, int[]countarray){
       int countarrayindex = 0;
       for (int i=0; i<=Array.length-1; i++){

           countarrayindex = Array[i];
           countarray[countarrayindex]= countarray[countarrayindex]+1;
       }
       for (int i=1; i<=countarray.length-1;i++){
           countarray[i]=countarray[i-1] + countarray[i];}
       int[] SortedArray = new int[Array.length];
       for (int i=0; i<=Array.length-1;i++ ){
           SortedArray[(countarray[Array[i]])-1] = Array[i];
           countarray[Array[i]]--;}
        System.out.println(Arrays.toString(SortedArray));




       }
    }


