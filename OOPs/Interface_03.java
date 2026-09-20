interface college{
    void classes();
    default void students(){
        System.out.println("Students are studying in the class");  // we cn have the body of the interface despite of the method whether it is abstrract or not by using a keyword "default"
    }
    static void study(){
        System.out.println("Just go now and study");
    }
}
class Staff implements college{
    public void classes(){
        System.out.println("Here is the college staff");
    }
    // it is not necessary to override the default method in an interface if there is any need then we can ovverride it and alos can change the specifiers according to the rules
}
public class Interface_03 {
    public static void main(String[] args){
    Staff sc = new Staff();
    sc.classes();
    sc.students();
    // INVALID we cannot inherit static method in an interface  sc.study();
    }
}
