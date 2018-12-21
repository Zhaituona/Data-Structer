package sortedMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestSortedMap {
    public static void main(String[] args) {

        Map<Integer,String> Hashmap = new HashMap<Integer,String>();// not sorted
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();// based on sorted, maintance the order by we put in
        Map<Integer,String> TreehMap = new TreeMap<Integer,String>();// it will sorted, will sorted by key ,
        // sorted key by natural order .

       // testMap(Hashmap);
       testMap(linkedHashMap);
       // testMap(TreehMap);
    }
    public static void testMap(Map<Integer,String>map){

        map.put(1,"Tom");
        map.put(3,"Jerry");
        map.put(6,"Booba");
        map.put(12,"Paw Parol");
        map.put(9,"Masha");
        map.put(98,"Mickey");
        map.put(2,"Car");

        for(Integer key : map.keySet()){
            String value = map.get(key);

            System.out.println(key   + " " + value);
        }

    }
}
