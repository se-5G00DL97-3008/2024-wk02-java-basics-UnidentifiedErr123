import java.util.Scanner;
class E04 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a day
        System.out.println("Enter a day:");
        int day = scanner.nextInt();

        // Ask the user to enter a month
        System.out.println("Enter a month:");
        int month = scanner.nextInt();

        // Check if it's Christmas
        if (day == 24 && month == 12) {
            System.out.println("Merry Christmas!");
        } else {
            System.out.println("No special wish for today.");
        }

        // Close the scanner
        scanner.close();
    }
}
