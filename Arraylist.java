package javaBrocode;
import java.util.ArrayList;


public class Arraylist {
    public static void main(String[] args) {
        
        // ArrayList = a resizable array.
        //          elements can be addef and removed after the compilation phase store reference data types..


        ArrayList<String> food = new ArrayList<String>();


        food.add("Mango");
        food.add("hamburger");
        food.add("Hotdog");

        food.set(0 ,"Pizza");
        // food.remove(2);
        // food.clear();

        for(int i=0; i< food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
