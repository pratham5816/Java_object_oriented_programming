package javaBrocode;
import java.util.Scanner;


public class nestedloops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows;
        int coloums;
        String symbol ="";

        System.out.println("Enter number of rows: ");
        rows = scan.nextInt();
        
        System.out.println("Enter number of columns: ");
        coloums = scan.nextInt();

        
        System.out.println("Enter symbol: ");
        symbol = scan.next();

        for(int i = 1; i<=rows;i++){
            System.out.println();
            for(int y =1; y<=coloums; y++){
                System.out.print(symbol);
            }
        }


        scan.close();
    }
    }
}
