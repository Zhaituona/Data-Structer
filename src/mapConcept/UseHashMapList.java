package mapConcept;

//import java.security.KeyStore;
import java.util.*;

public class UseHashMapList {

    public static void main(String[] args) {
        List<Integer> countOfUSA = new ArrayList<Integer>();

        countOfUSA.add(12);
        countOfUSA.add(96);
        countOfUSA.add(96);

        List<Integer> countOfUK = new ArrayList<Integer>();

        countOfUK.add(36);
        countOfUK.add(0);
        countOfUK.add(16);
        List<Integer> countOfCAN = new ArrayList<Integer>();
        countOfCAN.add(36);
        countOfCAN.add(0);
        countOfCAN.add(16);

        Map<String, List<Integer>>  list  = new LinkedHashMap<>();
        Map<String, List<Integer>>  list1 = new HashMap<>();
        System.out.println("Using Linked hash map");
        list.put("USA" , countOfUSA);
        list.put("UK", countOfUK);
        list.put("CAN", countOfCAN);

        list1.put("USA" , countOfUSA);
        list1.put("UK", countOfUK);
        list1.put("CAN", countOfCAN);


        for(Map.Entry  enter : list.entrySet()){
            System.out.println(enter.getKey()   + "  " + enter.getValue());
        }
        System.out.println("Using HashMap concept");
        for(Map.Entry  enter1 : list1.entrySet()){
            System.out.println(enter1.getKey()  + " " +enter1.getValue());
        }


    }
}