// class Person{
//     public void disp()
//     {
//         System.out.println("Are u a person");
//     }
//     class phone{
//         public void usage()
//         {
//             System.out.println("Do u use phone");
//         }
//     }
//     static class tablet[
//         public void tabUsage(){
//             System.out.println("do u use tab");
//         }
//     ]
// }
// public class Lambdaexpression {
//     public static void main(String[] args) {
//         Person p = new Person();
//         Person.phone ph = p.new phone();
//         ph.usage();
//         tablet t = new Person.tablet();         // for static variable
//         t.tabUsage();
//     }
// }



     // Lambda expression // FunctionalInterface (SAM) , Marker(with no body o interface)
interface phone{
    void type(); // can have only one abstract method 
    // but default and predefined mehtods could be used for lambdaExpression
    default void disp(){
        System.out.println("Default method with body");
    }
    String toString();
}
class Android implements phone{
    public void type(){
        System.out.println("Android Phone");
    }
    public void battery(){
        System.out.println("6000mAh");
    }
}
public class Lambdaexpression{
    public static void main(String[] args) {
        
        phone p = new phone() { // Anonymos inner class
            public void type(){
                System.out.println("android phone ios"); // this will be executed 
            }
        };
        p.type();
        
        Android a =new Android();
        a.battery();

        phone p1 = ()->{
            System.out.println("u are using an IPhone");
        };
        p1.type();
    }
}