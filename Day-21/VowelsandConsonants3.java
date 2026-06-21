import java.util.Scanner;
public class VowelsandConsonants3
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string=");
        String str = sc.nextLine();
        int v = 0, cons = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) //checking whether extracted charac is letter
            {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    v++;//counting vowels
                } else 
                {
                    cons++;//counting consonants
                }
            }
        }
        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + cons);
        sc.close();
    }//closing main
}//closing class