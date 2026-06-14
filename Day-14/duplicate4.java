import java.util.Scanner;
public class duplicate4
{//opening class
    public static void main(String[]args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter array elements=");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Duplicate elements are=");
        for(int i=0;i<n;i++) 
        {//OPENING FOR LOOP
            for(int j=i+1;j<n;j++)
            {//opening for loop
                if(ar[i]==ar[j]) 
                {
                    System.out.println(ar[i]);
                    break;
                }
            }//closing for loop
        }//CLOSING FOR LOOP
        sc.close();
    }//closing main
}//closing class