import java.util.Scanner;
public class FirstRepChar2
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string=");
        String str = sc.nextLine();
        char fr = ' ';
        str = str.toUpperCase();//convertihng to same case
        for (int i = 0; i < str.length(); i++) 
        {//opening for loop
            for (int j = i + 1; j < str.length(); j++) 
            {
                if (str.charAt(i) == str.charAt(j)) 
                {
                    fr = str.charAt(i);
                    break;
                }
            }
            if (fr != ' ') 
            {
                break;
            }
        }//closing for loop
        if (fr != ' ') 
            System.out.println("First repeating character=" + fr);
        else
            System.out.println("No repeating character found");
        sc.close();
    }//closing main
}//closing class