import java.util.Scanner;
class Book 
{
    int id;
    String title;
    String author;
    boolean issued;
}
public class MiniLibrarySystem2 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        Book library[] = new Book[50];   // Array to store books
        int c = 0;  // Number of books
        int ch;
        do 
        {//closing do while loop
            System.out.println(" MINI LIBRARY SYSTEM:=");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) 
            {//closing switch case
                case 1:
                    if (c == library.length) 
                    {
                        System.out.println("Library is Full.");
                        break;
                    }
                    library[c] = new Book();
                    System.out.print("Enter Book ID: ");
                    library[c].id = sc.nextInt();
                    sc.nextLine();//clear buffer
                    System.out.print("Enter Book Title: ");
                    library[c].title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    library[c].author = sc.nextLine();
                    library[c].issued = false;
                    c++;
                    System.out.println("Book Added Successfully.");
                    break;
                case 2:
                    if (c == 0) 
                    {
                        System.out.println("No Books Available.");
                    } 
                    else 
                    {
                        System.out.println("Books in Library");
                        for (int i = 0; i < c; i++) 
                        {
                            System.out.println("Book ID : " + library[i].id);
                            System.out.println("Title   : " + library[i].title);
                            System.out.println("Author  : " + library[i].author);
                            System.out.println("Status  : " + (library[i].issued ? "Issued" : "Available"));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < c; i++) 
                    {
                        if (library[i].id == search) 
                        {
                            System.out.println("Book Found");
                            System.out.println("Title  : " + library[i].title);
                            System.out.println("Author : " + library[i].author);
                            System.out.println("Status : " + (library[i].issued ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Book Not Found.");
                    break;
                case 4:
                    System.out.print("Enter Book ID to Issue: ");
                    int issue = sc.nextInt();
                    found = false;
                    for (int i = 0; i < c; i++) 
                    {
                        if (library[i].id == issue) 
                        {
                            found = true;
                            if (!library[i].issued) 
                            {
                                library[i].issued = true;
                                System.out.println("Book Issued Successfully.");
                            } 
                            else 
                            {
                                System.out.println("Book Already Issued.");
                            }
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Book Not Found.");
                    break;
                case 5:
                    System.out.print("Enter Book ID to Return: ");
                    int ret = sc.nextInt();
                    found = false;
                    for (int i = 0; i < c; i++) 
                    {
                        if (library[i].id == ret) 
                        {
                            found = true;
                            if (library[i].issued) 
                            {
                                library[i].issued = false;
                                System.out.println("Book Returned Successfully.");
                            } 
                            else 
                            {
                                System.out.println("Book is Already Available.");
                            }
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Book Not Found.");
                    break;
                case 6:
                    System.out.print("Enter Book ID to Delete: ");
                    int del = sc.nextInt();
                    found = false;
                    for (int i = 0; i < c; i++) 
                    {
                        if (library[i].id == del) 
                        {
                            for (int j = i; j < c - 1; j++) 
                            {
                                library[j] = library[j + 1];
                            }
                            library[c - 1] = null;
                            c--;
                            found = true;
                            System.out.println("Book Deleted Successfully.");
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Book Not Found.");
                    break;
                case 7:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }//closing switch case
        } //closing do while loop
        while (ch != 7);
        sc.close();
    }//closing main
}//closing class