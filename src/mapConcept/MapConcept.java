package mapConcept;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapConcept {

    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<String,Integer>(); // steak
      // Map<String,Integer> map1 = new LinkedHashMap<String,Integer>();
       // Map<String,Integer> map1 = new Hashtable<String, Integer>();

        map1.put("USA", 12);
        map1.put("UK", 13);
        map1.put("CAN",5);

        System.out.println(map1.get("UK"));

        for(Map.Entry m : map1.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
