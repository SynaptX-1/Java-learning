interface Calc{
    void add(int a ,int b);
    void sub(int a ,int b);
}
interface Calc2{
    int mul();
    int div();
}
class MyCalc implements Calc{
    public void add(int a,int b){
        int res=a+b;
        System.out.println(res);
    }

    public void sub(int a,int b){
        int res=a-b;
        System.out.println(res);
    }
}

class MyCalc2 implements Calc2{
    public int mul(){
        int res=2*2;
        return res;
    }

    public int div(){
        int res=4/2;
        return res;
    }
}

class Algebra{
    public void calculation(Calc c, int a,int b){
        c.add(a,b);
        c.sub(a,b);
    }
    public void calculation2(Calc2 c2){
         int res1=c2.mul();
         int res2=c2.div();
         System.out.println(res1);
         System.out.println(res2);
    }
}
public class Interface_01 {
    public static void main(String[] args){
        MyCalc mc = new MyCalc();
        MyCalc2 mc2 = new MyCalc2();
        Algebra a = new Algebra();
        a.calculation(mc,22,44);
        a.calculation2(mc2);
    }
}
