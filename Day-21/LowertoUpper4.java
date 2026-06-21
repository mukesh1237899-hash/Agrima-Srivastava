import java.util.Scanner;
public class LowertoUpper4 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string=");
        String str = sc.nextLine();
        String r = "";
        for (int i = 0;i < str.length();i++) 
        {//opening for loop
            char ch = str.charAt(i);//extracting characters
            if (ch >= 'a' && ch <= 'z') 
            {
                ch = (char)(ch - 32);//converting into uppercase
            }
            r = r + ch;
        }//closing for loop
        System.out.println("Uppercase String=" + r);
        sc.close();
    }//closing main
}//closing class
