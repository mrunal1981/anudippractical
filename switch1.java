import java.util.Scanner;
public class switch1{
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("take numb for checking case_no:");
        int numb=sc.nextInt();
        System.out.println("case "+numb+":");
        switch (numb) {
            case 1:
            System.out.println("Good morning");
                break;
            case 2:
            System.out.println("Good night");
            break;
            default:
            System.out.println("invalid data");
                break;
        }
    }
  }
}