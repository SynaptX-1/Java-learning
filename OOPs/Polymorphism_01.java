class Aeroplane{
    public void taking_off(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class Cargo_Aeroplane extends Aeroplane{
    public void taking_off(){
        System.out.println("Cargo_Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Cargo_Aeroplane is flying");
    }
}
class fighter_Aeroplane extends Cargo_Aeroplane{
    public void taking_off(){
        System.out.println("fighter_Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("fighter_Aeroplane is flying");
    }
}

public class Polymorphism_01 {
    public static void main(String[] args){
        Aeroplane a = new Aeroplane();
        Cargo_Aeroplane cp = new Cargo_Aeroplane();
        fighter_Aeroplane fp = new fighter_Aeroplane();
        Aeroplane aeroplane;
        a.taking_off();
        a.fly();
        System.out.println("*********************************");
        aeroplane = cp;
        aeroplane.taking_off();
        aeroplane.fly();
        System.out.println("*********************************");
        aeroplane = fp;
        aeroplane.taking_off();
        aeroplane.fly();
    }
}

// This is a run time polymorphism but here we have the long length of code 
// Polymorphism promotes code reusability and reduces lengthyness of the program
