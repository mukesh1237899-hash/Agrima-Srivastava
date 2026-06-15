import java.util.Scanner;
public class zeroes
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
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]!=0) 
            {
                ar[index]=ar[i];
                index++;
            }
        }

        while(index<n)
        {
            ar[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeroes to end=");
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        sc.close();
    }//closing main
}//closing class
