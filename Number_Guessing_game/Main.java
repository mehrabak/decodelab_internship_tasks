public class Main{
    public static void main(String[] args){

        InputHandler inputhandler = new InputHandler();
        int totalRounds = 0 ;
        int roundswon = 0;

        final int MAX_NUM = 100;
        final int MAX_ATTEMPT = 7;

        System.out.println("\nWELCOME TO THE DECODELABS NUMBER GUESSING GAME \n");

        boolean keepPlaying = true ;

        while(keepPlaying){
            totalRounds++;
            GameEngine game = new GameEngine(Max_ATTEMPT,MAX_NUM);
            boolean won = false;

            System.out.println("\n---- Round " + totalRounds + " ----");

            while(!game.isOutOfAttempt()){
                int guess = inputhandler.getValidGuess(MAx_NUM,game.getAttemptLeft());
                String result = game.evaluateGuess(guess);

                switch(result){
                    case "Correct" -> {
                        System.out.println("you guessed it in " + (MAx_ATTEMPT - game.getAttemptLeft()) + attempts);
                        won = true ;
                        roundsWon++;

                    }

                    case "Too_High" -> System.out.println("TOo high");
                    case "Too_Low" -> System.out.println("TOo Low");


                }
                if(won) break;




            }

            if(!won){
                System.out.println("Game over!! , The secret number was : " + game.getTargetNum());
            }

            keepPlaying = inputhandler.askToPlayAgain();


            }

            System.out.println("Final Score  : " + totalRounds + " won : " + roundWon);
            inputhandler.close();

        }


    }


