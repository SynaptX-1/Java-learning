class Alpha{
    int a;
    int b;
    public Alpha(){
        a=10;
        b=20;
        System.out.println("Alpha Zero parametrized constructor");
    }
    public Alpha(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Alpha Param Constructor");
    }
}
class Beta extends Alpha{
    int x,y;
    public Beta(){
        x=10;
        y=20;
        System.out.println("Beta Zero parametrized constructor");
    }
    public Beta(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println(" Beta Param Constructor");
    }
    public void disp(){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
    
}
public class Inheritance_03 {
    public static void main(String[] args){
        Beta b= new Beta(2,4);
        b.disp();
    }
}

