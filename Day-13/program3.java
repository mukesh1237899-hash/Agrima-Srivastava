import java.util.Scanner;
public class program3
{//opening class
    public static void main(String[] args)
     {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();//initialising variables
        int ar[]=new int[n];
        System.out.println("Enter array elements=");
        for(int i=0;i<n;i++)
        {//opening for loop
            ar[i]=sc.nextInt();
        }//closing for loop
        int lar=ar[0];
        int sma=ar[0];
        for(int i=1;i<n;i++) 
        {//opening for loop
            if(ar[i]>lar) 
            {
                lar=ar[i];
            }
            if(ar[i]<sma)
            {
                sma=ar[i];
            }
        }//closing for loop
        System.out.println("Largest element of array="+lar);
        System.out.println("Smallest element of array ="+sma);
        sc.close();
    }//closing main
}//closing class