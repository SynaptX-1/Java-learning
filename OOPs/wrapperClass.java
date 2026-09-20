//Java is not the pur OOPs language as it includes primitive data types.... We can convert the java to pure oops by use if wrapper classes..

public class wrapperClass {
    public static void main(String[] args){
        Integer i= Integer.valueOf(10);
        System.out.println("i:"+i);
        // Boxing : Converting Primitive data types into its corrresponding Wrapper object
        // AutoBoxing : Automaticaly Converting Primitive data types into its corrresponding Wrapper classes by Javac
        int n=2;
        Integer n1=n; // AutoBoxing
        Integer j=Integer.valueOf(n1); //Boxing
        System.out.println(j);

        // Unboxing :Conversion of Wrapper classses back to the corrsponding primitive data types
        // Similarly there is the concept of AutoUnboxing....
        Integer k=Integer.valueOf(43);
        int n2=k;
        int n3=k.intValue();
    }    
}
