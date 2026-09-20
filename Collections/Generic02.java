import java.util.ArrayList;
import java.util.List;
class human{

}
class Student extends human{

}
class employe{

}
public class Generic02 {
    public static void main(String[] args) {
        // Object o = new Object();
        // String s = new String();
        // o=s;//valid 
        // s=(String)o;//INVALID until do it's --> downcasting

        // human h = new human();
        // Student s = new Student();
        // h=s;
        // s=(Student)h;

        //  ArrayList<human> ahl = new ArrayList<>();
        // ArrayList<Student> asl = new ArrayList<>();
        // ahl=asl; // not allowed(Collection of one to another) CE 

        // ArrayList<?> ahl = new ArrayList<>(); // WILD CARD ==> unkown
        // ArrayList<Student> asl = new ArrayList<>();
        // ahl=asl;

        // ArrayList<? extends human> ahl = new ArrayList<>(); // uppperbound
        // ArrayList<Student> asl = new ArrayList<>();
        // ArrayList<employe> el = new ArrayList<>();
        // ahl=asl;
        // ahl=el; // CE

        // ArrayList<? super human> ahl = new ArrayList<>(); // lowebound
        // ArrayList<Student> asl = new ArrayList<>();
        // ArrayList<Object> ol = new ArrayList<>();
        // // ahl=asl;   CE
        // ahl=ol; 
        // // either human or super of human


        ArrayList<Student> asl = new ArrayList<>();
        asl.add(new Student());
        asl.add(new Student());
        invockdisp(asl);
    }

    // public static void invockdisp(List<human> list) //invalid

// public statc void Iterable<Integer> getInteger/s()[] since iterable is the parent of collection it can return new ArrayList<Integer>();
    public static void invockdisp(List<? extends human> list){
    for(human h:list){
        System.out.println(h);
    }
  }
}
