import java.util.Scanner;
class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the multiplicand
        System.out.println("Which multiplicand multiplication table to show?");
        int multiplicand = scanner.nextInt();

        // Ask the user until which multiplier
        System.out.println("Until which multiplier?");
        int untilMultiplier = scanner.nextInt();

        // Print the custom multiplication table
        System.out.println("Multiplication table for " + multiplicand + " until " + untilMultiplier + ":");
        for (int i = 1; i <= untilMultiplier; i++) {
            int result = i * multiplicand;
            System.out.println(i + " x " + multiplicand + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
