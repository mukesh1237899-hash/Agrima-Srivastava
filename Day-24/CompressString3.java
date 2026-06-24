import java.util.Scanner;
public class CompressString3 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string=");
        String str = sc.nextLine();
        String r = "";
        int c = 1;
        for(int i = 0; i < str.length(); i++) 
        {//opening for loop
            if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) 
            {
                c++;
            } else 
            {
                r = r + str.charAt(i) + c;//storing result
                c = 1;
            }
        }//closing for loop
        System.out.println("Compressed String= " + r);
        sc.close();
    }//closing main
}//closing class