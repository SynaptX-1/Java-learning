class MO{
    int add(int x, int y){
        return x+y;
    }
    double add(double x, int y){
        return x+y;
    }
    double add(double x, int y,int z){
         System.out.println("2I,1D");
        return x+y+z;
    }
    double add(double x, double y ,double z){
        System.out.println("3D");
        return x+y+z;
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        MO mo=new MO();
        System.out.println(mo.add(5,5));
        System.out.println(mo.add(5,5));
        System.out.println(mo.add(5,5,5));
        System.out.println(mo.add(5,5,5));

    }
}
