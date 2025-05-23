package javaBrocode;


public class printf {
    public static void main(String[] args) {
        

        boolean myBoolean = true;
        char mychar = '@';
        String myString = "ratham";
        int myInt = 33;
        double myD = 33.33;

        // System.out.printf("This is a format string %d" , 123);
        // System.out.printf("\n%c" , mychar);
        // System.out.printf("\n%s" , myString);
        // System.out.printf("\n%d" , myInt);
        // System.out.printf("\n%b" , myBoolean);
        // System.out.printf("\n%f" , myD);



        // System.out.printf("Hello %10s" , myString);
        
        System.out.printf("You have this much money %.2f" , myD);
    }
}
