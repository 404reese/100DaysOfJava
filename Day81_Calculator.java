import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0; 
        float result = 0;
        int choice;

        do {
            // Display menu
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter two numbers:");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            }

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Answer: " + num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Answer: " + num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Answer: " + num1 + " * " + num2 + " = " + result);
                    break;

                case 4:
                    result = num1 / num2;
                    System.out.println("Answer: " + num1 + " / " + num2 + " = " + result);
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        } while (choice != 5);

        sc.close();
    }
}
