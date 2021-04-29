import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome to Guessing game you have unlimited guesses " +
                "and the number is 1-100 Good luck!");
        int guesses = 0;
        int number = (int) (Math.random() * 100 + 1); //this is the guess number 1-100
        Scanner UserInput = new Scanner(System.in);
        
        //While loop that runs the program
        while (true) {
            System.out.println("Please in put a number 1-100.");
            int numguess = UserInput.nextInt();
            guesses++;
            
            if (number > numguess) {
                System.out.println("Too Low");
            } else if (number < numguess) {
                System.out.println("Too High");
            }
            
            if (numguess == number) {
                System.out.println("Well done you guessed the right number that was " + number);
                System.out.println("You guessed this many times " + guesses);
                UserInput.nextLine();
                break;
            }
            /* if statement System.out.println("\n\nWould you like to play again? Press Enter to start again");*/
            /* continue; will be implementied for the retry of the program.
             if numguess is true to number then the user will get the win condition message and see amount of guesses
            */
        }
    }
}
    