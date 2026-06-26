import java.util.Scanner;
public class VotingEligibility2
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:=");
        int age = sc.nextInt();
        //ELIGIBILITY RESULTS AS PER YOUR AGE
        if (age >= 18) 
        {
            System.out.println("YES...YOU CAN VOTE");
        } 
        else 
        {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }//closing main
}//closing class
    

