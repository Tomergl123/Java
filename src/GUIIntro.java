import javax.swing.JOptionPane; // Imports JoptionPane class

public class GUIIntro {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?")); //Because showMessageDialog is String, this changes it to a int.
        JOptionPane.showMessageDialog(null, "Oh, that's cool! \nYou are " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null, "WOW!\n You are " + height + " cm tall");
    }
}
