import java.util.Scanner;
public class program4
{//opening class
    static int fact(int n) //FUNCTION TO FIND FACTORIAL
{
    int p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*i;
        }
        return p;
    }
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();//initialising
        System.out.println("FACTORIAL OF INPUT NUMBER="+fact(n));//calling function
    sc.close();
}//closing main
}//closing class

