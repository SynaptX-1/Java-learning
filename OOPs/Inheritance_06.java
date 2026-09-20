// Rules to Override the Methods


class Plane{

}
class Fighter_Plane extends Plane{

}
class Animal{
    public void eat(String foodtype){
        System.out.println("Animal eats");
    }
     
    void sleep(){
        System.out.println("Animals Sleep");
    }

    // public void running(){
    //     System.out.println("Animal is Running");
    // }

    public Plane running(){ 
        System.out.println("Animal is ruuning");
        Plane p= new Plane();
        return p;
    }
}
class Tiger extends Animal{
    // void eat(){
    //     System.out.println("Tiger are omnivore");
    // } 
    // we cannot reduce the visibility of the overriding inherited methods 

    // We can either increase the visibility or remains same

    public void eat(String foodtype){
        System.out.println("Animal eats");
}
    public void eat(){ // same name different parameters it's not an overriden methods its an specilaized method(overloaded method of child class)
        System.out.println("Tiger are Omnivore");
    }

    protected void sleep(){
        System.out.println("TIgers also sleep");
    }   // Visibility increased 

    // public int running(){ // The Primitive return types cannot be changed
    //     System.out.println("Tiger is ruuning to hunt");
    //     return 10;
    // }

    public Fighter_Plane running(){
        System.out.println("Tiger is Running");
        Fighter_Plane fp= new Fighter_Plane();
        return fp;
    }
    // practically we can't change the return type while overriding the method

// Above one is called a "co-variant return type" these are such return which hava  is-A relationship
}

// private members of a class will never get inherited so we cannot override them 

public class Inheritance_06{
    public static void main(String[] args){
        Tiger t = new Tiger();
        t.eat();
        t.sleep();
        t.running();
    }
}