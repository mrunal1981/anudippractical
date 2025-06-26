public class car {
    String make;
    String model;
    short year;
    int price;
    public car(String make,String model,short year,int price)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    public void display()
    {
        System.out.println("make: "+make+"\n"+"model:"+model+"\n"+"year:"+year+"\n"+"price:"+price);
    }
    public static void main(String[] args) {
        car c1 =new car("ford","deluxe",(short)1948,200000);
        c1.display();
        
        car c2 =new car("BMW","alpina xB",(short)2022,30000000);
        c2.display();
    }
}
