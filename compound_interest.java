import java.util.Scanner;
public class compound_interest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("enter the principle value: ");
            int principle = sc.nextInt();
            
            System.out.print("enter the rate :");
            int rate =sc.nextInt();
            
            System.out.print("enter the time: ");
            int time =sc.nextInt();

            int amount = principle*((1+rate/100)^time);
            System.out.println("the amount is "+amount);
            
            int compound_interest = amount-principle;
            System.out.println("the compound interest is "+compound_interest);
        }
    }
}
