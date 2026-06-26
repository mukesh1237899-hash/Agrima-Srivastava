import java.util.Random;//Random Class
import java.util.Scanner;
public class NumberGuessingGame1 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //Random number is between 1 and 100
        int number = rand.nextInt(100) + 1;
        int guess;
        System.out.println("Guess number between 1 and 100");
        //here do while is used as we have to guess first and is easier with it
        do
        {//opwning do while loop
            System.out.print("Enter your guess");
            guess = sc.nextInt();
            //Printing results according to guessed number
            if (guess > number) 
            {
                System.out.println("Guessed number is too high");
            } else if (guess < number) 
            {
                System.out.println("Guessed number is too low");
            } else 
            {
                System.out.println("YES... You guessed the correct number.");
            }
        } //closing do while loop
        while (guess != number);
        sc.close();
    }//closing main 
}//closing class