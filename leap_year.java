import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the year which has to check:");
            int year =sc.nextInt();

            if((year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0))
            {
                System.out.println(year+" is a leap.");
            }
            else
            {
                System.out.println(year+" is not a leap.");
            }
        }
    }
}
