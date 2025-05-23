package javaBrocode;

public class twodarrays {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

       cars[0][0]= "BMW";   
       cars[0][1]= "suzuki";        
       cars[0][2]= "mahindra";  
       
       

    cars[1][0]= "ranger";
    cars[1][1]= "tata";       
    cars[1][2]= "jeep";  
    
    
    cars[2][0]= "ford";  
    cars[2][1]= "bajaj";
    cars[2][2]= "skoda";   



       
    for(int i =0; i< cars.length; i++){
        System.out.println();
        for(int j=0; j < cars[i].length; j++){
            System.out.println(cars[i][j] + " ");
        }
    }
    }
    
}

