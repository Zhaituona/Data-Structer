package setConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {



        Set<String> set1 = new HashSet<String>();  // not sorted , not orderd
       //Set<String> set1 = new LinkedHashSet<String>(); // maintance the order , like we implement
        //Set<String> set1 = new TreeSet<String>();// orderd by sorting if String will be alphabaticly

        if(set1.isEmpty()){
            System.out.println("the set is empty");
        }

        set1.add("cat");
        set1.add("dog");
        set1.add("zebra");
        set1.add("rabbit");
        set1.add("bear");

        System.out.println(set1);

        /////// Iteration//////
        for(String element : set1){
            System.out.println(element);
        }
        /// contains////
        System.out.println("*************");
        if(set1.contains("duck")){
            System.out.println("not true");
        }
        else if(set1.contains("cat")){
            System.out.println("cat in there ");
        }
        // how to find the same element in the two set , ot intersection


        Set<String> set2 = new HashSet<String>();

        set2.add("cat");
        set2.add("dog");
        set2.add("zebra");
        set2.add("elefhant");
        set2.add("monkey");

        Set<String > intersection = new HashSet<String>(set1);// create a new object using constructor

        System.out.println(intersection);

        intersection.retainAll(set2); // it will show the commend elements between two set
        System.out.println(intersection);

        /// find the difference between two set
        System.out.println("the difference between two set ");

        Set<String > difference  = new HashSet<String>(set2);

        difference.removeAll(set1);
        System.out.println(difference);
    }
}
