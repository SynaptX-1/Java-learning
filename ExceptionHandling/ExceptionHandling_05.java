public class ExceptionHandling_05 {
    public static void main(String[] args) {
        
    System.out.println("Main metod task started")
    Thread.sleep(5000); 
    
    // Compiler is anticipating that it may throw an InterruptedException
    // these are called tCheckedException , they are nit the compile time exception , Excception always occur at the runtimenonly here it is ckecked by the compiler..
    // CheckedException: Whose possibility is checked by the compiler
    // UnCheckedException: Whose possibility is not checked by the compiler

    System.out.println("Main method task completed");
}


// All those which end with -able (Iterable,runnable,serializable etc...) always an predefined interfaces at parent heirarchy except the 'Thowable' which is a class 1