package javaBrocode;

import java.doWhile;
import java.util.Scanner;

class math {
    public static void main(String[] args) {
        // double x = 3.14;
        // double y = -10;

        // System.out.println(Math.max(x,y));
        // System.out.println(Math.abs(y));
        // System.out.println(Math.round(x));
        // System.out.println(Math.ceil(x));


        Scanner scan = new Scanner(System.in);

        double A;
        double B;

        System.out.println("Give two sides of traingle and ill return you the hypotenuse of it.");
        System.out.print("Enter side A of triangle: ");
        A = scan.nextDouble();
        System.out.print("Enter side B of the triangle: ");
        B = scan.nextDouble();
        double result = (A*A) + (B*B);
        System.out.println("ANS - " + Math.sqrt(result));

        scan.close();

    }
}