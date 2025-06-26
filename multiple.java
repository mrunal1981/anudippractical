interface shape{
    void area();
}
interface color{
void displaycolor();
}    
class triangle implements shape ,color{
    public void area(){
        System.out.println("area of triangle ");
    }
    public void displaycolor(){
        System.out.println("color of triangle");
    }
}
public class multiple{
    public static void main(String[] args) {
        triangle t = new triangle();
        t.area();
        t.displaycolor();
    }
}
