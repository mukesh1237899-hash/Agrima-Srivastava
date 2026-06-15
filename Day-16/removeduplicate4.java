import java.util.Scanner;
public class removeduplicate4
{//opening class
    public static void main(String[]args)
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array= ");
        int n=sc.nextInt();//initialising variables
        int ar[]=new int[n];
        System.out.println("Enter array elements=");
        for (int i = 0;i < n;i++) 
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Array after removing duplicates=");
        for (int i = 0;i < n;i++) 
        {
            boolean duplicate = false;
            for (int j = 0;j < i;j++) 
            {
                if (ar[i]==ar[j]) 
                {
                    duplicate=true;
                    break;
                }
            }

            if (!duplicate)
            {
                System.out.print(ar[i] + " ");
            }
        }
        sc.close();
    }//closing main
}//closing class