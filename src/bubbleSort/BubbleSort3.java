package bubbleSort;

public class BubbleSort3 {
    public static void main(String[] args) {

        int[] ary = {12, 23, 58, 98, 78, 36};
        int temp;
        for (int i = 0; i < ary.length - 1; i++) {
            for (int j = 0; j < ary.length - 1 - i; j++) {
                if (ary[j] > ary[j + 1]) {
                    temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for(int i =0; i < ary.length; i++){
            System.out.println(ary[i]);
    }



                }
}
