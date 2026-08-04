import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public int getPositiveInt(String prompt) {
        int value = 0;
        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                if (value <= 0) {
                    System.out.println("  Please enter a number greater than 0.");
                    continue;
                }
                return value;
            } catch (InputMismatchException e) {
                System.out.println(" Invalid input! Please enter a whole integer.");
                scanner.nextLine(); // Clear invalid token
            }
        }
    }

    public double getValidMark(int subjectNumber) {
        double mark = 0.0;
        while (true) {
            System.out.print("Enter marks for Subject " + subjectNumber + " (0 - 100): ");
            try {
                mark = scanner.nextDouble();
                scanner.nextLine(); // Clear buffer
                if (mark < 0 || mark > 100) {
                    System.out.println("  Out of range! Marks must be between 0 and 100.");
                    continue;
                }
                return mark;
            } catch (InputMismatchException e) {
                System.out.println(" Invalid input! Please enter a valid numerical value.");
                scanner.nextLine(); // Clear invalid token
            }
        }
    }

    public void close() {
        scanner.close();
    }
}
