import java.util.Scanner;

public class binary_no_addition {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a:");
    int a= sc.nextInt();
    System.out.println("enter b:");
    int b = sc.nextInt();
    sc.close();
    int sum=a+b;
    System.out.println("the sum is : "+Integer.toBinaryString(sum));
} 
}
