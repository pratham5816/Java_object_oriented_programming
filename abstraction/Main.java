package javaBrocode.abstraction;

public class Main {
    // abstract = abstract classes cannot be instantiated , but they can have a subclass abstract methods are decleared with an implementation.
    public static void main(String[] args) {
        

        Car mustang = new Car();
        // Vehicle bike = new Vehicle();

        mustang.go();
    }
}
