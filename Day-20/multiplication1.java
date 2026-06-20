import java.util.Scanner;
public class multiplication1 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of first matrix=");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter rows and columns of second matrix=");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if (c1 != r2)
        {//opening if loop
            System.out.println("Matrix multiplication is not possible");
            sc.close();
            return;
        }//closing if loop
        int[][]a = new int[r1][c1];
        int[][]b = new int[r2][c2];
        int[][]c = new int[r1][c2];
        System.out.println("Enter elements of first matrix=");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();//input 1 matrix elements
        System.out.println("Enter elements of second matrix=");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();//input 2 matrix elements
        for (int i = 0; i < r1; i++) 
        {//opening for loop
            for (int j = 0; j < c2; j++) 
            {
                for (int k = 0; k < c1; k++) 
                {
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);//calculating multiplication of matrix
                }
            }
        }//closing for loop
        System.out.println("Resultant Matrix=");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++)
            {
                System.out.print(c[i][j] + " ");//printing resultant matrix
            }
            System.out.println();
        }
        sc.close();
    }//closing main
}//closing class
