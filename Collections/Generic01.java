class Generics<T>{
    private T ref;

    public Generics(T ref) {
        this.ref = ref;
    }
    public void disp(){
        System.out.println("The type of T is "+ref.getClass().getName());
    }
    public T getRef() {
        return ref;
    }
}
public class Generic01 {
    public static void main(String[] args) {
        Generics<Integer> g = new Generics<>(44);//Primitive data types not allowed in generics
        g.disp();
        System.out.println(g.getRef());

        // Generics<Integer> g = new Generics<>("sdff"); CompileTimeError

        
    }
}
