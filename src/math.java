import java.util.Scanner;

public class math {
    public static void main(String[] args) {
       /* double x = 3.14;
        double y = -10;

        double a = Math.max(x, y); // displays largest/smallest of the values.
        double b = Math.abs(y); // abs is absolute value so just no negative sign.
        double c = Math.sqrt(x); // prints sqrt of the value.
        double d = Math.round(x); // rounds the value to the nearest WHOLE number.
        double e = Math.ceil(x); // rounds up to nearest whole.
        double f = Math.floor(x); // rounds down. Opposite to Math.ceil.


        System.out.println("A= " + a);
        System.out.println("B= " + b);
        System.out.println("C= " + c);
        System.out.println("D= " + d);
        System.out.println("B= " + b);
        System.out.println("F= " + f);*/

        //Hyp calculator of a right angle triangle.
        double x;
        double y;
        double z; // Hyp

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the value of x?");
        x = scanner.nextDouble();
        System.out.println("What is the value of y?");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));


        System.out.println("The hypotenuse of this triangle is: " + z);

        scanner.close();



    }
}
