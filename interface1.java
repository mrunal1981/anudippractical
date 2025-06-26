interface Animal{
    public void walk();    
}
class horse implements Animal{
    @Override
    public void walk()
    {
        System.out.println("hore is walking");
    }
}
public class interface1{
    public static void main(String[] args) {
    horse myHorse =new horse();
    myHorse.walk();
    }

}
