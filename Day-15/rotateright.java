import java.util.Scanner;
public class rotateright
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
        int last= ar[n-1];
        for(int i=n-1;i>0;i--) 
        {
            ar[i]=ar[i-1];
        }
        ar[0]=last;
        System.out.println("Array after right rotation=");
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        sc.close();
    }//closing main
}//closing class