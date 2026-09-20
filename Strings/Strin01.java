public class Strin01 {
    public static void main(String[] args) {
        // The memory for this object would be allocated in the heap area insode the heap area there is a "SCP" "string Constant Pool " where memory for these literal objects is allocated and this SCP dosen't holds the duplicate objects.
        // and == compares the refrences of the objects not the values

        // String str1="Ram";
        // String str2="Ram";
        // System.out.println(str1==str2); // true 

// here in this memory will be allocated for these variables inside the SCP and equal() compares the actual values of the string 

        // String str1="Ram";
        // String str2="Ram";
        // System.out.println(str1.equals(str2)); // true 


// in this memory for objects will be allocated in the heap area will be different for different objects
        // String str1= new String("Ram");
        // String str2= new String("Ram");
        // System.out.println(str1==str2); // false

        String str1= "Ram";
        String str2= new String("Ram");
        System.out.println(str1==str2); // false

        // String str1= new String("Ram");
        // String str2= new String("ram");
        // System.out.println(str1.equalsIgnoreCase(str2)); // true
    }
}
