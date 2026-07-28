public class Main {
    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler(); // camelCase
        int totalRounds = 0;
        int roundsWon = 0; 

        final int MAX_NUM = 100;
        final int MAX_ATTEMPT = 7;

        System.out.println("\nWELCOME TO THE DECODELABS NUMBER GUESSING GAME \n");

        boolean keepPlaying = true;

        while (keepPlaying) {
            totalRounds++;
            GameEngine game = new GameEngine(MAX_ATTEMPT, MAX_NUM);
            boolean won = false;

            System.out.println("\n---- Round " + totalRounds + " ----");

            while (!game.isOutOfAttempts()) { // was isOutOfAttempt
                int guess = inputHandler.getValidGuess(MAX_NUM, game.getAttemptsLeft()); 
                String result = game.evaluateGuess(guess);

                switch (result) {
                    case "CORRECT" -> { // must match GameEngine return
                        System.out.println("You guessed it in " + (MAX_ATTEMPT - game.getAttemptsLeft()) + " attempts!");
                        won = true;
                        roundsWon++;
                    }
                    case "TOO_HIGH" -> System.out.println("📉 Too High");
                    case "TOO_LOW" -> System.out.println("📈 Too Low");
                }
                if (won) break;
            }

            if (!won) {
                System.out.println("Game over!! , The secret number was : " + game.getTargetNumber()); 
            }

            keepPlaying = inputHandler.askToPlayAgain();
        }

        System.out.println("\nFinal Score  : Total Rounds = " + totalRounds + " | Won = " + roundsWon); 
        inputHandler.close();
    }
}
