import java.util.Scanner;
public class LongestWord3 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence=");
        String str = sc.nextLine();//initialising variables
        String word = "";
        String l = "";
        for(int i = 0; i <= str.length(); i++) 
        {//OPENING FOR LOOP
            if(i == str.length() || str.charAt(i) == ' ') 
            {
                if(word.length() > l.length()) 
                {
                    l = word;
                }
                word = "";
            } 
            else 
            {
                word = word + str.charAt(i);
            }
        }//CLOSING FOR LOOP
        System.out.println("Longest word= " + l);
        System.out.println("Length= " + l.length());
        sc.close();
    }//closing main
}//closing class