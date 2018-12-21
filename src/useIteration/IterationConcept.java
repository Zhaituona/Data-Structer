package useIteration;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterationConcept {

    public static void main(String[] args) {
        // create a linkedlist
        LinkedList<String> animal = new LinkedList<String>();

        animal.add("dog");
        animal.add("cat");
        animal.add("rabbit");
        animal.add("zebra");

        // before 1.5V there is Iterator
        //want to remove a item from the list , must be use Iterator .

        // Iterator<String> it = animal.iterator();
        Iterator<String> it = animal.listIterator();  // if we want to add item it to the list , we can use listIterator method.
        ((ListIterator<String>) it).add("monkey");

        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);

        }
        System.out.println("*************");

        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);// return the first value in the list

            if (value.equals("zebra")) { // if there is this object remove that object
                it.remove();
            }
        }
        // Iterate using for each loop coming from java 1.5V
        System.out.println("*************");// cause the last item removed , so loop only can retreve the three items.
        for (String aniamls : animal) {
            System.out.println(aniamls);
        }
    }
}





