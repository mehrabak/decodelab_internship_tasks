import java.util.Random;

public class GameEngine {

    private final int targetNum;
    private final int maxAttempt;
    private int attemptLeft;
    private final int maxNum;

    public GameEngine(int maxAttempt, int maxNum) {
        Random rand = new Random();
        this.targetNum = rand.nextInt(maxNum) + 1; // use maxNum, not 100
        this.maxAttempt = maxAttempt;
        this.maxNum = maxNum;      
        this.attemptLeft = maxAttempt; // BUG FIX 1: initialize attempts
    }

    public boolean isOutOfAttempts() {
        return attemptLeft <= 0;
    }

    public int getAttemptsLeft() { // BUG FIX 2: match Main.java naming
        return attemptLeft;
    }

    public int getTargetNum() {
        return targetNum;
    }

    public int getMaxNum() { // added this for InputHandler
        return maxNum;
    }

    public String evaluateGuess(int guess) {
        attemptLeft--; // only decrease on valid guess
        if (guess == targetNum) {
            return "CORRECT"; // BUG FIX 3: ALL CAPS to match switch in Main
        } else if (guess > targetNum) {
            return "TOO_HIGH";
        } else {
            return "TOO_LOW";
        }
    }
}
