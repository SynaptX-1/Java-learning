import java.util.*;
class Alpha
{
    // What if u dont incklude Ctach Block in that situation it's our responsibility to make the Caller Method aware about ,That exception might occur by"throws" keyword and then it can handle it (declaring up the exception)

    // Another way is ,you rethhrow the exception by " throw " jeword inside the catch block nor wherever ,you handled it and then rethrwing it

    void calc() throws ArithmeticException
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
    catch(Exception e)
    {
        System.out.println("sdsf");
        throw e;
        // System.out.println("aweqw"); // can't write it will never be execute ->CE
    }
    finally{ // it can be wriiten inside the catch block also 
        System.out.println("This will always be executed no matter exception occurs or not");
    }
}
}

public class ExceptionHandling_02 {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        try
        {
            a.calc();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Enter non-zero number");
        }
    }
}

// thwos vs throw 
// throws: makinf=g the caller method aware that exception might occur u can handle it at ur end
// throw: throw  → ACTUALLY THROWS → "Throw this exception now.".
//  or may be Exception already handled and at the same time u wanna make aware the other methods also which called out the defaulter method that exception might occur, statement written after the throw are not gonne execute further 
