import java.util.Scanner;
class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the multiplication table
        System.out.println("Which multiplication table to show?");
        int multiplier = scanner.nextInt();

        // Print the multiplication table up to 10
        System.out.println("Multiplication table for " + multiplier + ":");
        for (int i = 0; i <= 10; i++) {
            int result = i * multiplier;
            System.out.println(i + " x " + multiplier + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
