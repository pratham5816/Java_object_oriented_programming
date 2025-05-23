package javaBrocode.Inheritancee;

public class Main {
    public static void main(String[] args) {
        
        Car mustang = new Car();
        Bicycle Bike = new Bicycle();
        Bike.stop();
        mustang.go();
        System.out.println(Bike.speed);
        System.out.println(mustang.speed);
        System.out.println(Bike.paddels);
        System.out.println(mustang.doors);
        System.out.println(mustang.wheels);
    }
}
