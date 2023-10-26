import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "Yes";

        while (answer.equalsIgnoreCase("Yes")) {
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            System.out.println(number);
            System.out.println("Welcome! Guess a number between 1 and 100");

            try {
                int guessedNumber;

                while (true) {
                    guessedNumber = scanner.nextInt();

                    if (guessedNumber == number) {
                        System.out.println("Hurray, you guessed the right number!");
                        System.out.println("Do you want to play again? Yes or No");
                        answer = scanner.next();
                        if (answer.equalsIgnoreCase("Yes")) {
                            System.out.println("Cool");
                            number = random.nextInt(100) + 1; 
                        } else {
                            System.out.println("Thank you for playing");
                            break; 
                        }
                    } else if (guessedNumber < number) {
                        System.out.println("Your guess is lower.");
                    } else {
                        System.out.println("Your guess is higher.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("You can only enter numbers. Try again.");
                scanner.next(); 
            }
        }
    }
}


















   

