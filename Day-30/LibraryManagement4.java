import java.util.Scanner;
public class LibraryManagement4 
{//opening main
    static Scanner sc = new Scanner(System.in);
    static int MAX = 100;//limit of number of books
    static int count = 0;//to count books
    static int[] bookId = new int[MAX];
    static String[] bookName = new String[MAX];
    static String[] author = new String[MAX];
    static boolean[] issued = new boolean[MAX];
    // Add Book
    static void addBook() 
    {
        System.out.print("Enter Book ID:=");
        bookId[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Name:=");
        bookName[count] = sc.nextLine();
        System.out.print("Enter Author Name:=");
        author[count] = sc.nextLine();
        issued[count] = false;
        count++;
        System.out.println("Book Added Successfully.");
    }
    // Display Books
    static void displayBooks() 
    {
        if (count == 0) 
        {
            System.out.println("No Books Available.");
            return;
        }
        for (int i = 0; i < count; i++) 
        {
            System.out.println("Book ID : " + bookId[i]);
            System.out.println("Book Name : " + bookName[i]);
            System.out.println("Author : " + author[i]);
            System.out.println("Status : " + (issued[i] ? "Issued" : "Available"));
        }
    }
    // Search Book
    static void searchBook() 
    {
        System.out.print("Enter Book ID:=");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) 
        {
            if (bookId[i] == id) 
            {

                System.out.println("Book Found");
                System.out.println("Book Name : " + bookName[i]);
                System.out.println("Author : " + author[i]);
                System.out.println("Status : " + (issued[i] ? "Issued" : "Available"));
                return;
            }
        }
        System.out.println("Book Not Found.");
    }
    // Issue Book
    static void issueBook() 
    {
        System.out.print("Enter Book ID:=");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) 
        {
            if (bookId[i] == id) 
            {
                if (!issued[i]) 
                {
                    issued[i] = true;
                    System.out.println("Book Issued Successfully.");
                } 
                else 
                {
                    System.out.println("Book Already Issued.");
                }
                return;
            }
        }
        System.out.println("Book Not Found.");
    }
    // Return Book
    static void returnBook() 
    {

        System.out.print("Enter Book ID:=");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) 
        {
            if (bookId[i] == id) 
            {
                if (issued[i]) 
                {
                    issued[i] = false;
                    System.out.println("Book Returned Successfully.");
                } else {
                    System.out.println("Book Was Not Issued.");
                }
                return;
            }
        }
        System.out.println("Book Not Found.");
    }
    // Delete Book
    static void deleteBook() 
    {
        System.out.print("Enter Book ID:=");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) 
        {
            if (bookId[i] == id) 
            {
                for (int j = i; j < count - 1; j++) 
                {
                    bookId[j] = bookId[j + 1];
                    bookName[j] = bookName[j + 1];
                    author[j] = author[j + 1];
                    issued[j] = issued[j + 1];
                }
                count--;
                System.out.println("Book Deleted Successfully.");
                return;
            }
        }
        System.out.println("Book Not Found.");
    }
    public static void main(String[] args) 
    {//opening main
        int choice;
        do 
        {//opening do while loop
            System.out.println(" LIBRARY MANAGEMENT SYSTEM:==");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter Choice:=");
            choice = sc.nextInt();
            switch (choice) 
            {//opening switch case
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    deleteBook();
                    break;
                case 7:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }//closing switch case
        } //closing do while loop
        while (choice != 7);
    }//closing main
}//closing class