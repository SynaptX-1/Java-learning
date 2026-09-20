class demo{
    static int a,b;
    int x,y;
    static int count;
    static {
        System.out.println("Static Initilization block");
        a=10;
        b=20;
    }
    static void disp(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    {
        x=4;
        y=5;
        System.out.println("JAva Inti Block");
        count++;// to count no. of times object created
    }
    demo(){
        System.out.println("Constructor");
    }
    // Java Initi. block get executed during object creation before the constructor execution

    void disp2(){
        System.out.println("a "+a);
        System.out.println("count :"+count);
        System.out.println("b "+b);
        System.out.println("count :"+count);
        System.out.println("x "+x);
        System.out.println("count :"+count);
        System.out.println("y "+y);
        System.out.println("count :"+count);
    }
}
public class staticJ {
    static{
        int a=3435435;
        System.out.println(a);
    }
    public static void main(String[] args) {
        demo.disp();
        demo d1= new demo();
        System.out.println("count :"+demo.count);
        d1.disp2();
        System.out.println("count :"+demo.count);//by class name not by instance variable
        demo d3= new demo();
        d3.disp2();
    }
}
// Static block/method get executed before the main() method
// static variable is independent of objects..
// loading of the static variable in the heap area 
// Static method is preffered for the same amount of the data to be printed and can be accessed everywhere , but onky once its executed ..
// but instance variable block can be called and printed multiple times

