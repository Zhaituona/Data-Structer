package hashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept2 {
    public static void main(String[] args) {


        HashMap<Integer, Student> st = new HashMap<Integer, Student>();

        Student std1 = new Student("zaytuna", 3747, 31);
        Student std2 = new Student("Seemal", 3368, 30);
        Student std3 = new Student("kamila", 3748, 34);
        Student std4 = new Student("Mira", 3032, 35);

        st.put(1,std1);
        st.put(2,std2);
        st.put(3,std3);
        st.put(4,std4);

        for(Map.Entry<Integer,Student> m : st.entrySet()){
            int k = m.getKey();
            Student stx= m.getValue();
            System.out.println("The key is  "+ k);
            System.out.println("The value is  " + stx.stAge +" " + stx.stName + " " + stx.stID);

        }


    }
}