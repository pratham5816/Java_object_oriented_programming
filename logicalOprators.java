package javaBrocode;

import java.util.Scanner;

class logicalOprators{
    public static void main(String[] args) {
        int temp =11;

        if(temp>30){
            System.out.println("It is hot outside!");

        }else if(temp > 20 && temp < 30){
            System.out.println("It is warm outside!");
        }else{
            System.out.println("It is cold outside!");
        }


        Scanner scan = new Scanner(System.in);


        System.out.println("Press q or Q: ");
        String response = scan.next();

        if(response.equals("Q") || response.equals("q")){
            System.out.println("You quit the game!");
        }else{
            System.out.println("Still in the game!");
        }

        scan.close();
    }
}