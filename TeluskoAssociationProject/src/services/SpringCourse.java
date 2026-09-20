package services;

public class SpringCourse implements ICourse {

    @Override
    public Boolean PurchaseCourse(Double amount) {
        System.out.println("Purchased Spring Course "+amount);
        return true;
    }
    
}
