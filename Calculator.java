public class Calculator {
public int add(int a,int b){
    return a+b;
}
public int add(int a,int b,int c)
{
    return a+b+c;
}
public double add(double a,double b)
{
    return a+b;
}
public void display()
{
    System.out.println("additon of two intergers: "+add(10, 20));
    System.out.println("additon of three intergers: "+add(10, 20, 50));
    System.out.println("additon of two doubles: "+add(20.20, 10.80));
}
public static void main(String[] args) {
    Calculator c = new Calculator();
    c.display();
}
}