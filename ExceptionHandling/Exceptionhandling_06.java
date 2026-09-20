// At the time of overriding a method a child can cna throw a unchecked exception but it cannot throw any of the checked exception

// if a parent is throwing an checked exception then a child can throw checked/unchecked excpetion or do not throw any exception but it cannot throw partiallychecked exception(like Exception and Throwable)

import java.io.IOException;

class Parent 
{
    public void work() throws IOException
    {
        System.out.println("Parent works hard");
    }
}
class child1 extends Parent{
    public void work() throws ArithmeticException
    {
        System.out.println("Child1 also works hard");
    }
}
class child2 extends Parent{
    public void work()
    {
        System.out.println("Child2 also works hard");
    }
}
class child3 extends Parent{
    public void work() throws IOException
    {
        System.out.println("Child3 also works hard");
    }
}
// Give CompileTiemError child throws PartiallyVheckedException
// class child4 extends Parent{
//     public void work() throws Exception
//     {
//         System.out.println("Child4 also works hard");
//     }
// }
public class Exceptionhandling_06 {
    public static void main(String[] args) {
        
    }
}


// We can Nested-try-catch-finally working is like-> if-else... 
// Only try/catch/finally and catch-try -> Not ALlowed
// try-catch/try-finally-> Allowed