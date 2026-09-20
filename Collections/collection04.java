import java.util.Enumeration;
import java.util.Vector;

public class collection04 {
    public static void main(String[] args) {
        Vector v = new Vector(); // act as an ArrayList
        v.addElement(100);
        v.add(432);
        v.add("Hello");
        System.out.println(v);

    Enumeration en = v.elements(); // same kind. of working just like Iterator
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
