import java.util.Scanner;
public class array_2D {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the size for matrix");
        int size=sc.nextInt();
        
        int [][]matrix=new int [size][size];
          for(int row=0;row<size;row++){
            for(int col=0;col<size;col++)
            {   System.out.println("element at ["+row+"]["+col+"]");
                matrix[row][col]=sc.nextInt();
             }
            }

          for(int row=0;row<size;row++){
            for(int col=0;col<size;col++)
            {   
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
  }
 }
