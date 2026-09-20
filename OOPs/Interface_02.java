// interface demo1{

// }
// interface demo2 implements demo1{

// } this is invalid an interface cannot implemt another interface

interface demo1{
    void disp();
    float pi=3.14f; // by default it is public,static,final
}
interface demo2 extends demo1{
    void disp();
} 
class Alpha implements demo2,demo1{
    public void disp(){
        System.out.println("Focus is key to sucess");
    }
    void show(){
        System.out.println("hey! how are you");
    } //specialized method
}
public class Interface_02 {
    public static void main(String[] args){
        demo1 d1 = new Alpha();
        d1.disp();
        demo2 d2 = new Alpha();
        d2.disp();
    }
}