import java.util.Scanner;
public class MenuDrivenCalculator1 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        int ch;//initialising variables
        double num1, num2, result;
        do 
        {//opening do while loop
            System.out.println(" MENU DRIVEN CALCULATOR :=");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice:=");//input choice
            ch = sc.nextInt();
            switch (ch) 
            {//opening switch case
                case 1:
                    System.out.print("Enter First Number:=");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number:=");
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    System.out.println("Addition = " + result);
                    break;
                case 2:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    System.out.println("Subtraction = " + result);
                    break;
                case 3:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    System.out.println("Multiplication = " + result);
                    break;
                case 4:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    if (num2 != 0) 
                    {
                        result = num1 / num2;
                        System.out.println("Division = " + result);
                    } 
                    else 
                    {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.print("Enter First Number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    int b = sc.nextInt();
                    System.out.println("Modulus = " + (a % b));
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }//closing switch case
        } //closing do while loop
        while (ch != 6);
        sc.close();
    }//closing main
}//closing class