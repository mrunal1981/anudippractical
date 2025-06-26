class animal{
    void sound()
    {
        System.out.println("animal is singing");
    }
}
class dog extends animal{
    @Override
    void sound()
    {
        System.out.println("dog is barking");
    }
}
public class animal1 {
    public static void main(String[] args){
    dog myDog=new dog();
    myDog.sound();
}
}