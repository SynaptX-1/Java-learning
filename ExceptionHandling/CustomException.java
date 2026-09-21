import java.util.*;
class UnderAgeException extends Exception
{
    public UnderAgeException(String msg){
        super(msg);
    }
}
class OverAgeException extends Exception
{
    public OverAgeException(String msg){
        super(msg);
    }
}
class LicenseApplicant
{
    int age;
    Scanner sc = new Scanner(System.in);
    public void input()
        {
            System.out.println("Kindly enter your age ");
            age = sc.nextInt();
        }
    public void verify() throws UnderAgeException, OverAgeException
    {
        if(age>=18 && age<=60)
            System.out.println("procedd with License");
        else if(age<18){
             UnderAgeException uae = new UnderAgeException("Hey kiddo! Have patience your time will come");
             System.out.println(uae.getMessage());// this mehtod is coming from Throwable class which is parent of the Exception
             throw uae;
        }
        else {
            OverAgeException oae = new OverAgeException("Your time is coming ! Go and Rest ");
            System.out.println(oae.getMessage());
            throw oae;
        }
    }    
}
class RTO
{
    public void initiate()
    {
        LicenseApplicant lapp = new LicenseApplicant();
        try
        {
            lapp.input();
            lapp.verify();
        }
        catch(UnderAgeException | OverAgeException e)
        {
            System.out.println("Try Again !!");
            try
        {
            lapp.input();
            lapp.verify();
        }
            catch(UnderAgeException | OverAgeException e1)
        {
            System.out.println("Try Again !!");
        
        }
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        RTO in = new RTO();
        in.initiate();
    }
}
