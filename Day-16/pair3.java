import java.util.Scanner;
public class pair3
{//opening class
    public static void main(String[]args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();//initialization of variables
        int arr[]=new int[n];
        System.out.println("Enter array elements=");
        for (int i = 0;i < n;i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter required sum=");
        int sum = sc.nextInt();
        boolean found = false;
        for (int i = 0;i < n - 1;i++) 
        {
            for (int j = i + 1;j < n;j++)
            {
                if (arr[i] + arr[j] == sum) 
                {
                    System.out.println("Pair found=" + arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }
        if (!found)
        {
            System.out.println("No pair found.");
        }
        sc.close();
    }//closing main
}//closing class
    
