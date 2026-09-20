// CONCEPT OF MUTABLE STRING 
// using StringBuffer and StringBuilder

public class String05 {
    public static void main(String[] args) {
        // StringBuffer s1="Heloooo"; // CompileTimeError
        StringBuffer s1 = new StringBuffer("JaiHoo");
        s1.append(" boolooo!!");
        System.out.println(s1); // same string object is getting changed
        s1.append(45.3423);
        s1.append( true);
        System.out.println(s1); // existing string is getting modified
    }
}
