import java.util.Scanner;
public class program2
{//opening class
    static int max(int a, int b) //FUNCTION TO find maximum
{
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int r=max(num1, num2);//calling function
        System.out.println("MAXIMUM = " + r);
        sc.close();
    }//closing main
}//opening class