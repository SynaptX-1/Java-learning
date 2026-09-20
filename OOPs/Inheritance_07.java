class Demo4{
    static int a;
    public static void disp(){
        a=10;
        System.out.println(a+" Parent class");
    }
}
 class Demo5 extends Demo4{
    // Static method do get inherited but
    // if u try to override the static method it's not possible 
    // below is  the concept of "Method Hiding"
    // this is a specialized method can be only accesed by downcasting
    public static void disp(){
        a=10;
        System.out.println(a+" child class ");
    }
 }

public class Inheritance_07 {
    public static void main(String[] args){
        // Demo5 d= new Demo5();
        // d.disp();
        // Demo5.disp();
        Demo4 d1= new Demo5();
        d1.disp();
        ((Demo5)d1).disp();
        Demo4.disp();

    }
}
