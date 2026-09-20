class SOE{
    public void alpha()
    {
        beta();
    }
    public void beta(){
        alpha();
    }
}

public class ExceptionHandling_04 {
    public static void main(String[] args) {
        SOE s = new SOE();
        s.alpha();
    }
}

// Exception in thread "main" java.lang.StackOverflowError , it is not an exception its an errorits an error not an excpetion

