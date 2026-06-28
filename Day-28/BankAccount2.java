import java.util.ArrayList;
import java.util.Scanner;
class BankAccount
{
    int accountNo;
    String name;
    double balance;
    // Constructor
    BankAccount(int accountNo, String name, double balance) 
    {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
}
public class BankAccount2
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> list = new ArrayList<>();
        int ch;
        do 
        {//opening do while loop
            System.out.println("BANK ACCOUNT SYSTEM:=");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice:=");
            ch = sc.nextInt();
            switch (ch) 
            {//opening switch
                case 1:
                    System.out.print("Enter Account Number:=");
                    int accNo = sc.nextInt();
                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Account Holder Name:=");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance:=");
                    double balance = sc.nextDouble();
                    list.add(new BankAccount(accNo, name, balance));
                    System.out.println("Account Created Successfully.");
                    break;
                case 2:
                    System.out.print("Enter Account Number:=");
                    accNo = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < list.size(); i++) 
                    {
                        if (list.get(i).accountNo == accNo) 
                        {
                            System.out.print("Enter Deposit Amount:=");
                            double amount = sc.nextDouble();
                            list.get(i).balance = list.get(i).balance + amount;
                            System.out.println("Money Deposited Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Account Not Found.");
                    break;
                case 3:
                    System.out.print("Enter Account Number:=");
                    accNo = sc.nextInt();
                    found = false;
                    for (int i = 0; i < list.size(); i++) 
                    {
                        if (list.get(i).accountNo == accNo) 
                        {
                            System.out.print("Enter Withdrawal Amount:=");
                            double amount = sc.nextDouble();
                            if (amount <= list.get(i).balance) 
                            {
                                list.get(i).balance -= amount;
                                System.out.println("Withdrawal Successful.");
                            } 
                            else 
                            {
                                System.out.println("Insufficient Balance.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Account Not Found.");
                    break;
                case 4:
                    System.out.print("Enter Account Number:=");
                    accNo = sc.nextInt();
                    found = false;
                    for (int i = 0; i < list.size(); i++) 
                    {
                        if (list.get(i).accountNo == accNo) 
                        {
                            System.out.println("Account Number : " + list.get(i).accountNo);
                            System.out.println("Name           : " + list.get(i).name);
                            System.out.println("Balance        : " + list.get(i).balance);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Account Not Found.");
                    break;
                case 5:
                    if (list.isEmpty()) 
                    {
                        System.out.println("No Accounts Available.");
                    } 
                    else 
                    {
                        for (int i = 0; i < list.size(); i++) 
                        {
                            System.out.println("Account Number : " + list.get(i).accountNo);
                            System.out.println("Name           : " + list.get(i).name);
                            System.out.println("Balance        : " + list.get(i).balance);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }//closing switch case
        }//closing do while loop
        while (ch != 6);
        sc.close();
    }//opening main
}//opening class