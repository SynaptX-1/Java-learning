class Temple{
    int id;
    String name;
}
public class A02 {
    public static void main(String[] args) {
        Temple t = new Temple();
        Temple []tm=new Temple[3];
        tm[0]= new Temple();
        tm[1]= new Temple();

        tm[0].id=1;
        tm[0].name="bajrangbali";
        System.out.println(tm[0]);
        System.out.println(tm[0].id);
        System.out.println(tm[0].name);

        System.out.println("************************");
        System.out.println(t); // Temple@1dbd16a6
        System.out.println(t.getClass().getName()); //Temple
        System.out.println("************************");
        int []arr=new int[4];
        System.out.println(arr);// [I@7ad041f3
        System.out.println(arr.getClass().getName());// [I
    }
}
