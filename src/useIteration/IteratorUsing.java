package useIteration;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorUsing {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<Integer>();
        num.add(3747);
        num.add(3498);
        num.add(3369);
        num.add(3812);
        // Iterate the item from the LinkedList
       // Iterator<Integer> it = num.iterator();
      //  while (it.hasNext()) {
          ///  int newNum = it.next();
          //  System.out.println(newNum);

        Iterator<Integer> it = num.listIterator(); // using listIterator method to add item in to the list
        num.add(3669);


        System.out.println("************");
        for (Integer value : num) {
            System.out.println(value);
        }


    }


}



