import java.util.Scanner;
public class merge1 
{//opening class
    public static void main(String[]args)
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array=");
        int n1=sc.nextInt();//initialization of variables
        int ar1[]=new int[n1];
        System.out.println("Enter elements of first array=");
        for(int i = 0;i < n1;i++) 
        {
            ar1[i]=sc.nextInt();//input elements of 1 array
        }
        System.out.print("Enter size of second array=");
        int n2=sc.nextInt();
        int ar2[]=new int[n2];
        System.out.println("Enter elements of second array=");
        for(int i = 0;i < n2;i++) 
        {
            ar2[i]=sc.nextInt();//input elements of 2 array
        }
        int merge[]=new int[n1 + n2];
        //merging 1 and 2 array
        for(int i = 0;i < n1;i++) 
        {
            merge[i]=ar1[i];
        }
        for(int i = 0;i < n2;i++)
        {
            merge[n1 + i]=ar2[i];
        }
        System.out.println("Merged Array=");
        for(int i = 0;i < merge.length;i++) 
        {
            System.out.print(merge[i]+" ");
        }
        sc.close();
    }//closing main
}//closing class