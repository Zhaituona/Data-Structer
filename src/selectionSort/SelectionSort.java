package selectionSort;

public class SelectionSort {
    // i for outer loop
    // j for inner loop

     public static void selectionSort(int[] array){ // method for selection sort
         int n = array.length;
         for(int i =0; i<= n-1;i++ ){// outer loop throw the index
             int minIndex = i;
             for(int j =i+1; j<n; j++){// inner loop find the min value
                 if(array[j] < array[minIndex]){// if else statement
                     minIndex = j;
                 }

             } // swapping
             int temp = array[minIndex];
             array[minIndex] = array[i];
             array[i]= temp;
         }

     }
}
