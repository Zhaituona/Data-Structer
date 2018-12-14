package arrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListConcept {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();

        num.add(12);
        num.add(23);
        num.add(14);
        System.out.println(num.size());
        //retrieving
        System.out.println("The last element of the ArrayList  is ");
        System.out.println(num.get(num.size()-1));

        // iterate the ArrayList element
        for(int i=0; i < num.size(); i ++){
            System.out.println(" Get the element of the ArrayList is  " + " " + num.get(i));
        }
        // using iterator
        Iterator it = num.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
