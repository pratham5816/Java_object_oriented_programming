package javaBrocode;



public class methods {
    public static void main(String[] args) 
    {
        // method = a block of code  that is executed whenever is called upon
        
        // String byera = "Ratham";

        // System.out.println("welcome");
        // hello("ora" , 33);
        // bye("niraa");

        System.out.println(add(44,55 ));
    }


    static void hello(String Hname , int Age)
    {
            // Scanner scan  = new Scanner(System.in);
            // String name = scan.next();
            System.out.println("hello " + Hname + " U are "+ Age +" years old!");
            // scan.close();
    }

    static void bye(String byera)
    {
        System.out.println("Bye " + byera);
    }


    static int add(int x , int y)
    {
        return x + y;
    }
  
}
