package selectionSort;

public class TestUseSeclectionSort {
    public static void main(String[] args) {

        int [] array = {12,34,67,8,9,23,78};

        UseSelectionSort.selectionSort(array);
        System.out.println("The element after sorted : \n");

          for(int i =0; i<array.length; i++){
              System.out.print(array[i] + "  ");
             }
        }
    }

