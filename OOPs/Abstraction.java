abstract class Aeroplane2{
    abstract public void fly();
    abstract public void taking_off();
    abstract public void landing();
    public void crash(){
        System.out.println("Aeroplane is crashing");
    }
}
class cargoplane extends Aeroplane2{
    public void fly(){ //overrriding abstract method
        System.out.println("cargoplane is about to fly in the sky");
    }
    public void taking_off(){
        System.out.println("cargoplane is taking_off at the airport");
    }
    public void landing(){
        System.out.println("cargoplane is about to land on the. airport");
    }
    public void boarding(){
        System.out.println("u need a boarding pass to get into the cargo_plane");
    }
}
class passenger_plane extends cargoplane{
    public void fly(){
        System.out.println("passener_plane is about to fly in the sky");
    }
    public void taking_off(){
        System.out.println("passener_planeis about to take_off");
    }
    public void landing(){
        System.out.println("passener_plane is landing at the airport");
    }
}
class Airports{
    public void permit(Aeroplane2 airplane){
        airplane.fly();
        airplane.taking_off();
        airplane.landing();
    }
}
public class Abstraction {
    public static void main(String[] args){
        cargoplane cp = new cargoplane();
        passenger_plane pp = new passenger_plane();
        Airports a = new Airports();
        a.permit(cp);
        a.permit(pp);
    }
}
