package javaBrocode;

import java.util.Scanner;

public class dolop {
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);

        String name ="";
        do{
            System.out.println("Enter name: ");
            name = scan.next();
        }while(name.isBlank());

        System.out.println("Hello " + name);

        scan.close();
    }
    }
}
