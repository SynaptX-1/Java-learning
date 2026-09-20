import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Alien{
    private int ID;
    private String Name;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    @Override
    public String toString() {
        return "Alien [ID=" + ID + ", Name=" + Name + ", getID()=" + getID() + ", getName()=" + getName();
    }
    public Alien(int iD, String name) {
        ID = iD;
        Name = name;
    }
    public Alien() {
        super();
    }
    
}

public class Map01 {
    public static void main(String[] args) {

        Alien a = new Alien(1,"Alien");

        // HashMap<Object,String> hm = new HashMap<>();

        // // key must be unique value could be duplicate
        // // key, value can be "null"
        // // order of insertion is not maintained

        // hm.put(2, "Ram");
        // hm.put(3, "Ram");
        // hm.put(a,"dsf");
        // System.out.println(hm);


        // LinkedHashMap<Object,String> hm = new LinkedHashMap<>();
        // hm.put(2, "Ram");
        // hm.put(3, "Ram");
        // hm.put(4,"ewafr");
        // hm.put(a,"dsf");
        // System.out.println(hm); 
        
        // // LinkedHashMap is a child class of HashMap
        // // {key,value}==> Entry



        // Hashtable<Object,String> hm = new Hashtable<>();
        // // kay and value couldn't be null if so raises NullPointerException
        // hm.put(2, "Ram");
        // hm.put(3, "Ram");
        // hm.put(4,"ewafr");
        // hm.put(a,"dsf");
        // System.out.println(hm); 


        // TreeMap<Integer,String> hm = new TreeMap<>();
        // // kay and value couldn't be null if so raises NullPointerException
        // // kay couldn't be null if so raises NullPointerException value could be null
        // hm.put(2, "Ram");
        // hm.put(4, "Ram");
        // hm.put(3,"ewafr");
        // System.out.println(hm); 
        // // Returning Sorted order of krys
    }
}
