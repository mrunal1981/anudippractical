class vehical {
   final void run()
   {
    System.out.println(" running");
   }
}
class car extends vehical{
    // Cannot override the final run() method from vehical
}

public class finalmethod {
    public static void main(String[] args) {
        car c =new car();
        c.run(); 
    }
}
