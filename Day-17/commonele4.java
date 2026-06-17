import java.util.Scanner;
public class commonele4 
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
        System.out.println("Common Elements=");
        for(int i = 0;i < n1;i++) 
        {//opening for loop
            for(int j = 0;j < n2;j++)
             {
                if(ar1[i]==ar2[j])
                {
                    System.out.print(ar1[i] + " ");//printing common elements
                    break;
                }
            }
        }//closing for loop
        sc.close();
    }//closing main
}//closing class
