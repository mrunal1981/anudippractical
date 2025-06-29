import java.util.Scanner;

public class odd_even_no {
    public static void main(String[] args) 
    {
       int evencounter=0;
       int oddcounter=0;
       Scanner sc = new Scanner(System.in); 
       while (true) 
       {
          System.out.print("enter the number: ");
          int n= sc.nextInt(); 
          if(n==-1)
          {
           break;
          }
          if(n%2==0)
          {
              evencounter++;
          }
          else 
          {
              oddcounter++;
          }
        } 
         System.out.println("the total number of even numbers are: "+evencounter);
         System.out.println("the total number of odd numbers are: "+oddcounter);
    }
}
