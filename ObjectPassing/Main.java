package javaBrocode.ObjectPassing;

public class Main {
    
    public static void main(String[] args) {
        

        Garage ptGarage = new Garage();
        Garage akGarage = new Garage();

        Car ptCar = new Car("BMW");
        Car akCar = new Car("SCROSS");

        
        ptGarage.park(ptCar);
        akGarage.park(akCar);
        
    }
}
