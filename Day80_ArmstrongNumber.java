// using scanner class
import java.util.Scanner;

public class ArmNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int sum = 0;
        int digitCount = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digitCount);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}
