import java.util.InputMismatchException;
import java.util.Scanner;


public class InputHandler{
    private final Scanner input;

    public InputHandler(){
        this.input = new Scanner(System.in);
    }

    public int getValidGuess(int maxNum , int attemptLeft){

        while(true){

            System.out.println("Enter your guess ( 1-" + maxNum + " ) [ " + attemptLeft + "Attempts are left ] ");

            try {
                int guess = input.nextInt();
                input.nextLine();

                if(guess < 1 || guess > maxNum){
                    System.out.println("Out of bounds! please guess between 1 - 100");
                    continue;

                }
                return guess;
            }
            catch(InputMismatchException e){
                System.out.println(" Invalid input , enter an integer");
                input.nextLine();


            }
        }
    }

    public boolean askToPlay(){
        
        System.out.println("\nWould you like to play another round  (Y/N) :");
        return choice.equalsIgnoreCase("Y");
    }
    public void close(){
        input.close();
    }
}