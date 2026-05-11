import java.util.Scanner;
import java.util.Random;
public class guessgame
{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = rand.nextInt(1,101);
        int numberOfTries = 0;
        int guess = 0;
        boolean win = false;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");
        while (win == false) {
            System.out.print("Enter your guess : ");
                guess = scanner.nextInt();
                numberOfTries++;
                if (guess == numberToGuess) {
                    win = true;
                } else if (guess < numberToGuess) {
                    System.out.println("Your guess is too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Your guess is too high!");
                }
        }
        System.out.println("Congratulations! You found the number " + numberToGuess + " in " + numberOfTries + " tries.");
        scanner.close();
    }
}
