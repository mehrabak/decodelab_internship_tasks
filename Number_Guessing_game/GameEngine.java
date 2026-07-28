import java.util.*;
import java.util.Random;


public class GameEngine{

    private final int targetNum;
    private final int maxAttempt;
    private int attemptLeft;
    private final int maxNum;

    public GameEngine(int maxAttempt,int maxNum){

        Random rand = new Random();
        this.targetNum = rand.nextInt(100)+1;
        this.maxAttempt  = maxAttempt;
        this.maxNum = maxNum;         

    }

    public boolean isOutOfAttempts(){
        return attemptLeft <=0;

    }

    public int getAttemptLeft(){
        return attemptLeft;
    }


    public int getTargetNum(){
        return targetNum;

    }


    public String evaluateGuess(int guess){
        attemptLeft --;
        if (guess == targetNum){
            return "Correct 😎";

        }

        else if(guess > targetNum){
            return "Too High";
        }

        else if(guess < targetNum){
            return "Too low";
        }

        else{
            return "Enter a correcct number";
        }
    }
}