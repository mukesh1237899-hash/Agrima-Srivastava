import java.util.Scanner;
public class rowwisesum3 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns=");
        int r = sc.nextInt();//initialising variables
        int c = sc.nextInt();
        int[][]a = new int[r][c];
        System.out.println("Enter matrix elements=");
        for (int i = 0; i < r; i++)
        {//OPENING FOR LOOP
            for (int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }//CLOSING FOR LOOP
        for (int i = 0; i < r; i++) 
        {//opening for loop
            int sum = 0;
            for (int j = 0; j < c; j++) 
            {
                sum = sum + a[i][j];//calculating sum of different rows
            }
            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
            //printing sum of different rows
        }//closing for loop
        sc.close();
    }//closing main
}//closing class
