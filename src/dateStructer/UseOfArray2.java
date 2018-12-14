package dateStructer;

import java.util.Random;

public class UseOfArray2 {
    public static void main(String[] args) {
        int [] a = new int[10];
        Random rd = new Random();

        Student [] st = new Student[ 100];


        for(int i =0; i<a.length; i++){
            a[i] = rd.nextInt(10);
            int index = rd.nextInt(a.length);
            System.out.println("index is "  + " " + index + " : " + a[i]);

        }
    }
}
