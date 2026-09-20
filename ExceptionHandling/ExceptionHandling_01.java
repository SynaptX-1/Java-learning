// Exception -> An unwanted/unexpected event that occurs during the
// execution/runtime of a program/bytecode and can disrupt the normal flow of the program.
// If the exception is not handled, it can cause abnormal termination.

// Exception occurs
//       ↓
// catch handles it
//       ↓
// Program can continue normally

// Each method call gets its own stack frame.
// When an exception occurs, an exception object is created.
// The JVM then looks for a matching exception handler (catch)
// starting from the method where the exception occurred.

import java.util.Scanner;
class Alpha
{
    void calc()
    {
        System.out.println("Alpha processed");
        Scanner s= new Scanner (System.in);
    try
    {
        System.out.println("Kindly Enter the numerator");
        int num = s.nextInt();
        System.out.println("Kindly Enter the denominator");
        int den = s.nextInt();
        int res = num/den;
        System.out.println("Result is "+ res);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Kindly enter non-zero denominator");
    }
    // try
    // {
        System.out.println("Kindly enter size of the array");
        int size= s.nextInt();
        int arr[]= new int[size];
        System.out.println("Kindly enter index of the array");
        int index=s.nextInt();
        System.out.println("Kindly enter element of the array");
        int ele = s.nextInt();
        int x=arr[index]=ele;
        System.out.println("Element inserted in array is "+x);
    // }
    // catch(Exception e) // Generic Catch Block recommended to inckude at the end 
    // {
    //     System.out.println("Some problem occured");
    // }
}
}
 
class Beta
{
    public void disp()
    {
        Alpha a =new Alpha();
        a.calc();   
    }
}

public class ExceptionHandling_01 {
    public static void main(String[] args) {
        Beta b = new Beta();
        b.disp();
    }
}

// If an exception is not handled in the method where it occurs,
// the JVM propagates the exception to the caller method.
// It checks whether the caller method has a matching exception handler.
// If not handled there, it continues propagating up the call stack.
// If no method handles it, the JVM's default exception handler
// prints the exception and the program terminates abnormally.

// Kindly enter size of the array
// -5
// Exception in thread "main" java.lang.NegativeArraySizeException: -5
//         at Alpha.calc(ExceptionHandling_01.java:26)
//         at Beta.disp(ExceptionHandling_01.java:46)
//         at ExceptionHandling_01.main(ExceptionHandling_01.java:53)
