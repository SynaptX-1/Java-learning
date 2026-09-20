import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

interface alpha{
    interface beta{
        static void disp(){
            System.out.println("Static method of an inner interface");
        }
    }
}
public class Map02 {
    public static void main(String[] args) {
        alpha.beta.disp();
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "hello");//Entry is an inner interface of .....> Map
        hm.put(2, "how");
        hm.put(3, "are u");
        System.out.println(hm.get(3));

        Collection<String> value=hm.values();
        System.out.println(value); // we can iterate thriugh iterator too

        Set<Integer> key=hm.keySet();
        Iterator<Integer> i= key.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        Set<Entry<Integer,String>> es=hm.entrySet();
            System.out.println(es); 
// A HashMap implements Map.
// And Map defines an inner interface called Entry.
    }
}
