class student {
String name;
int age;
public void printinfo(String name)
{
    System.out.println("name :"+name);
}
public void printinfo(int age)
{
    System.out.println("age :"+age);
}
}
public class polymorphism {
    public static void main(String[] args) {
        student s1=new student();
        s1.printinfo(12);
        s1.printinfo("mrunal");

    }
}
