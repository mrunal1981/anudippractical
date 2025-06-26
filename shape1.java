class shape{
public void area()
{
    System.out.println("display area");
}
}
class triangle extends shape{
    public void calculate_area(double l,double b)
    {
        double result =0.5*(l*b);
        System.out.println(result);
    }
}

public class shape1{
    public static void main(String[] args) {
        triangle t1=new triangle();
        t1.area();
        t1.calculate_area(2, 6);
    }    
}