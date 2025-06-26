class animal {
void show()
{
    System.out.println(" animal is walking");
}
}
class dog extends animal{
    void eat()
    {
        System.out.println("dog is eating");
    }
}

public class Inneranimal {
public static void main(String[] args) {
    dog d1=new dog();
    d1.show();
    d1.eat();
}
}