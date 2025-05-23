package javaBrocode.overloadedContructors;

public class Pizza {

    String bread;
    String cheese;
    String topping;
    String sauce;


    Pizza(String bread , String sauce , String cheese , String topping)
    {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

        
    }

    Pizza(String bread , String sauce , String cheese /* , String topping */)
    {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        // this.topping = topping;

        
    }


    
    Pizza(String bread , String sauce /* , String cheese , String topping */)
    {
        this.bread = bread;
        this.sauce = sauce;
        // this.cheese = cheese;
        // this.topping = topping;

        
    }


     
    Pizza(String bread  /*, String sauce , String cheese , String topping */)
    {
        this.bread = bread;
        // this.sauce = sauce;
        // this.cheese = cheese;
        // this.topping = topping;

        
    }

    Pizza(  /*String bread, String sauce , String cheese , String topping */)
    {
        // this.bread = bread;
        // this.sauce = sauce;
        // this.cheese = cheese;
        // this.topping = topping;

        
    }

}
