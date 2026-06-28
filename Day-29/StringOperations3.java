import java.util.Scanner;
public class StringOperations3 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:=");
        String str = sc.nextLine();
        int ch;
        do 
        {//opening do while loop
            System.out.println("STRING OPERATIONS MENU :=");
            System.out.println("1. Display String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Find Length");
            System.out.println("5. Reverse String");
            System.out.println("6. Check Palindrome");
            System.out.println("7. Count Vowels");
            System.out.println("8. Exit");
            System.out.print("Enter your choice:=");
            ch = sc.nextInt();
            switch (ch) 
            {//opening switch case
                case 1:
                    System.out.println("String: " + str);
                    break;
                case 2://it converts string to uppercase
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;
                case 3://it converts string to lowercase
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;
                case 4:
                    System.out.println("Length: " + str.length());
                    break;
                case 5:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) 
                    {
                        rev = rev + str.charAt(i);
                    }
                    System.out.println("Reversed String:=" + rev);
                    break;
                case 6:
                    str = str.toUpperCase();//so that all letters be in same case
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) 
                    {
                        reverse = reverse + str.charAt(i);
                    }
                    if (str.equals(reverse)) 
                    {
                        System.out.println("Palindrome String");
                    } 
                    else 
                    {
                        System.out.println("Not a Palindrome String");
                    }
                    break;
                case 7:
                    int c = 0;
                    for (int i = 0; i < str.length(); i++) 
                    {
                        char cha = Character.toLowerCase(str.charAt(i));
                        if (cha == 'a' || cha == 'e' || cha == 'i' ||
                            cha == 'o' || cha == 'u') 
                        {
                            c++;//counting number of vowels
                        }
                    }
                    System.out.println("Number of Vowels:=" + c);
                    break;
                case 8:
                    System.out.println("EXITING THE PROGRAM.");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }//closing switch case
        } //closing do while loop
        while (ch != 8);
        sc.close();
    }//closing main
}//closing                                                                                                                                           