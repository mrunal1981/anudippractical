import java.util.Scanner;

public class armstrong_no{
public static void main(String[]arg)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the starting range of amstrong number: ");
    int start =sc.nextInt();
    System.out.print("enter the ending range of amstrong number: ");
    int end =sc.nextInt();
    printArmstrongNumber(start,end);
}
        public static void printArmstrongNumber(int start,int end)
        {
        System.out.println("The Amstrong number from "+start+" to "+end +" are as follow :");
        for (int number = start; number<=end;number++) {
            int original_no=number;
            int sum=0;
            int temp=number;
            while (temp!=0)
            {
                int digit= temp%10;

                int cube=1;
                for(int i=0;i<3;i++)
                {
                    cube*=digit;
                }
                sum=sum+cube;
                temp=temp/10;
            }   
            if(sum==original_no)
            {
                System.out.println(original_no+" is an Armstrong number");
            }
        }
    }
}
