import java.util.Scanner;
public class sortingarray4
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
        {//OPENING FOR LOOP
            for(int j = i + 1;j < n;j++)
            {
                if(ar[i]<ar[j]) 
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }//CLOSING FOR LOOP
        System.out.println("Array in Descending Order=");
        for(int i = 0;i < n;i++) 
        {
            System.out.print(ar[i] + " ");
        }
        sc.close();
    }//closing main
}//closing class
