import java.util.Scanner;
public class vowels_cosonants {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the charector to check: ");
            char ch = sc.next().toLowerCase().charAt(0); 
            if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        System.out.println(" given char is vowels");
                    } else {
                        System.out.println("given char is consonant");;
                    }
                }
        }
    }
}
