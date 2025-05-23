package javaBrocode;

import javax.swing.JOptionPane;



public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your name: ");
        JOptionPane.showMessageDialog(null,"Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age: "));
        JOptionPane.showMessageDialog(null, "You are " +age+ " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter hieght: "));
        JOptionPane.showMessageDialog(null, "Hieght is "+ height + " cms");
    }
}
