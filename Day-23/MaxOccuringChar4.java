import java.util.Scanner;
public class MaxOccuringChar4
 {//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string=");
        String str = sc.nextLine();
        str = str.toUpperCase();
        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) 
        {//opening for loop
            int c = 0;
            for (int j = 0; j < str.length(); j++) 
            {
                if (str.charAt(i) == str.charAt(j)) 
                {
                    c++;
                }
            }
            if (c > maxCount) 
            {
                maxCount = c;//storing max count of max charac
                maxChar = str.charAt(i);//storing max occuring character
            }
        }//closing for loop
        System.out.println("Maximum occurring character=" + maxChar);
        System.out.println("Frequency= " + maxCount);
        sc.close();
    }//closing main
}//closing class