import java.util.Scanner;
public class PalindromeString1
{//opening class
    public static void main(String[] args)
    {//opening main
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER STRING=");
            String str = sc.nextLine();//initialising variables
            String r = "";
            for( int i=0; i<str.length(); i++)
            {
                r = str.charAt(i) + r;
            }
            if(str.equalsIgnoreCase(r))//checking whether palindrome or not
            System.out.println("PALINDROME STRING");
            else
            System.out.println(" Not PALINDROME STRING");
            sc.close();
    }//closing main
}//closing class
