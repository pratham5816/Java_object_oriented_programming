package javaBrocode.AccesModifiers.Package1;
import javaBrocode.AccesModifiers.Package2.*;

public class B {
    private String privatemsg = "This is private msg";

    public static void main(String[] args) {
        B b1 = new B();

        System.out.println(b1.privatemsg);
    }
}
