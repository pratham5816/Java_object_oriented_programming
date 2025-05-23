package javaBrocode;

import java.util.Scanner;


public class whileloops {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String name ="";

        while(name.isBlank()){
            System.out.println("Enter name: ");
            name = scan.next();
        }

        System.out.println("Hello " + name);

        scan.close();
    }
}
