import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Collection01 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add("qwdqw");
        al.add(24.5);
        System.out.println(al);
        System.out.println("******************"); //Insertion order is followed

        LinkedList ll = new LinkedList();
        ll.add(12);
        ll.add("qwdqw");
        ll.add(24.5);
        System.out.println(ll);
        System.out.println("******************"); //Insertion order is followed

        ArrayDeque aq = new ArrayDeque();
        aq.add(12);
        aq.add("qwdqw");
        aq.add(24.5);
        System.out.println(aq);
        System.out.println("******************"); //Insertion order is followed

        PriorityQueue pq = new PriorityQueue(); //uses minheap concept to sort it ....// Insertion order is not followed
        pq.add(120);
        pq.add(200);
        pq.add(24);
        pq.add(44);
        pq.add(20);
        pq.add(90);
        System.out.println(pq);
        System.out.println("******************"); 
    // [20, 24, 90, 200, 44, 120] minheap formed

        TreeSet ts = new TreeSet();
        ts.add(12);
        ts.add(89);
        ts.add(24);
        ts.add(456);
        ts.add(40);
        ts.add(60);
        System.out.println(ts);
        System.out.println("******************"); // sorting the leemnts in ascending order

        HashSet hs = new HashSet();
        hs.add(12);
        hs.add("qwdqw");
        hs.add(24.5);
        System.out.println(hs);
        System.out.println("******************"); // uses hashing concept

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(12);
        lhs.add("qwdqw");
        lhs.add(24.5);
        System.out.println(lhs);
        System.out.println("******************"); //Insertion order is followed 
    }
}
// Using different types of data in within a single collection is not recommended at all its not an good practice