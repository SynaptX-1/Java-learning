package services;

public class FirstFlight implements IDeliveryService{
    @Override
    public Boolean deliveryProduct(Double amount){
        System.out.println("Product delivered thriugh FirstFlight amount paid is : "+amount);
        return true;
    }
}

