import java.util.Scanner;
public class RemoveDuplicate4 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING");
        String str = sc.nextLine();//initialising variables
        str = str.toLowerCase();//converting in same case
         char arr[] = str.toCharArray();
        for(int i = 0; i < arr.length; i++) 
        {//OPENING FOR LOOP
            for(int j = i + 1; j < arr.length; j++) 
            {
                if(arr[i] == arr[j]) 
                {
                    arr[j] = '*';//Removing duplicate characters with *
                }
            }
        }//CLOSING FOR LOOP
        System.out.println("Result= " + new String(arr));
        sc.close();
    }//closing main
}//closing class