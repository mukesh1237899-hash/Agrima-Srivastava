import java.util.Scanner;
public class LibraryManagement1
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        String books[] = new String[10];
        int totalBooks = 0;
        int ch;
        do 
        {//opening do while loop
            System.out.println(" LIBRARY MANAGEMENT SYSTEM:=");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice:=");
            ch = sc.nextInt();
            sc.nextLine(); // Clear buffer
            switch (ch) 
            {//opening switch case
                case 1:
                    if (totalBooks < books.length) 
                    {
                        System.out.print("Enter book name:=");
                        books[totalBooks] = sc.nextLine();
                        totalBooks++;
                        System.out.println("Book Added Successfully.");
                    }
                    else 
                    {
                        System.out.println("Sorry!Library is Full.");
                    }
                    break;
                case 2:
                    if (totalBooks == 0) 
                    {
                        System.out.println("No Books Available in the Library.");
                    } 
                    else 
                    {
                        System.out.println("Books in Library:=");
                        for (int i = 0; i < totalBooks; i++) 
                        {
                            System.out.println((i + 1) + ". " + books[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter book name to search:=");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < totalBooks; i++) 
                    {
                        if (books[i].equalsIgnoreCase(search)) 
                        {
                            System.out.println("Book Found at Position " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Book Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter book name to delete: ");
                    String delete = sc.nextLine();
                    found = false;
                    for (int i = 0; i < totalBooks; i++) 
                    {
                        if (books[i].equalsIgnoreCase(delete)) 
                        {
                            for (int j = i; j < totalBooks - 1; j++) 
                            {
                                books[j] = books[j + 1];
                            }
                            totalBooks--;
                            System.out.println("Book Deleted Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Book Not Found.");
                    }
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Wrong Choice.");
            }//closing switch case
        }//closing do while loop
        while (ch != 5);
        sc.close();
    }//closing main
}//closing class