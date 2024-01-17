import java.util.Scanner;
class E02 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.println("Give a number:");
        double firstNumber = scanner.nextDouble();

        // Ask the user for the second number
        System.out.println("Give another number:");
        double secondNumber = scanner.nextDouble();

        // Perform calculations
        double sum = firstNumber + secondNumber;
        double product = firstNumber * secondNumber;
        double difference = firstNumber - secondNumber;
        double quotient = firstNumber / secondNumber;

        // Print results
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);

        // Close the scanner
        scanner.close();
    }
}
