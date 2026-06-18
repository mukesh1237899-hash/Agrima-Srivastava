import java.util.Scanner;
public class selection2
{//opening class
    public static void main(String[]args)
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elements=");
        for(int i = 0;i < n;i++) 
        {
            ar[i]=sc.nextInt();
        }
        for(int i = 0;i < n - 1;i++) 
        {
            int minIndex=i;
            for(int j = i + 1;j < n;j++) 
            {
                if(ar[j]<ar[minIndex]) 
                {
                    minIndex=j;
                }
            }
            int temp=ar[i];
            ar[i]=ar[minIndex];
            ar[minIndex]=temp;
        }
        System.out.println("Sorted Array=");
        for(int i = 0;i < n;i++)
        {
            System.out.print(ar[i] + " ");//printing sorted array
        }
        sc.close();
    }//closing main
}//closing class
