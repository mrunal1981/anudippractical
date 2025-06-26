abstract class  animal{
    // abstract method ;
    abstract void sound();

    // non-abstract method
    void eat()
    {
        System.out.println("ainaml eats");
    }
}

class dog extends animal{
    @overide
void sound(){
    System.out.println("dog is barking");
}
}
public class abstract_class {
    public static void main(String[] args) {
        dog mydog = new dog();
        mydog.sound();
        mydog.eat();   
    }
}
