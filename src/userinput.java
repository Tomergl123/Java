import java.util.Scanner; //Imports the scanner tool from the java utilities library.

 class userinput {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("What is your name?");
            String name = scanner.nextLine();
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("What is your favorite food");
            String food = scanner.nextLine();


            System.out.println("Hello "
                    + name + "! Nice to meet you. From what I've gathered, you're "
                    + age + " years old and your favorite food is "
                    + food);
        }
    }
