import java.util.Scanner;
public class CountWords2
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string=");
        String str = sc.nextLine();//initialising variables
        int c = 0;
        boolean word = false;
        for(int i = 0; i < str.length(); i++) 
        {//opening for loop
            if(str.charAt(i) != ' ') 
            {
                if(!word) 
                {
                    c++;
                    word = true;
                }
            } 
            else 
            {
                word = false;
            }
        }//closing for loop
        System.out.println("Number of words = " + c);
        sc.close();
    }//closing main
}//closing class
