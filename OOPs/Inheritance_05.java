class parent{
    int i=10;
    void disp(){
        System.out.println("disp of parent");
    }
}
class child extends parent{
    int i=100;
    void alpha(){
        System.out.println("alpha");
        System.out.println("i :"+i);
        System.out.println(super.i);
        disp();
        super.disp();
    // there is no grndparent call like super.super.disp()
    }
    void disp(){
        System.out.println("child class disp");
    }
}
public class Inheritance_05 {
    public static void main(String[] args){
        new child().alpha();
    }
}
