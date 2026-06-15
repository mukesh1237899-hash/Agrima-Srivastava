import java.util.Scanner;
public class missing1
 {//opening class
    public static void main(String[]args)
     {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n - 1];
        System.out.println("Enter elements=");
        for (int i=0;i<n - 1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int totalSum=n * (n + 1) / 2;
        int arraySum=0;
        for (int i=0;i < n - 1;i++) 
        {
            arraySum=arraySum+arr[i];
        }
        int missing = totalSum - arraySum;//finding missing number
        System.out.println("Missing Number = " + missing);
        sc.close();
    }//closing main
}//closing class