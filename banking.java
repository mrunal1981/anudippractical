abstract class payment{
   abstract void processes_payment(double amount);
}
class credit_card extends payment
{
    @overide
    void processes_payment(double amount)
    {
     System.out.println("the amount using credit card: "+amount);  
    }
}
class UPI extends payment{
    @overide
    void processes_payment(double amount)
    {
        System.out.println("the amount using UPI: "+amount);
    }
}
public class banking {
public static void main(String[] args) {
    payment p1 =new credit_card();
    payment p2 =new UPI();
    p1.processes_payment(1000);
    p2.processes_payment(2000);
}
}