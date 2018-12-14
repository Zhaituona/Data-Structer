package hashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {   // HashMap not maintain order , so it means it not sorted, it could change
    public static void main(String[] args) {

        HashMap<Integer,String> myHM= new HashMap<Integer, String>();

       // Map<Integer,String> newHM= new HashMap<Integer,String>();


        // created HashMap object
        myHM.put(1,"Selenium");
        myHM.put(2,"Java");
        myHM.put(3,"Mysql");
        //myHM.put(4,"Mongodb");//
        // //duplicated not allow , for the purpose , compile will confuse , which can be called.
        // when we put the same key in to the HashMap the value will be override . not use same key
        // null key and null value will be allowed
        myHM.put(4,"hello");
        myHM.put(5,null);
        myHM.put(6,null);
        myHM.replace(4,"QTP");
        System.out.println(myHM.get(4));

        System.out.println(myHM.get(2));
        System.out.println(myHM.size());
        System.out.println(myHM.get(5));
        System.out.println(myHM.get(4));
        System.out.println("The HashMap key and value is ");
        System.out.println(myHM.get(5));// why don't give me null?

        for(Map.Entry m: myHM.entrySet()){// it will let you set where o start , for each loop
            System.out.println(m.getKey() + " "+ m.getValue());

        }
        System.out.println("****************");
        for(Map.Entry<Integer,String> v : myHM.entrySet()){
           int k =  v.getKey();
           String s = v.getValue();
            System.out.println("The value and key for HashMap "  + " " +k + " "+ s);

        }
        System.out.println(myHM);
        myHM.remove(3); // it means the 3rd key is removed , not be shiffed by 4th .
        // in that case even if you remove , key is still in there . not shiffed .
        System.out.println(myHM);
        System.out.println("********************");

        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
        Employee em1 = new Employee(100,"zana",23);
        Employee em2 = new Employee(101,"semal",25);
        Employee em3 = new Employee(102,"dora",27);

        emp.put(1,em1);
        emp.put(2,em2);
        emp.put(3,em3);

        System.out.println("retrieve the value and key ");

        for(Map.Entry<Integer,Employee> m : emp.entrySet()){
               int key= m.getKey();
               Employee e = m.getValue();

            System.out.println(key + " " + "Employee info");
            System.out.println(e.empAge + " "+  e.empName +" " + " "  +e.empID);




        }

    }
}
