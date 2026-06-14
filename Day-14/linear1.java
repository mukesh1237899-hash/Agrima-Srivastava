import java.util.Scanner;
public class linear1 
{//opening cass
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elements=");
        for(int i=0;i<n;i++)
        {//opening for loop
            ar[i]=sc.nextInt();
        }//closing for loop
        System.out.print("Enter element to search=");
        int se=sc.nextInt();
        int pos=-1;
        for(int i = 0; i < n; i++)
        {
            if(ar[i]==se) 
            {
                pos = i;
                break;
            }
        }
        if(pos!=-1)
            System.out.println("Element found at index"+pos);
        else
            System.out.println("Element not found");
        sc.close();
    }//closing main
}//closing class