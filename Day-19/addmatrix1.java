import java.util.Scanner;
public class addmatrix1
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of 1 matrix ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][]a = new int[r1][c1];
        System.out.print("Enter rows and columns of 2 matrix ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][]b = new int[r2][c2];
        int[][]sum = new int[r1][c1];
        if(r1!=r2 || c1!=c2)//CONDITION FOR ADDITION
        {
            System.out.print("ADDITION NOT POSSIBLE");
            sc.close();
            return;
        }
        System.out.println("Enter Matrix 1=");
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c1; j++) 
                {
                    a[i][j] = sc.nextInt();//enter elements of 1 matrix
                }
             System.out.println();
        }
        System.out.println("Enter Matrix 2=");
        for (int i = 0; i < r2; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                b[i][j] = sc.nextInt();//enter elements of 1 matrix
            }
        System.out.println();
        }
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c1; j++) 
           {
            sum[i][j] = a[i][j] + b[i][j];//calculating sum
           }
        System.out.println();
        }
        System.out.println("SUM OF MATRIX");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c1; j++) 
                {
                    System.out.print(sum[i][j] + " ");//printing sum
                }
            System.out.println();
        }
        sc.close();
    }//closing main
}//closing class
