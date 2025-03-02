import javax.sound.midi.SysexMessage;
//NUMBER SWITCHER
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 40;
        int y = 20;
        int z = 0;  // Placeholder to help with switching

        System.out.println("X: " + x + "\nY: " + y + "\nZ: " + z + "\n ------------------------------------------------");
        z=x;
        x=y;
        y=z;
        z= 0;

        System.out.println("X " + x);
        System.out.println("Y " + y);
        System.out.println("Z " + z);


    }
}