package insertionSort;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        int k = array.length;
        for (int i = 1; i < k; i++) {
            int key = array[i];
            int j = i - 1;


            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1]= key;
        }
    }
}