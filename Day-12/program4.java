import java.util.Scanner;
public class program4 
{//opening class
    static boolean perf(int n) //FUNCTION FOR PERFECT NUMBER
    {
        int sum = 0;
        for (int i = 1; i < n; i++) 
        {
            if (n % i == 0) 
            {
                sum=sum+i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args) 
     {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number=");
        int n = sc.nextInt();
        if (perf(n))//calling function
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
        sc.close();
    }//closing main
}//closing class
