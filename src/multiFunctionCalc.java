import java.util.Scanner;

public class multiFunctionCalc {
    public static void main (String[] args){
        /* TODO
        Area Calculator
        Basic Calculator
        Random Number Generator
        Square Root Finder
        Power Calculator
        BMI Calculator - weight / (height * height)
        Tip Calculator
        */

        int input; //Input for menu selection

        Scanner scanner = new Scanner(System.in);

        //Menu

        System.out.println("Hello! Welcome to the Menu Page! Please choose from the following. (1-7): " +
                "\n1. Calculator" +
                "\n2. Area Calculator" +
                "\n3. Square Root Calculator" +
                "\n4. Random Number Generator" +
                "\n5. Powers Calculator" +
                "\n6. BMI Calculator" +
                "\n7. Tip Amount Calculator");
        input = scanner.nextInt();

        //Calculator

        if (input == 1) {
            int option;
            System.out.println("Welcome to the Calculator!" +
                    "\nPlease select which operation you want to complete. (1-4)" +
                    "\n1. Addition" +
                    "\n2. Subtraction" +
                    "\n3. Multiplication" +
                    "\n4. Division");
            option = scanner.nextInt();
            if (option == 1) {
                double a, b, c; //A is first, B is second, C is final answer.
                System.out.println("------------Addition------------");
                System.out.println("Enter your first number: ");
                a = scanner.nextDouble();
                System.out.println("Enter your second number: ");
                b = scanner.nextDouble();

                c = a + b;
                System.out.println("The final answer is: " + c);
            } else if (option == 2) {
                double a, b, c; //A is first, B is second, C is final answer.
                System.out.println("------------Subtraction------------");
                System.out.println("Enter your first number: ");
                a = scanner.nextDouble();
                System.out.println("Enter your second number: ");
                b = scanner.nextDouble();

                c = a - b;
                System.out.println("The final answer is: " + c);
            } else if (option == 3) {
                double a, b, c; //A is first, B is second, C is final answer.
                System.out.println("------------Multiplication------------");
                System.out.println("Enter your first number: ");
                a = scanner.nextDouble();
                System.out.println("Enter your second number: ");
                b = scanner.nextDouble();

                c = a * b;
                System.out.println("The final answer is: " + c);
            } else if (option == 4) {
                double a, b, c; //A is first, B is second, C is final answer.
                System.out.println("------------Division------------");
                System.out.println("Enter your first number: ");
                a = scanner.nextDouble();
                System.out.println("Enter your second number: ");
                b = scanner.nextDouble();

                c = (double) Math.round((a / b) * 100) / 100; // Cast to double because Math. returns a long
                System.out.println("The final answer is: " + c);
            } else {
                System.out.println("Something went wrong. ReRun and try again");
            }

       //Area Calculator
        }  else if (input == 2) {
            int option;
            System.out.println("Welcome to the Area Calculator!" +
                    "\nPlease select which shape you want to find the area of. (1-4)" +
                    "\n1. Square" +
                    "\n2. Rectangle" +
                    "\n3. Circle" +
                    "\n4. Triangle");
            option = scanner.nextInt();

            switch (option) {
                case 1: { //Square
                    double side, area;

                    System.out.println("Enter the length of the side: ");

                    side = scanner.nextDouble();

                    area = Math.pow(side, 2); // Base, Exponent

                    System.out.println("The area of this square is: " + area);

                    break;
                } case 2: {//Rectangle
                    double width, height, area;

                    System.out.println("Enter the width: ");
                    width = scanner.nextDouble();

                    System.out.println("Enter the height: ");
                    height = scanner.nextDouble();

                    area = width*height;

                    System.out.println("The area of this rectangle is: " + area);

                    break;
                } case 3: { //Circle
                    double radius, area;

                    System.out.println("Enter the radius: ");
                    radius = scanner.nextDouble();

                    area = (double) Math.round((Math.PI * Math.pow(radius, 2)) * 100) /100;

                    System.out.println("The area of this circle is: " + area);

                    break;
                } case 4: { //Triangle
                    double base, height, area;

                    System.out.println("Enter the base: ");
                    base = scanner.nextDouble();

                    System.out.println("Enter the height: ");
                    height = scanner.nextDouble();

                    area = (double) Math.round((0.5 * base * height) * 100) / 100;

                    System.out.println("The area of this triangle is: " + area);

                    break;
                } default:
                    System.out.println("Something went wrong. ReRun and try again");
            }
        }


}}
