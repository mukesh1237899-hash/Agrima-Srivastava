import java.util.Scanner;
public class SortNamesAlphabe3 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names = ");
        int n = sc.nextInt();
        sc.nextLine();//consume leftover
        String names[] = new String[n];
        System.out.println("Enter names=");
        for(int i = 0; i < n; i++) 
        {
            names[i] = sc.nextLine();
        }
        for(int i = 0; i < n - 1; i++) 
        {//opening for loop
            for(int j = 0; j < n - i - 1; j++) 
            {
                if(names[j].compareTo(names[j + 1]) > 0) 
                {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }//closing for loop
        System.out.println("Names in alphabetical order=");
        //sorted names alphabetically
        for(int i = 0; i < n; i++) 
        {
            System.out.println(names[i]);
        }
        sc.close();
    }//closing main
}//closing class