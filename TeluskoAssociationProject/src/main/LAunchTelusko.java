package main;

import services.DevOpsCourse;
import services.SpringCourse;

public class LAunchTelusko {
    public static void main(String[] args) {
         Telusko t= new Telusko(new SpringCourse());
         t.setCourse(new DevOpsCourse());   
         Boolean status = t.PurchasetheCourse(5234.7);
        if(status) System.out.println("Puchased Course Succesfully");
        else System.out.println("Failed to Purchase Course");
    }
}
