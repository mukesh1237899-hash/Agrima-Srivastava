import java.util.Scanner;
public class AnagramStrings3 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string=");
        String str1 = sc.nextLine();//initialising variables
        System.out.print("Enter second string=");
        String str2 = sc.nextLine();
        int c = 0;
        char ch = ' ';
        str1 = str1.toUpperCase();//converting both string to same case
        str2 = str2.toUpperCase();
        if (str1.length() == str2.length()) 
        {
        for (int i = 0; i < str1.length(); i++) 
        {
           for (int j = 0; j < str2.length(); j++) 
           { 
            if(str1.charAt(i) == str2.charAt(j))
            {
              c++;
              ch = str1.charAt(i);
              ch = '0';
            }
           }
        }
        if (c == str1.length())
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are not Anagrams");
        }
        else
            System.out.println("Strings are not Anagrams");
        sc.close();
    }//closing main
}//closing class