class Vehicle {
    void start()
    {
        System.out.println("Vehicle started");
    }
}

class Car  extends Vehicle{
   @Override
   void start()
   {
    System.out.println("Car started.");
   } 
}
class Motorcycle extends Vehicle
{
   @Override
   void start()
   {
    System.out.println("Motorcycle started.");
   }
}

class Garage
{
    void serviceVehicle(Vehicle vehicle)
    {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}

public class vehicle_1
{
    public static void main(String[] args) {
        Car c1=new Car();
        Motorcycle m1=new Motorcycle();
        Garage g1=new Garage();
        System.out.println("servicing car:");
        g1.serviceVehicle(c1);
        System.out.println("\nservicing motercycle:");
        g1.serviceVehicle(m1);
    }
}

