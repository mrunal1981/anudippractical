import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter the principle value: ");
        int principle = sc.nextInt();
        
        System.out.print("enter the rate of interest :");
        int rate =sc.nextInt();

        System.out.print("enter the time: ");
        int time =sc.nextInt();

        int simple_interest=((principle*rate*time)/100);
        System.out.println("the simple interest is "+simple_interest);
       }
    }
}
