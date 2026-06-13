import java.util.Scanner;
public class program1
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();//initialising variables
        int ar[] = new int[n];
        System.out.println("Enter array elements=");
        for(int i=0;i<n;i++)
             {//opening for loop
            ar[i] = sc.nextInt();
             }//closing for loop
        System.out.println("Array elements are=");
        for(int i=0;i<n;i++) 
            {//opening for loop
            System.out.println(ar[i]+" ");
            }//closing for loop
        sc.close();
    }//closing main
}//closing class