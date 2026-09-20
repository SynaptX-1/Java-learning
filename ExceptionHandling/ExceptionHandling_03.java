class Gama
{
    public int disp()
    {
        try{
            System.out.println("This is try Block");
            return 4;
        }
        finally
        {
            System.out.println("This is finally block");
            return 44;
        }
    }
}

public class ExceptionHandling_03 {
    public static void main(String[] args) {
        Gama g = new Gama();
        System.out.println(g.disp());
    }
}

// try block starts
//    ↓
// prints "This is try Block"
//    ↓
// return 4 is encountered
//    ↓
// BUT before actually returning...
//    ↓
// finally block executes
//    ↓
// prints "This is finally block"
//    ↓
// finally has return 44
//    ↓
// 44 is returned