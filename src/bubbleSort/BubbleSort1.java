package bubbleSort;

public class BubbleSort1 {


    int temp;
    public static void bubbleSort(int [] A){
         int temp;
         for(int i=0; i<A.length -1; i++){
             for(int j=0; j<A.length-1-i; j++){
                 if(A[j]> A[j+1]){
                     temp= A[j];
                     A[j]= A[j+1];
                     A[j+1] = temp;

                 }
             }
         }
     }
}
