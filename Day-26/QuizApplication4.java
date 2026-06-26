import java.util.Scanner;
public class QuizApplication4 
{//opening class
    public static void main(String[] args)
    {//opening main
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int ans;
        System.out.println("Java Quiz");
        System.out.println("1. Java is a?");
        System.out.println("1. OS  2. Programming Language  3. Browser  4. Database");
        ans = sc.nextInt();
        if (ans == 2)
        {
            score = score + 2;
        }
        System.out.println("2.Which package contains the Scanner class?");
        System.out.println("1.java.io  2.java.util  3.java.lang  4.java.net");
        ans = sc.nextInt();
        if (ans == 2)
        {
            score = score + 2;
        }
        System.out.println("3. Which keyword is used to create an object?");
        System.out.println("1. class  2. new  3. static  4. void");
        ans = sc.nextInt();
        if (ans == 2)
        {            
            score = score + 2;
        }
        System.out.println("4. Which method is the entry point of a Java program?");
        System.out.println("1. start()  2. run()  3. main()  4. init()");
        ans = sc.nextInt();
        if (ans == 3)
        {           
             score = score + 2;
        }
        System.out.println("Your Score:= " + score + "/8");
        sc.close();
    }//closing main
}//closing class