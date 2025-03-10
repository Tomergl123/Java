import java.util.Scanner;

public class multiFunctionCalc {
    public static void main(String[] args) {
        int input; //Input for menu selection
        boolean running = true;
        String goAgain = "no";

        Scanner scanner = new Scanner(System.in);

        //Menu

        while (running) {


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
                    double a, b, c;

                    System.out.println("------------Addition------------");

                    System.out.println("Enter your first number: ");
                    a = scanner.nextDouble();

                    System.out.println("Enter your second number: ");
                    b = scanner.nextDouble();

                    c = addition(a, b);

                    System.out.println("The final answer is: " + c);

                } else if (option == 2) {
                    double a, b, c;

                    System.out.println("------------Subtraction------------");

                    System.out.println("Enter your first number: ");
                    a = scanner.nextDouble();

                    System.out.println("Enter your second number: ");
                    b = scanner.nextDouble();

                    c = subtraction(a, b);

                    System.out.println("The final answer is: " + c);

                } else if (option == 3) {
                    double a, b, c;

                    System.out.println("------------Multiplication------------");

                    System.out.println("Enter your first number: ");
                    a = scanner.nextDouble();

                    System.out.println("Enter your second number: ");
                    b = scanner.nextDouble();

                    c = multiplication(a, b);

                    System.out.println("The final answer is: " + c);
                } else if (option == 4) {
                    double a, b, c;

                    System.out.println("------------Division------------");

                    System.out.println("Enter your first number: ");
                    a = scanner.nextDouble();

                    System.out.println("Enter your second number: ");
                    b = scanner.nextDouble();

                    c = division(a, b);
                    System.out.println("The final answer is: " + c);

                } else { //If something goes wrong.
                    System.out.println("Something went wrong. ReRun and try again");
                    System.exit(0);
                }

                //Area Calculator
            } else if (input == 2) {
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

                        area = squareArea(side); // Base, Exponent

                        System.out.println("The area of this square is: " + area);

                        break;
                    }
                    case 2: {//Rectangle
                        double width, length, area;

                        System.out.println("Enter the width: ");
                        width = scanner.nextDouble();

                        System.out.println("Enter the length: ");
                        length = scanner.nextDouble();

                        area = rectangleArea(width, length);

                        System.out.println("The area of this rectangle is: " + area);

                        break;
                    }
                    case 3: { //Circle
                        double radius, area;

                        System.out.println("Enter the radius: ");
                        radius = scanner.nextDouble();

                        area = circleArea(radius);

                        System.out.println("The area of this circle is: " + area);

                        break;
                    }
                    case 4: { //Triangle
                        double base, height, area;

                        System.out.println("Enter the base: ");
                        base = scanner.nextDouble();

                        System.out.println("Enter the height: ");
                        height = scanner.nextDouble();

                        area = triangleArea(base, height);

                        System.out.println("The area of this triangle is: " + area);

                        break;
                    }
                    default:
                        System.out.println("Something went wrong. ReRun and try again");
                }

                //SQRT Calculator
            } else if (input == 3) {
                double num, ans;

                System.out.println("Enter your number: ");
                num = scanner.nextDouble();

                ans = sqrt(num);

                System.out.println("The answer is: " + ans);


                //Random Number Generator
            } else if (input == 4) {
                int maxNum, num;

                System.out.println("Enter the highest possible number: ");
                maxNum = scanner.nextInt();

                num = randNum(maxNum);
                System.out.println("Your random number is: " + num);


                //Powers Calculator
            } else if (input == 5) {
                double num, power, ans;

                System.out.println("Enter your number: ");
                num = scanner.nextDouble();

                System.out.println("Enter the power: ");
                power = scanner.nextDouble();

                ans = powers(num, power);

                System.out.println("Your answer is: " + ans);


                //BMI Calculator
            } else if (input == 6) {
                double weight, height, bmi;

                System.out.println("(Please Enter in KGS/M) " +
                        "\nWhat is your weight");
                weight = scanner.nextDouble();

                System.out.println("(Please enter in METERS! ie. 1.65 instead of 165) " +
                        "\nPlease enter your height");
                height = scanner.nextDouble();

                bmi = bmi(weight, height);

                System.out.println("Your BMI is: " + bmi);


                //Tip Amount Calculator
            } else if (input == 7) {
                double cost, percent, tip, finalPrice;
                double[] total;

                System.out.println("How much is the cost of the order? ");
                cost = scanner.nextDouble();

                System.out.println("How much % tip will you be leaving? ");
                percent = scanner.nextDouble();

                total = tips(cost, percent);
                tip = total[1];
                finalPrice = total[0];

                System.out.println("In total, your final bill with a " + percent + "% tip will be: $" + finalPrice);

            } else {
                System.out.println("Something went wrong. ReRun and try again.");
                System.exit(0);
            }

            scanner.nextLine(); //Get rid off old stuff.


            System.out.println("Do you want to go again? (Yes/No): ");
            goAgain = scanner.nextLine();

            if (goAgain.equalsIgnoreCase("no")) {
                running = false;

                System.out.println("Goodbye!");

            } else if (goAgain.equalsIgnoreCase("yes")) {
                System.out.println();

            } else {
                System.out.println("Something went wrong. Try again.");
            }


        }
        scanner.close();
    }

    public static double addition(double num1, double num2) {
        double ans;

        ans = (double) Math.round((num1 + num2) * 100) / 100;

        return ans;
    }

    public static double subtraction(double num1, double num2) {
        double ans;

        ans = (double) Math.round((num1 - num2) * 100) / 100;

        return ans;
    }

    public static double multiplication(double num1, double num2) {
        double ans;

        ans = (double) Math.round((num1 * num2) * 100) / 100;

        return ans;
    }

    public static double division(double num1, double num2) {
        double ans;

        ans = (double) Math.round((num1 / num2) * 100) / 100;

        return ans;
    }

    public static double squareArea(double a) {
        double ans;

        ans = (double) Math.round(Math.pow(a, 2) * 100) / 100;

        return ans;
    }

    public static double rectangleArea(double a, double b) {
        double ans;

        ans = (double) Math.round((a * b) * 100) / 100;

        return ans;
    }

    public static double circleArea(double a) {
        double ans;

        ans = (double) Math.round((Math.PI * Math.pow(a, 2)) * 100) / 100;

        return ans;
    }

    public static double triangleArea(double a, double b) {
        double ans;

        ans = (double) Math.round((0.5 * a * b) * 100) / 100;

        return ans;
    }

    public static double sqrt(double a) {
        double ans;

        ans = (double) Math.round((Math.sqrt(a)) * 100) / 100;

        return ans;
    }

    public static int randNum(int a) {
        int ans;

        ans = (int) (Math.random() * (a + 1)); //0 - maxNum

        return ans;
    }

    public static double powers(double a, double b) {
        double ans;

        ans = (double) Math.round((Math.pow(a, b)) * 100) / 100;

        return ans;
    }

    public static double bmi(double a, double b) {
        double ans;

        ans = (double) Math.round((a / (b * b)) * 100) / 100;

        return ans;


    }

    public static double[] tips(double b, double c) { // a = tip, b = cost, c = %
        double a, ans;

        a = b * (c / 100);
        ans = (double) Math.round((b + a) * 100) / 100;

        return new double[]{ans, a};


    }
}
