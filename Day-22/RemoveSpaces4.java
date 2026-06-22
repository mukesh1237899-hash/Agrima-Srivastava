import java.util.Scanner;
public class RemoveSpaces4 
{//opening class
    public static void main (String[] args)
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER STRING=");
        String str = sc.nextLine();
        String r = "";
        for( int i = 0; i < str.length(); i++ )
        {//opening for loop
            char ch = str.charAt(i);
            if( ch == ' ')
            {
                i = i+1;
                r = r + str.charAt(i);
            }
            else
            {
                r = r + str.charAt(i);
            }
        }//closing for loop
        System.out.println("STRING WITHOUT SPACES=" + r);
        sc.close();
    }//closing main
}//closing class

