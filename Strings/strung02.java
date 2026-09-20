
public class strung02 {
    public static void main(String[] args) {
        // String s1="Hello";
        // s1.concat("Guys");
        // System.out.println(s1); 
        // // Because String is immutable

        // String s1="Hello";
        // String s2=s1.concat("Guys");
        // System.out.println(s2);  
        //  // a new reference isbeing created 

        String s1="Hello";
        String s2=s1.concat(" Guys");
        String s3=s1+s2;
        String s4="Hello Guys";
        System.out.println(s3);
        System.out.println(s2==s4); // false because concat() creates a new String object for s2,
// while s4 refers to the "Hello Guys" String literal from the String Pool.
// Therefore, s2 and s4 refer to different objects


    String sr1 = 45+45+"Hello"; // since integer frist so add
    String sr2 = "Hello"+45+45; // since string first so others are also treated as string
    System.out.println(sr1);
    System.out.println(sr2);

    String stri = "JagJanni";
    System.out.println(stri.length());
    System.out.println(stri.substring(3, 8));
    char []ch = stri.toCharArray();
    for(char chr:ch){
    System.out.println(chr);
    }
    }
}
