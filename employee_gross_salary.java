import java.util.Scanner;

public class employee_gross_salary {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice=-1;

    do
    {
        System.out.print("entre the basic salary of employee: ");
        double basic_salary= sc.nextDouble();
        double HRA,DA,gross_salary;
        if(basic_salary<15000)
        {
            HRA = 0.20*basic_salary;
            DA = 0.60*basic_salary;
        }
        else
        {
            HRA=3000;
            DA=0.70*basic_salary;
        }
        gross_salary=basic_salary+HRA+DA;

        System.out.println("gross salary of the employee is: "+gross_salary);
        System.out.println("entre -1 to continue or any other number to  exit: ");
        choice=sc.nextInt();
    }while(choice==-1);
    System.out.println("exit the program!!");
}
}