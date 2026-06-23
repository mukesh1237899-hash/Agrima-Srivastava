import java.util.Scanner;
public class FirstNonrepChar1
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string=");
        String str = sc.nextLine();
        char fnr = ' ';
        str = str.toUpperCase();
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
            if (c == 1) 
            {
                fnr = str.charAt(i);//first non repeating character
                break;
            }
        }//closing for loop
        if (fnr != ' ') 
            System.out.println("First non-repeating character=" + fnr);
        else 
            System.out.println("No non-repeating character found");
        sc.close();
    }//closing main
}//closing class