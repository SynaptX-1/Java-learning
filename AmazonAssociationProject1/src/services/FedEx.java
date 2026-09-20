package services;

public class FedEx implements IDeliveryService {
    public Boolean deliveryProduct(Double amount){
        System.out.println("Product is delivered thriugh fedEx amount paid is : "+amount);
        return true;
    }
}
