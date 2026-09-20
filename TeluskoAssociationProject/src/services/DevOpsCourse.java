package services;

public class DevOpsCourse implements ICourse{

    @Override
    public Boolean PurchaseCourse(Double amount) {
        System.out.println("Purchased DevOps Course "+amount);
        return true;
    }
    
}
