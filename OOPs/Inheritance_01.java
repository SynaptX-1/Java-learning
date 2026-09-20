class Aeroplane{
    private String name="Puspak_Vimaan";
    String color="white";
    void fly(){
        System.out.println("Aeroplane is flying "+ name);
    }
    void landing(){
        System.out.println("Aeroplane is landing "+ color);
    }
}
class cargoplane extends Aeroplane{
    // super()
}

class commercial_plane extends cargoplane{
    void colors(){
        color = "red";
        System.out.println("color is "+color); // SPECIALIZED METHODS --> Completely different behavoiur from parent and grandparent classes
    }
    void fly(){
        System.out.println("Commerial_plane also flies in the air");
    }
}

public class Inheritance_01 {
    public static void main(String[] args){
        // commercial_plane cp= new commercial_plane();
        // cp.fly();
        // cp.landing();
        // cp.colors();
        Aeroplane plane = new commercial_plane(); 
        // UPCASTING
        
        plane.fly(); // OVERRIDEN --> Acquire properties of parent class with some modification in it

        plane.landing(); //INHERITANCE

        ((commercial_plane)plane).colors(); // DOWNCASTING // specialized method
    }
}
