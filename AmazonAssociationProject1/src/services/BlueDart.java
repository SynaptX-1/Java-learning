// these are called  Dependent Object (Injecting) because they are being used as a services of Amazon(Target Class)

package services;

public class BlueDart implements IDeliveryService{
    @Override
    public Boolean deliveryProduct(Double amount){
        System.out.println("Product delivered thriugh BlueDart , amount paid is :"+amount);
        return true;
    }
}
