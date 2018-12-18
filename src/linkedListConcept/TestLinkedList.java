package linkedListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {


        List<String> animal = new ArrayList<String>();

        animal.add("Cat");
        animal.add("monkey");
        animal.add("rabbit");
        animal.add("dog");
        animal.add("zebra");

        Collections.sort(animal);  // this method will sorted my ArrayList .

        for(String a : animal){
            System.out.println(a);
        }

        List<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(1);
        list.add(1289);
        list.add(127);
        System.out.println("Using sorted method on the ArrayList ");
        Collections.sort(list);

        for(Integer v : list){
            System.out.println(v);
        }

    }
}
