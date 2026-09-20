class Student{
    String name;
    int age;
    int id;
    void studying(){
        System.out.println("Student is studying");
    }
    void playing(){
        System.out.println("Student is playing");
    }
}
public class Launch1{
    public static void main(String[] args){
        A04 st=new A04();
        st.studying();
        st.playing();
    }
}