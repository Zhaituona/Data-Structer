package bubbleSort;

public class TestBubbleSort1 {

    public static void main(String[] args) {

        int [] ary = {12,36,56,98,78,23};

        //BubbleSort1  ary1 = new BubbleSort1();
         BubbleSort1.bubbleSort(ary);
         BubbleSort1.bubbleSort(ary);
        System.out.println("The element after sorted  \n ");


         for(int i =0; i< ary.length; i++){
             System.out.print(ary[i] + " ");
         }






    }
}
