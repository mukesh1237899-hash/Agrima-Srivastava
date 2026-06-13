import java.util.Scanner;
public class program2
 {//opening class
    public static void main(String[] args)
     {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();//initialising variables;
        int ar[]=new int[n];
        int sum=0;
        double avg;
        System.out.println("Enter array elements=");
        for(int i=0;i<n;i++) 
        {//opening for loop
         ar[i]=sc.nextInt();
         sum=sum+ar[i];
        }//closing for loop
        avg = (double)sum/n;
        System.out.println("Sum of array elements="+sum);
        System.out.println("Average of array elements="+avg);
        sc.close();
    }//closing main
}//closing class
