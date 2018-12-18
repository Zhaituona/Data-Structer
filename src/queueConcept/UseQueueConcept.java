package queueConcept;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueueConcept {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(12);
        q.add(34);
        q.add(1);
        System.out.println(q);
      //  System.out.println(((LinkedList<Integer>) q).getFirst());
      //  System.out.println(q.peek());
        System.out.println(((LinkedList<Integer>) q).pop());
        ((LinkedList<Integer>) q).remove(1);
        ((LinkedList<Integer>) q).removeLast();
  // it will going out one by one but it is FIFO , first in first out
        System.out.println(q);
    }
}
