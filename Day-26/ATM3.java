import java.util.Scanner;
public class ATM3 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int c;
        do 
        {//opening do while loop
            System.out.println("ATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:=");
            c = sc.nextInt();
            switch (c) 
            {//opening switch case
                case 1:
                    System.out.println("Balance:=" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit:=");
                    int deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Deposit Successful.");
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw:=");
                    int withdraw = sc.nextInt();
                    if (withdraw <= balance) 
                    {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal Successful.");
                    } 
                    else 
                    {
                        System.out.println("Insufficient Balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }//closing switch case
        }//closing do while loop
        while (c != 4);
        sc.close();
    }//closing main
}//closing class
