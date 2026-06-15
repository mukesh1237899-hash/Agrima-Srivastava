import java.util.Scanner;
public class rotateleft
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
        int first=ar[0];
        for(int i=0;i<n-1;i++)
        {
            ar[i]=ar[i+1];
        }
        ar[n-1]=first;
        System.out.println("Array after left rotation=");
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }
        sc.close();
    }//closing main
}//closing class