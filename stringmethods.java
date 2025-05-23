package javaBrocode;

public class stringmethods {
    public static void main(String[] args) {
        String name = "Pratham";

    
        System.out.println(name.length());
        System.out.println(name.equalsIgnoreCase("Pratham"));
        char result = name.charAt(3);
        int index = name.indexOf("m");
        boolean isemptyy = name.isEmpty();
        System.out.println(name.toUpperCase());
        System.out.println(result);
        System.out.println(index);
        System.out.println(isemptyy);
        System.out.println(name.trim());
        String rname = name.replace("a" , "g");
        System.out.println(rname); 

    }
}
