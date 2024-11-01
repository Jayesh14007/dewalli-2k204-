import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = new String[6];
        int[] marks = new int[6];
        int totalMarks = 0;

        // Input subject names and marks
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjects[i] = scanner.nextLine();
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            totalMarks += marks[i];
        }
        // Calculate percentage
        double percentage = (double) totalMarks / 6;

        // Display total and percentage
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        scanner.close();
    }
}
