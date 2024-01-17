import java.util.Scanner;
class E03 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a number:");
        double number = scanner.nextDouble();

        // Evaluate and print the result
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("The number is zero");
        }

        // Close the scanner
        scanner.close();
    }
}
