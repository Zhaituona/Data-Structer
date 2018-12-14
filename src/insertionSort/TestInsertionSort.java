package insertionSort;

public class TestInsertionSort {

    public static void main(String[] args) {

        int [ ] array ={12,23,65,4,89,90};

        InsertionSort.insertionSort(array);

        System.out.println("The sorting element is : \n");

        for(int i =0; i< array.length; i++){
            System.out.print(array[i] +  " ");
        }
    }
}
