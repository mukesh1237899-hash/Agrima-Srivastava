import java.util.Scanner;
public class diagonalsum4
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix=");
        int n = sc.nextInt();//initialisation of variables
        int[][]a = new int[n][n];
        int sum = 0;
        System.out.println("Enter matrix elements=");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) 
        {
            sum = sum + a[i][i];//calculating diagonal sum
        }
        System.out.println("Diagonal Sum =" + sum);
        sc.close();
    }//closing main
}//closing class

