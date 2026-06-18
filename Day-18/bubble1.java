import java.util.Scanner;
public class bubble1
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
            for(int j = 0;j < n - i - 1;j++) 
            {
                if(ar[j]>ar[j + 1]) 
                {
                    int temp=ar[j];
                    ar[j]=ar[j + 1];
                    ar[j + 1]=temp;
                }
            }
        }//CLOSING FOR LOOP
        System.out.println("Sorted Array=");
        for(int i = 0;i < n;i++)
        {
            System.out.print(ar[i] + " ");//PRINTING SORTED ARRAY
        }
        sc.close();
    }//closing main
}//closing class
