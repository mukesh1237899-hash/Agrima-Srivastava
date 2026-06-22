import java.util.Scanner;
public class CharacterFrequency3
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string=");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) 
        {//opening for loop
            int c = 1;
            boolean found = false;
            for(int k = 0; k < i; k++)// Check if character already appeared before
            {
                if(str.charAt(i) == str.charAt(k)) 
                {
                    found = true;
                    break;
                }
            }
            if(found)
                continue;
            for(int j = i + 1; j < str.length(); j++) 
            {
                if(str.charAt(i) == str.charAt(j)) 
                {
                    c++;
                }
            }
            System.out.println(str.charAt(i) + " = " + c);
        }//closing for loop
        sc.close();
    }//closing main
}//closing class
