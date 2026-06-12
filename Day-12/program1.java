import java.util.Scanner;
public class program1
 {//opening class
     static boolean palin(int a) //FUNCTION TO CHECK WHETHER PALINDROME OR NOT
    {
        int num,rev=0,no;
        no=a;
    while(a!=0)
    {
        num=a%10;
        rev=num+(rev*10);
        a=a/10;
    }
    if(no==rev)
     return true;
     else
      return false;
}
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= sc.nextInt();
        System.out.println(palin(n));//calling function
        sc.close();
    }//closing main
}//opening class

