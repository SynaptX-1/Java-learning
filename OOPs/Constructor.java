// Constructor : It is a specialized setter which has the name as that of the class and dossen't have any explicit return type

// Constructor is invoked during object creation(instantiation)

// If there is a call to construcor and java developer has hardcoded any setter inside a class with or without parameters then there will not be any default constructor added inside the class by javaC "but" if u wanna add or call the method multiple times isnisde the main method and u have hardcoded any constructor inside the class then there will not be any default constructor and u have to incude it inside the class by urself

//Creating multiple constructor with same name and different parameters is reffered to as constructor overloading 

// Super() method call is the first line in the cunstructor class , super() method is invoked only when there is no this() method call . super() method calls out the parent class cunstructor
class dog{
    private String name;
    private String color;
    private int tag;
    dog(String name , String color, int tag){
        this.name=name;
        this.color=color;
        this.tag=tag;
    }
    dog(){
        name="Scribi";
        color="black";
        tag=2;

    }
    public void setName(String dname){
        name=dname;
    }
    public void setColor(String dcolor){
        color=dcolor;
    }
    public void setTag(int dtag){
        tag=dtag;
    }
    String getName(){
        return name;
    }
    String getColor(){
        return color;
    }
    int getTag(){
        return tag;
    }
}
public class Constructor {
    public static void main(String[] args){
        dog d1 = new dog("Incredi","white",1);
        System.out.println(d1.getName());
        System.out.println(d1.getColor());
        System.out.println(d1.getTag());
    
        System.out.println("********************************");

        dog d2 = new dog();
        System.out.println(d2.getName());
        System.out.println(d2.getColor());
        System.out.println(d2.getTag());

    }
}
