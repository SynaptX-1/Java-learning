public class String03 {
    public static void main(String[] args) {
        // String s1="hhhhh";
        // String s2="hhhhh";
        // System.out.println(s1.compareTo(s2)); // 0

        String s1="hhhhh";
        String s2="hello"; //comparing according to the ASCII values
        int s3= s1.compareTo(s2);
        if(s3==0) System.out.println("Stirngs are equal");
        else System.out.println(" Strings are not equal");

    }
}
