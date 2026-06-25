import java.util.Scanner;
public class CommonCharacters2 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string=");
        String str1 = sc.nextLine();
        System.out.println("Enter second string=");
        String str2 = sc.nextLine();
        System.out.println("Common characters are");
        for(int i = 0; i < str1.length(); i++) 
        {//opening for loop
            char ch = str1.charAt(i);
            for(int j = 0; j < str2.length(); j++) 
            {
                if(ch == str2.charAt(j)) 
                {
                    System.out.println(ch);
                    break;
                }
            }
        }//closing for loop
        sc.close();
    }//closing main
}//closing class
