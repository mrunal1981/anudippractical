class constructors1 {
    String  name;
    int age;
    constructors1()
    {
        this.name="0";
        this.age=0;
    }
    constructors1(String x,int y)
    {
        this.name=x;
        this.age=y ;
    }
    public constructors1(constructors1 obj)
    {
        this.name=obj.name;
        this.age=obj.age;
    }
    void display()
    {
        System.out.println(name+" "+age);
    }
}

public class Innerconstructors1 {
public static void main(String[] args) {
    constructors1 c1 =new constructors1("mrunal",23224);
    constructors1 c2=new constructors1(c1);
    c1.display();
    c2.display();
}
}
