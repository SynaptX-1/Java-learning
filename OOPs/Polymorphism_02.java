// RunTime Polymorphism is acheived when there is method overriding


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

class Airport{
    public void permit(Aeroplane aeroplane){ // Parent type of aeroplane will hold the address of the various objects
        aeroplane.taking_off();
        aeroplane.fly();
    }
}

public class Polymorphism_02 {
    public static void main(String[] args){
        Aeroplane ap = new Aeroplane();
        Cargo_Aeroplane cp = new Cargo_Aeroplane();
        fighter_Aeroplane fp = new fighter_Aeroplane();
        Airport A = new Airport();
        A.permit(ap);
        A.permit(cp);
        A.permit(fp);
    }
}
