public class Rectangle{
    int length;
    int width;
    Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    int calculate_area()
    {
        return length*width;
    }
    public static void main(String[] args) {
        Rectangle r1 =new Rectangle(10,20);
        Rectangle r2 =new Rectangle(10,30);

        int area_of_rectangel1=r1.calculate_area();
        int area_of_rectangel2=r2.calculate_area();
        if (area_of_rectangel1>area_of_rectangel2) {
            System.out.println("Rectangle1 > Rectangle2");
        }
        else if(area_of_rectangel1<area_of_rectangel2)
        {
             System.out.println("Rectangle1 < Rectangle2");
        }
        else
        {
            System.out.println("They are equal");
        }
    }
}