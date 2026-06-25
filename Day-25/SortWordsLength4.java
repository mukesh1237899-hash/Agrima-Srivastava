import java.util.Scanner;
public class SortWordsLength4 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words= ");
        int n = sc.nextInt();
        sc.nextLine();//consume leftover
        String[] words = new String[n];
        System.out.println("Enter words of different length=");
        for (int i = 0; i < n; i++) 
        {
            words[i] = sc.nextLine();//input words
        }
        for (int i = 0; i < n - 1; i++) 
        {//opening for loop
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (words[j].length() > words[j + 1].length()) 
                {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }//closing for loop
        System.out.println("Words sorted by length=");
        for (int i = 0; i < n; i++) 
        {
            System.out.println(words[i]);
        }
        sc.close();
    }//closing main
}//closing class
