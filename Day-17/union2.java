import java.util.Scanner;
public class union2
{//opening class
    public static void main(String[]args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array=");
        int n1=sc.nextInt();
        int ar1[]=new int[n1];
        System.out.println("Enter elements of first array=");
        for(int i = 0;i < n1;i++) 
        {
            ar1[i]=sc.nextInt();
        }
        System.out.print("Enter size of second array=");
        int n2=sc.nextInt();
        int ar2[]=new int[n2];
        System.out.println("Enter elements of second array=");
        for(int i = 0;i < n2;i++) 
        {
            ar2[i]=sc.nextInt();
        }
        System.out.println("Union of Arrays=");
        // Print first array
        for(int i = 0;i < n1;i++) 
        {
            System.out.print(ar1[i] + " ");
        }
        // Print only those elements of second array
        // that are not present in first array
        for(int i = 0;i < n2;i++) 
        {//opening for loop
            boolean found=false;
            for(int j = 0;j < n1;j++) 
            {
                if(ar2[i]==ar1[j]) 
                {
                    found=true;
                    break;
                }
            }
            if(!found) 
            {
                System.out.print(ar2[i] + " ");
            }
        }//closing for loop
        sc.close();
    }//closing main
}//closing class
    