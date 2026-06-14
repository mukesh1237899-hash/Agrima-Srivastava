import java.util.Scanner;
public class seclar3  
{//opening class
    public static void main(String[]args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();//initialising variables
        int ar[]=new int[n];
        System.out.println("Enter array elements=");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int larg = Integer.MIN_VALUE;
        int secl= Integer.MIN_VALUE;
        for(int i=0;i<n;i++) 
        {
            if(ar[i]>larg) 
            {
                secl=larg;
                larg=ar[i];
            }
            else if(ar[i]>secl && ar[i]!=larg)
            {
                secl=ar[i];
            }
        }
        System.out.println("Second Largest Element = "+secl);
        sc.close();
    }//closing main
}//closing class
