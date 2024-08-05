// using BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArmNum {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            String inputLine = reader.readLine();
            int number = Integer.parseInt(inputLine);

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
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing reader: " + e.getMessage());
                }
            }
        }
    }
}
