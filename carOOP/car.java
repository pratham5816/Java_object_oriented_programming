package javaBrocode.carOOP;

public class car {
    

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "Blue";
    double price = 50000.00;

    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year + "\n" + price;
    }

    void drive()
    {
        System.out.println("You drive the car!");
    }

    void brake()
    {
        System.out.println("You applied brakes!");
    }
}
