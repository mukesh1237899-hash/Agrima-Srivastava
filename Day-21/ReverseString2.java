import java.util.Scanner;
public class ReverseString2 
{//opening class
    public static void main(String[] args)
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string=");
        String str = sc.nextLine();
        System.out.print("Reversed string=");
        for (int i = str.length() - 1;i >= 0;i--) 
        {
            System.out.print(str.charAt(i));//printing string in reverse
        }
        sc.close();
    }//closing main
}//closing class
