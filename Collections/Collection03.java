import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Collection03 {
    public static void main(String[] args) {
       CopyOnWriteArrayList al = new CopyOnWriteArrayList();
        al.add(24);
        al.add(89);
        al.add(12);
        al.add(456);
        al.add(40);
        al.add(60);      

        // Iterator it = al.iterator();
        //  while(it.hasNext()){
        //     System.out.println(it.next());
        //     al.add(23);               // no Concurentexception
        // }
        System.out.println("**********");
        ListIterator lt = al.listIterator(al.size());
         while(lt.hasPrevious()){
            System.out.println(lt.previous());

            // we can reverse too in ListIterator but not in normal one as Iterator gors in forward direction only 
        }
    }
}
