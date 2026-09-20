import java.util.ArrayList;

    // in arrays we have the type safety but in Collection the way in which i used it previouly dosen't provide the type safety 
    //We need to specify the type of data we wanna use in collection

    class Employee{
        private String satire;
        private String Satire;
        private int no;
        
        public Employee(String satire, String satire2, int no) {
            this.satire = satire;
            Satire = satire2;
            this.no = no;
        }

        @Override
        public String toString() {
            return "Employee [satire=" + satire + ", Satire=" + Satire + ", no=" + no + "]";
        }

        
    }

public class Collection05 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(23);
        al.add(567);
        al.add(97);
        System.out.println(al);
            // making our own object
    ArrayList<Employee> em = new ArrayList<>();
    em.add(new Employee("Object"," creation",12)); // creating a new Employee object using the matching constructor
    em.add(new Employee("Keep"," Practicing",01));
    for(Employee e : em){
        System.out.println(e);
    }
    }
}
