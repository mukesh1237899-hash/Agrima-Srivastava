import java.util.Scanner;
public class maxfrequency2
{//opening class
    public static void main(String[]args)
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array= ");
        int n=sc.nextInt();//initialising variables
        int arr[]=new int[n];
        System.out.println("Enter elements=");
        for (int i = 0;i < n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        int maxFreq=0;
        int element=arr[0];
        for (int i = 0;i < n;i++) 
        {
            int c=1;
            for (int j=i + 1;j < n;j++)
            {
                if (arr[i] == arr[j])
                {
                    c++;
                }
            }

            if (c>maxFreq) 
            {
                maxFreq=c;
                element=arr[i];
            }
        }
        System.out.println("Element with maximum frequency = " + element);
        System.out.println("Frequency = " + maxFreq);
        sc.close();
    }//closing main
}//closing class
