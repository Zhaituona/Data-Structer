package hashtableConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {

    public static void main(String[] args) {

        Hashtable<Integer,String> h1= new Hashtable<Integer,String>();

        h1.put(1,"Java");
        h1.put(2,"Selenium");
        h1.put(3,"Tester");  // unique value can be allowed
       // h1.put(3,"Hello");
       // h1.put(null,null);  in the Hashtable cannot give null key or null value .
        // null pointer exception
        System.out.println("The value is ");
        System.out.println(h1);

        //Object h2= new Hashtable<>();
        Hashtable<Integer,String> h3 = new Hashtable<Integer, String>();
        System.out.println("_________");
        h3 = (Hashtable)h1.clone(); // this is casting . casting object to the Hashtable object.

        //h2 = h1.clone();
        System.out.println(h1);
        System.out.println(h3);
        System.out.println(h1.hashCode());// value is same hashCode will be same
        System.out.println(h3.hashCode());

        // contains method .

        if(h1.contains("Hello")){
            System.out.println("Value is not founded");
        }
        else if(h1.contains("Selenium")){
            System.out.println("Value is found ");
            //  print all the value from Hashtable we have to use enumration
            System.out.println("The value from Hashtable **********");
            Enumeration e = h1.elements();
            while(e.hasMoreElements()){
                System.out.println(e.nextElement());
            }
            // print all the value from Hashtable using entrySet
            Set s =h1.entrySet();
            System.out.println(s);
            System.out.println(h1.get(2));
            // check the two Hashtable equals or not
            if(h1.equals(h3)){
                System.out.println("They are equal");// h3  created  copying from h1
            }
            else{
                System.out.println("They are not equal");
            }


        }
    }
}
