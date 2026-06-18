import java.util.Scanner;
public class binary3
{//opening class
    public static void main(String[]args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter sorted array elements=");
        for(int i = 0;i < n;i++) 
        {
            ar[i]=sc.nextInt();
        }
        System.out.print("Enter element to search=");
        int key=sc.nextInt();
        int low=0;
        int high=n - 1;
        int found=-1;
        while(low <= high) 
        {//opening while loop
            int mid=(low + high) / 2;
            if(ar[mid]==key) 
            {
                found=mid;
                break;
            }
            else if(ar[mid]<key) 
            {
                low=mid + 1;
            }
            else 
            {
                high=mid - 1;
            }
        }//closing while loop
        if(found != -1)
            System.out.println("Element found at index " + found);
        else
            System.out.println("Element not found");
        sc.close();
    }//closing main
}//closing class
