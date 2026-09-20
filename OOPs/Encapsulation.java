class Employee{
    // "private" keyword is used to secure our data 
    private String name;
    private int id;

    // Setter
    void setName(String name){
        this.name=name;
        // To avoid ambiguity in our program we use "this" keyword so that java compiler will be able to differentiate between the instance & local variable and avoid "shadowing problem"

        // "this" keyword has the "address of currently running objects"
    }
    void setId(int Eid){
        id=Eid;
    }

    // Getter
    void getName(){
        System.out.println(name);
    }
    void getId(){
        System.out.println(id);
    }

}
public class Encapsulation {
    public static void main(String[] args){
        Employee em=new Employee();
        em.setName("Kaushik Singh");
        em.setId(1234);
        em.getName();
        em.getId();

    }
}
//Encapsulation: Uniting Data members annd methods and getting controlled acess by using concept of setters and getters