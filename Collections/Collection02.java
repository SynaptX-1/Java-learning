import java.util.ArrayList;
import java.util.Iterator;

public class Collection02 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(24);
        al.add(89);
        al.add(12);
        al.add(456);
        al.add(40);
        al.add(60);
        // System.out.println(al);
        int i=(int)al.get(2); // downcasting becasue get() return the object
        System.out.println(i);

        // for(Object o:al){
        //     System.out.println(o);
        //     al.remove(2); 
    //  }
            // java.util.ConcurrentModificationException

         // but t is not recommended to use normal for loop or for-each loop because of the problem arising FailFast we must use "CopyOnWriteArrayList" collection to traverse sucessfully will now be-->FailSucess

         Iterator it = al.iterator();
         while(it.hasNext()){
            System.out.println(it.next());
            // al.add(23); will throw error
         }
         //we can traverse in reverse order too

    }
}
