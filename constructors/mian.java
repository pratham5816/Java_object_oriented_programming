package javaBrocode.constructors;

public class mian{
    public static void main(String[] args) {
        Human ratham = new Human("Prath" , 65 , 70);

        System.out.println(ratham.age);
        ratham.eat();
        ratham.drink();

        Human lob = new Human("Lob" , 22, 33);

        System.out.println(lob.age);
        lob.eat();
        lob.drink();
    }
}
