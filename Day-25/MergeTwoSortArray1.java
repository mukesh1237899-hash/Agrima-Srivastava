import java.util.Scanner;
public class MergeTwoSortArray1 
{//opening class
    public static void main(String[] args)
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of two sorted arrays");
        int n = sc.nextInt();//initialising variables
        int d = sc.nextInt();
        System.out.println("ENTER TWO SORTED ARRAYS");
        int ar1 [] = new int[n];
        int ar2 [] = new int[d];
        System.out.println("ENTER ELEMENTS OF 1 ARRAYS");
        for(int i=0; i < n ; i++)
        {
            ar1[i]=sc.nextInt();
        }
        System.out.println("ENTER ELEMENTS OF 2 ARRAY");
        for(int j=0; j < d ; j++)
        {
            ar2[j]=sc.nextInt();
        }
        System.out.println("MERGED ARRAY");
        int i=0,j=0;
        while(i<n && j<d)
        {//opening while loop
            if(ar1[i] < ar2[j])
            {//opening if loop
               System.out.println(ar1[i]);
                i++;
            }//closing if loop
            else
            {//opening else loop
                System.out.println(ar2[j]);
                j++;
            }//closing else loop
        }//closing while loop
        while(i < n)
        {
            System.out.println(ar1[i] + " ");
            i++;
        }
        while(j < d) 
        {
            System.out.println(ar2[j] + " ");
            j++;
        }
        sc.close();
    }//closing main
}//closing class
