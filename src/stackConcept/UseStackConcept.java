package stackConcept;

import java.util.Stack;

public class UseStackConcept {

    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("Java");
        s.push("Selenium");
        s.push("Qtp");
        s.push("UFT");// last in first out
        System.out.println(s);

       // System.out.println(s.peek());// the method for reading
       // System.out.println(s.pop()); // this will showing he last in
        // first out .
        System.out.println(s.search("Qtp"));
        if(s.peek().equalsIgnoreCase("UFT")){
            System.out.println("They are same");
        }
        else{
            System.out.println("They are not same");
        }

    }
}
