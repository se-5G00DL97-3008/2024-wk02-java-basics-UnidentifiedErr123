import java.util.Scanner;
class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;

        // Continuous loop until the teacher enters -1
        while (true) {
            // Ask the teacher to enter a test score
            System.out.println("Give a test score (-1 to quit):");
            int score = scanner.nextInt();

            // Check if the teacher entered -1 to exit the loop
            if (score == -1) {
                System.out.println("Exiting the program.");
                break;
            }

            // Add the test score to the total and increment the count
            total += score;
            count++;

            // Calculate and print the current average
            double average = (double) total / count;
            System.out.println("Average: " + average);
        }

        // Close the scanner
        scanner.close();
    }
}
