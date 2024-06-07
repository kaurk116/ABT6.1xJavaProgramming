package ex_june_01_set;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class lab0167 {
    public static void main(String[] args) {
        Queue que =new PriorityQueue();
        que.add("B");  //sort the element
        que.add("A");
        que.add("c");
        que.add("D");

        System.out.println(que);
        que.peek();
        System.out.println(que);
        que.poll();
        System.out.println(que);

        Iterator queI =que.iterator();
        while (queI.hasNext());
        System.out.println(queI.next());
    }
}
