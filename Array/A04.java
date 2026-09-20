class student {
    private String name;
    private int age;
    public student(String name, int age) {
    this.name = name;
    this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return getName()+" "+getAge();
    } // if this is not written then sysout(st) will return "class name + @ + a hash-code representation" of the tostring object.
}
public class A04{
    public static void main(String[] args) {
        student st = new student("Bajrangbali",100000);
        System.out.println(st);
        System.out.println(st.getName());
        System.out.println(st.getAge());
    }
}
