import java.util.Scanner;
public class columnwisesum4 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns=");
        int r = sc.nextInt();//initialising variable
        int c = sc.nextInt();
        int[][]a = new int[r][c];
        System.out.println("Enter matrix elements=");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        for (int j = 0; j < c; j++) 
        {
            int sum = 0;
            for (int i = 0; i < r; i++) 
            {
                sum = sum + a[i][j];//calculating sum of different columns
            }
            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
            //printing sum of different columns
        }
        sc.close();
    }//closing main
}//closing class
