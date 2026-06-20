import java.util.Scanner;
public class symmetric2 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of matrix=");
        int r = sc.nextInt();
        int c = sc.nextInt();
        if(r != c)
        {//opening if loop
            System.out.println("NOT SQUARE MATRIX SO NOT POSSIBLE ");
            sc.close();
            return;
        }//closing if loop
        int n=r;
        int[][]a = new int[n][n];
        System.out.println("Enter matrix elements=");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        boolean symmetric = true;
        for (int i = 0; i < n; i++) 
        {//opening for loop
            for (int j = 0; j < n; j++) 
            {
                if (a[i][j] != a[j][i]) //checking whether symmetric or not
                {
                    symmetric = false;
                    break;
                }
            }
        }//closing for loop
        if (symmetric)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is Not Symmetric");
        sc.close();
    }//closing main
}//closing class
