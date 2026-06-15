import java.util.Scanner;
public class reversearray
{//opening class
    public static void main(String[]args)
     {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();//initialization of variables
        int ar[]=new int[n];
        System.out.println("Enter array elements=");
        for(int i=0;i<n;i++) 
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Reversed Array=");
        for(int i=n-1;i>=0;i--) 
        {
            System.out.print(ar[i]+" ");
        }
        sc.close();
    }//closing main
}//closing class