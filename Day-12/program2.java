import java.util.Scanner;
public class program2 
{//opening class
    static boolean arm(int a) //FUNCTION TO CHECK WHETHER ARMSTRONG OR NOT
    {
        int num,d=0,sum=0,r;//initialising variables
        num=a;
        while(num!=0)
        {
            num=num/10;
            d++;
        }
        num=a;
    while (num!=0)
    {//opening while loop
        r=num%10;
        sum =sum+(int)Math.pow(r, d);
        num = num / 10;
    }//closing while loop
    if (sum == a)//applying conditions for armstrong number
    return true;
    else
    return false;
}
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= sc.nextInt();
        System.out.println(arm(n));//calling function
        sc.close();
    }//closing main
}//closing class



    

