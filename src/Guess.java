import java.util.InputMismatchException;
import java. util.Scanner;
import java. lang.Math;

public class Guess{
    public static void main(String[] args) {
         
        Scanner scanner= new Scanner(System.in);
        
        int number = (int) (Math.random() * 100) + 1;
        System.out.println(number);

         System.out.println("Welcome guess a number between 1 and 100");
        

            String answer;
            int count=0;
            boolean runGame= true;

            do  {
                 try {
                    
                  
                int guessedNumber= scanner.nextInt();

                if(guessedNumber==number){
                    System.out.println("Hurray you guessed the right number");
                    System.out.println("Do you want o play again? Yes or No");
                    answer = scanner.nextLine();
                    
                }
                else if(guessedNumber<number){
                    System.out.println("sorry  the number lower ");
                    count--;
                }
                else if (guessedNumber>number){
                    System.out.println("the number is higher ");
                    count--;
                }
                
               
            }
                catch (InputMismatchException e) {
                   System.out.println("You can only write number not alphabets,Try again.");
                   scanner.next();

                 }
             
                 
            } while(runGame);

            }

            }

            
        
             
        

          

        
    

   

