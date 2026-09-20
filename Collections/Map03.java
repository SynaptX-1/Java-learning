import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
class Passport{
    private String city;
    private String name;
    private String country;
    
    
    public Passport(String city, String name, String country) {
        this.city = city;
        this.name = name;
        this.country = country;
    }


    @Override
    public String toString() {
        return "Passport [city=" + city + ", name=" + name + ", country=" + country + "]";
    }
    
}

public class Map03 {
    public static void main(String[] args) {
        Passport p1 = new Passport("Mumbai","Sohan","India");
        Passport p2 = new Passport("Bengaluru","Rohan","India");
        Passport p3 = new Passport("Chennai","Anna","Bharat");

        Integer id1= new Integer(101);
        Integer id2= new Integer(102);
        Integer id3= new Integer(103);

        HashMap<Integer,Passport> hm = new HashMap<>();
        hm.put(id1, p2);
        hm.put(id2, p2);
        hm.put(id3, p3);

        Scanner s = new Scanner(System.in);
        Integer userN= s.nextInt();
        Set es=hm.entrySet();
        Iterator i = es.iterator();
        boolean flag = false;
        while(i.hasNext()){
            Map.Entry keyValue=(Entry) i.next();
            Integer key = (Integer)keyValue.getKey();
            if(key.equals(userN)){
                System.out.println(keyValue.getValue());
                flag = true;
            }
        }
        if(flag==false){
            System.out.println("Unable to fetchyour Passport");
        }
    }
}
