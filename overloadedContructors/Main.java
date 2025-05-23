package javaBrocode.overloadedContructors;



public class Main{
    public static void main(String[] args) {
        
            Pizza margerita = new Pizza("Thic curst", "tomato", "mozzerella", "chicken");
            Pizza chicken = new Pizza("ashkas", "adhauida" , "adhjauidha");

            System.out.println("Here are the ingredients of your pizza: ");
            System.out.println(margerita.bread);
            System.out.println(margerita.sauce);
            System.out.println(margerita.cheese);
            System.out.println(margerita.topping);
    }
}