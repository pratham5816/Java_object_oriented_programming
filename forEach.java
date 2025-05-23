package javaBrocode;
import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {
        
        // String[] animals = {"cat" , "dog" ,"rat" , "bird"};
        
        // for(String i : animals){
        //     System.out.println(i);    

        // }
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("Cow");


        for(String i : animals){
            System.out.println(i);
        }
    }
}
