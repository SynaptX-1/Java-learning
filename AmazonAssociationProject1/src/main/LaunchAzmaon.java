package main;

import services.*;

public class LaunchAzmaon {
    public static void main(String[] args) {

//. Constructor Injection : Injecting the dependent Object to the Target Class 
        Amazon amz = new Amazon(new FirstFlight());
        // if dependent object is not htere then we can't create the object of the target class

// (Bean): Creation of the object by Spring (Amazon bean)

        // FedEx fedex = new FedEx();
        // amz.setService(fedex);
// Setter Injection : Injecting the dependent Object to the Target Class
        amz.setService(new FedEx()); 
        // putting adress of object fedex directly
        amz.setService(new BlueDart());

// Setter injection  object will be given priority over  the constructor injection

        Boolean status = amz.deliverTheProduct(43534.9);
        if(status)
            System.out.println("Product Delivery Successful");
        else
            System.out.println("Failed To Deliver Product");
    }
}
