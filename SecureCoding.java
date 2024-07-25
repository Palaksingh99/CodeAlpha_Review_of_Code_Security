import java.io.FileWriter;
import java.io.IOException;

public class SecureCoding {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Validate user input (e.g., use a secure method to verify credentials)
            String input = args[0];
            if (isValidUser(input)) {
                grantAccess();
            } else {
                denyAccess();
            }
        } else {
            System.out.println("Please provide a command-line argument.");
        }

        // Use descriptive variable names
        int number = 5;
        int result = multiplyByTwo(number);
        System.out.println("Result: " + result);

        // Avoid code duplication
        int num1 = 5;
        int num2 = 10;
        int sum = calculateSum(num1, num2);
        int product = calculateProduct(num1, num2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Close resources in a finally block or using a try-with-resources statement
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hey Palak!");
            System.out.println("Written in a file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Check for null before calling methods on an object
        String str = "Hello";
        if (str != null) {
            int length = str.length();
            System.out.println("String length: " + length);
        } else {
            System.out.println("String is null");
        }
    }

    private static boolean isValidUser(String input) {
        // Replace this with actual authentication logic
        return "admin".equals(input);
    }

    private static void grantAccess() {
        System.out.println("Access granted!");
    }

    private static void denyAccess() {
        System.out.println("Access denied!");
    }

    private static int multiplyByTwo(int number) {
        return number * 2;
    }

    private static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    private static int calculateProduct(int num1, int num2) {
        return num1 * num2;
    }
}