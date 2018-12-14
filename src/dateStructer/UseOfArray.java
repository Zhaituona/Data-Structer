package dateStructer;

public class UseOfArray {

    public static void main(String[] args) {

        int [] a = new int [10];  // declare and initialize and Array . int array named a

        a[0] = 12;
        a[1] = 10;
        a[2]= 11;
        a[3] = 5;
        a[4] = 9;
        a[5] = 67;
        a[6]= 78;
        System.out.println(a.length);
        System.out.println(a[1]  + " :" + a[7]);// if you not give the value of the array , automaticly give 0.
        for(int i =0; i<a.length ; i++){
            System.out.println(a[i]);
        }
    }
}
