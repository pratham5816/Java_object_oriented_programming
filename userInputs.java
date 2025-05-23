package javaBrocode;

import java.util.Scanner;

public class userInputs {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Food: ");
        String food = scan.nextLine();
        System.out.println("Food: " + food);
        System.out.println("Hello " + name);
        System.out.println("Age: " + age);

        scan.close();
    }
    }
}
