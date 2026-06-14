import java.util.Scanner;
public class frequency2
{//opening class
    public static void main(String[]args)
     {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n = sc.nextInt();//initialising variables
        int ar[]=new int[n];
        System.out.println("Enter array elements=");
        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }
        System.out.print("Enter element to find frequency=");
        int se=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]==se)
                c++;
        }
        System.out.println("Frequency of element = "+c);
        sc.close();
    }//closing main
}//closing class

