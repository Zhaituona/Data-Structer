package selectionSort;

public class TestSelectionSort {

    public static void main(String[] args) {
        int []  array = {12,69,78,3,64,13,10};

        SelectionSort.selectionSort(array);
        System.out.println("The element after sorted : \n");

            for(int i =0; i< array.length; i++){
                System.out.print(array[i]+ " ");
            }
    }
}
