
public class String04 {
    public static void main(String[] args) {
        String s1="     Jai Shree Ram";
        String []s2=s1.split("a");
        for(String s:s2){
        System.out.println(s);
        }
        System.out.println(s1.trim());
    }
}
