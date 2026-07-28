import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    private final Scanner input;

    public InputHandler() {
        this.input = new Scanner(System.in);
    }

    public int getValidGuess(int maxNum, int attemptLeft) {
        while (true) {
            System.out.print("Enter your guess (1-" + maxNum + ") [" + attemptLeft + " Attempts left]: "); // print not println

            try {
                int guess = input.nextInt();
                input.nextLine(); // clear buffer

                if (guess < 1 || guess > maxNum) {
                    System.out.println("⚠️ Out of bounds! Please guess between 1 - " + maxNum); // use maxNum not 100
                    continue;
                }
                return guess;
                
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input, enter an integer");
                input.nextLine(); // clear invalid input
            }
        }
    }

    public boolean askToPlay() {
        System.out.print("\nWould you like to play another round (Y/N): ");
        String choice = input.nextLine().trim(); // BUG FIX: you forgot to read input
        return choice.equalsIgnoreCase("Y");
    }
    
    public void close() {
        input.close();
    }
}
