package javaBrocode.Superkeyword;

public class Main {
    // super = keyword refers to the superclass (parent) of the an object very similar to the "this" keyword.

    public static void main(String[] args) {
        
        Hero me = new Hero("Batman",42,"$$$");
        Hero me2 = new Hero("Superman",43, "Everything");
        System.out.println(me2);
    }
}
