// final class Plane{

// } would be invald because final class wouldn't participate in inheritance
class Plane{
    public final static String fly="Let's FLY";
    final void disp(){
        System.out.println("Pane fliwes in the air");
    }
}
class Fighter_Plane extends Plane{
    void display(){
        System.out.println("Fighter_plane fights with enemies");
    }
}

public class Inheritance_08 {
    public static void main(String[] args){
        Plane p= new Fighter_Plane();
        p.disp();
    }
}
