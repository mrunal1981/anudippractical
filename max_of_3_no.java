import java.util.Scanner;
public class max_of_3_no{
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter the value of a :");
        int a=sc.nextInt();
        System.out.print("enter the value of b :");
        int b=sc.nextInt();
        System.out.print("enter the value of c :");
        int c=sc.nextInt();
        
        if (a<b && b>c){
            System.out.println("b is maximum");
        }
        else if(b<a && a>c)
        {
            System.out.println("a is maximum than");
        }
        else
        {
            System.out.println("c is maximum");
        }
    }
}
}
