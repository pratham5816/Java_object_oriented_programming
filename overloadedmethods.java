package javaBrocode;

public class overloadedmethods {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters 
        //                        method name + paranmeters = method signature
    
        System.out.println(add(3,3));
        System.out.println(add(3,3,3));
        System.out.println(add(3,3,3,3));
        System.out.println(add(3.5,3.5));

    }



    static int add(int a, int b)
    {
        System.out.println("overloaded method 1");
        return a+b;

    }

    static int add(int a , int b , int c)
    {
        System.out.println("overloaded method 2");
        return a+b+c;
    }


    static int add(int a, int b , int c , int d)
    {
        System.out.println("overloaded method 3");
        return a+b+c+d;   
    }

    
    static double add(double a, double b)
    {
        System.out.println("overloaded method 4");
        return a+b;

    }

    static double add(double a , double b , double c)
    {
        System.out.println("overloaded method 5");
        return a+b+c;
    }


    static double add(double a, double b , double c , double d)
    {
        System.out.println("overloaded method 6");
        return a+b+c+d;   
    }
}
