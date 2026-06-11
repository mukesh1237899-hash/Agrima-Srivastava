import java.util.Scanner;
public class program3
{//opening class
    static boolean prime(int n) //FUNCTION TO CHECK PRIME
{
        if(n<=1)
            return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();
        if(prime(n))//calling function
        System.out.println("PRIME NUMBER");
        else
        System.out.println("NOT A PRIME NUMBER");
    sc.close();
}//closing main
}//closing class
