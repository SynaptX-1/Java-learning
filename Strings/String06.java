
public class String06 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer(); // default 16 length
        System.out.println(s.capacity());
        StringBuilder s1 = new StringBuilder();
        System.out.println(s1.capacity());
        s1.append("fly in the sky as long as u can");
        System.out.println(s1);
        System.out.println(s1.capacity());
        // old_capacity*2+2 ==> 16*2+2=34

        StringBuffer sr1=new StringBuffer("Hey");
        StringBuffer sr2=new StringBuffer("Hey");
        System.out.println(sr2.equals(sr1)); //false ==> 
        // ”StringBuffer does not override equals(), so it inherits Object.equals(), which compares object identity (references), not the contents.”
}
