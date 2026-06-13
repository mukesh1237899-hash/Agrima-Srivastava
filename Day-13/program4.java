import java.util.Scanner;
public class program4 
{//opening class
    public static void main(String[]args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();//initialising variables
        int ar[]=new int[n];
        int e=0,o=0;
        System.out.println("Enter array elements=");
        for(int i=0;i<n;i++) 
        {//OPENING FOR LOOP
            ar[i]=sc.nextInt();
        }//CLOSING FOR LOOP
        for(int i=0;i<n;i++) 
        {//opening for loop
            if(ar[i]%2==0) 
                e++;
            else
                o++;
        }//closing for loop
        System.out.println("Number of Even elements= "+e);
        System.out.println("Number of Odd elements= "+o);
        sc.close();
    }//closing main
}//closing class