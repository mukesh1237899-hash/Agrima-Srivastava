import java.util.Scanner;
public class StringLength1 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string=");
        String str = sc.nextLine();//initialising variables
        int c = 0;
        for( char ch : str.toCharArray()) 
        {
            c++;//counting characters
        }
        System.out.println("Length of string=" + c);
        sc.close();
    }//closing main
}//closing class