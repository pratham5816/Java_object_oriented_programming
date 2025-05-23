package javaBrocode.carOOP;

class OOP{

     // object = an instance of a class that may contain attributes and methods
    // example : (phone , desk , comp , coffeew cup)

    public static void main(String[] args) {
        
        car myCar = new car();
        car scross = new car();

        scross.make = "2033";

        // scross.drive();
        // myCar.brake();
        // myCar.drive();
        // scross.drive();
        // scross.brake();
        // System.out.println(myCar.model);;
        // System.out.println(scross.model);;
        // System.out.println(scross.make);


        // TO string method
        System.out.println(myCar.toString());
        System.out.println(myCar);

        
    };





}