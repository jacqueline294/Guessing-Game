import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    private static final String Yes = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "Yes";

        while (answer.equals("Yes")) {
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            System.out.println(number);
            System.out.println("Welcome! Guess a number between 1 and 100");

            try {
                int guessedNumber = scanner.nextInt();

                while (guessedNumber != number) {
                    if (guessedNumber < 1 || guessedNumber > 100) {
                        System.out.println("Your guess is out of the valid range (1-100). Try again.");
                    } else if (guessedNumber < number) {
                        System.out.println("Your guess is lower.");
                    } else {
                        System.out.println("Your guess is higher.");
                    }
                    guessedNumber = scanner.nextInt();
                }

                System.out.println("Hurray, you guessed the right number!");
                
            } catch (InputMismatchException e) {
                System.out.println("You can only write numbers, not alphabets. Try again.");
                scanner.next(); 
            }
            System.out.println("Do you want to play again? Yes or No");
                answer = scanner.next();
                  if(answer== Yes){
                    System.out.println("cool");
                    
                   }else{
                    
                    }
        }

    
    }
}

                       
    

            
         




            

            
        
             
        

          

        
    

   

