package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();// created an ArrayList object

        num.add(100);
        num.add(30);
        num.add(45);
        num.add(50);
        num.add(65);
        System.out.println("The size of the ArrayList is : " );
        System.out.println(num.size());
        //retrieving
        System.out.println("The element of index 3 is :" + num.get(3));
        //Iterate the ArrayList element .
        System.out.println("_____________");
        System.out.println("Iterate the ArrayList element using for loop ");
        for(int i =0; i<num.size(); i ++){
            System.out.println(num.get(i));
        }
        //this is fast
        num.remove(num.size()-1);
        // this is slow
        num.remove(0);

        // iterate ArrayList element using for each loop
        System.out.println("Iterate the ArrayList element using for each loop");
        for(Integer value : num){
            System.out.println(value);
        }
        List<Integer> num1 = new ArrayList<Integer>(); // also declare like this .




    }
}
