package javaBrocode;

public class arrays {
    public static void main(String[] args) {
        String[] cars = {"Mustang","Scross","tesla","BMW"};


        System.out.println(cars[1]);

        String[] bikes = new String[3];
        
        bikes[0] = "honda";
        bikes[1] = "BMW";
        bikes[2] = "RE";
        // bikes[3] = "bajaj";

        for(int i=0; i < bikes.length; i++)
        {
            System.out.println(bikes[i]);
        }
    }
}
