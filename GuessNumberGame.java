import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    //First You have to give privet class of your function and give some value
    private static final int Max_Number = 100;

    //Now you have to make a main public class

    public static void main(String[] args) {

        //Now you have to import Random for genrate random number

        Random random = new Random();

        int randomNumber = random.nextInt(Max_Number) +1;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and " + Max_Number + ". Can you guess it?");

        Scanner scan = new Scanner(System.in);
        boolean hasGuessCorrect = false;

        System.out.println("Entre Your Guess Number: ");
        int guess = scan.nextInt();
        attempts++;

        if (guess <randomNumber) {
            System.out.println("Too low! Try a higher number.");
            
        } else if (guess>randomNumber) {
            System.out.println("Too high! Try a lower number.");

        }else {
            System.out.println("Congratulations! You've guessed the correct number in" + attempts + "attempts");
            hasGuessCorrect = true;
        }
    }

}
