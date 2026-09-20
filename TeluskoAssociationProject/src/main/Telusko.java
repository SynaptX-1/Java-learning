package main;

import services.ICourse;

public class Telusko {
    private ICourse course;
    public Telusko(ICourse course) {
    }

    public Telusko() {
        super();
    } // for the setter injection

    public void setCourse(ICourse course) {
        this.course = course;
    }
    
    Boolean PurchasetheCourse(Double amount){
        return course.PurchaseCourse(amount);
    }
}
