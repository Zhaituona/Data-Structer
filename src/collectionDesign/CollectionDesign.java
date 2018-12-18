package collectionDesign;

import java.util.*;

public class CollectionDesign {



    public static <Enter> void main(String[] args) {
       // Map<String,Integer>  map = new HashMap<String,Integer>();// not sorted order ,
       // Map<String,Integer>  map = new LinkedHashMap<String,Integer>();
       // map.put("one",123);
       // map.put("Two",12);
      //  map.put("Three",124);
       // map.put("Five",159);
      //  map.put("Six",16);

        Map<Integer,Person>  map = new LinkedHashMap<Integer,Person>();


        Person p1 = new Person(23,"zana");
        Person p2 = new Person(22,"semal");
        Person p3 = new Person(27,"Dora");
        Person p4 = new Person(26,"kamila");

        map.put(1,p1);
        map.put(2,p2);
        map.put(3,p3);
        map.put(4,p4);


        for(Map.Entry<Integer,Person>  v : map.entrySet()){
            int key= v.getKey();
            Person p = v.getValue();
            System.out.println("The "  + key + "  "+ p.name  +" " + p.age);


        }
        Set<String>  set1= new LinkedHashSet<String>();
        set1.add("One");
        set1.add("Hello");
        set1.add("Java");
        set1.add("Three");

        System.out.println(set1);

        Set<Person>  set2 = new LinkedHashSet<Person>();

        Person ps1 = new Person(23,"zana");
        Person ps2 = new Person(22,"semal");
        Person ps3 = new Person(27,"Dora");
        Person ps4 = new Person(26,"kamila");
        set2.add(ps1);
        set2.add(ps2);
        set2.add(ps3);
        set2.add(ps4);

        System.out.println(set2);




    }
}
