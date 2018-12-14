package linkedListConcept;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListConcept {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();// same way of

        List<String> myList = new LinkedList<String>();// List is a interface of LinkedList

        myList.add("Hello");
        myList.add("Java");
        myList.add("Selenium");
        myList.add("QA");
        System.out.println("The list of LinkedList "  + myList);

        // for loop
        System.out.println("This is using for loop ******");
        for(int a = 0; a < myList.size(); a++){
            System.out.println(myList.get(a));
        }
        // advanced for loop
        System.out.println("Using the advanced  for loop");
        for(String value: myList){
            System.out.println(value);
        }
        // while loop
        System.out.println("Using the while loop***** ");
        int num =0;
        while(myList.size()>num){
            System.out.println(myList.get(num));
            num++;
        }
        // Iterator
        System.out.println("Using the Iterator ******");
        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}


