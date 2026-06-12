import java.util.Scanner;
public class program3
{//opening class
    static void fibo(int n)//FUNCTION FOR FIBONACCI SERIES
     {
        int a=0,b=1,c;//initialising variables
        System.out.print("Fibonacci Series=");
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(a + " ");
            c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args)
     {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        fibo(n); // Function call
        sc.close();
    }//closing main
}//closing class