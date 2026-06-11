import java.util.Scanner;
public class program1
{//opening class
    static int sum(int a, int b) //FUNCTION TO CALCULATE SUM
{
        return a + b;
    }
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int r= sum(num1, num2);//calling function
        System.out.println("Sum = " + r);
        sc.close();
    }//closing main
}//opening class
