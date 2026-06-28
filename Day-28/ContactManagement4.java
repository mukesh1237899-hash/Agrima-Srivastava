import java.util.ArrayList;
import java.util.Scanner;
class Contact 
{
    int id;
    String name;
    String phone;
    // Constructor
    Contact(int id, String name, String phone) 
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}
public class ContactManagement4
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> list = new ArrayList<>();
        int ch;
        do 
        {//opening do while loop
            System.out.println(" CONTACT MANAGEMENT SYSTEM :=");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice:=");
            ch = sc.nextInt();
            switch(ch) 
            {
                case 1:
                    System.out.print("Enter Contact ID:=");
                    int id = sc.nextInt();
                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Name:=");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone Number:=");
                    String phone = sc.nextLine();
                    list.add(new Contact(id, name, phone));
                    System.out.println("Contact Added Successfully.");
                    break;
                case 2:
                    System.out.print("Enter Contact ID to Search:=");
                    id = sc.nextInt();
                    boolean found = false;
                    for(int i = 0; i < list.size(); i++) 
                    {
                        if(list.get(i).id == id) 
                        {
                            System.out.println("Contact ID   : " + list.get(i).id);
                            System.out.println("Name         : " + list.get(i).name);
                            System.out.println("Phone Number : " + list.get(i).phone);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("Contact Not Found.");
                    break;
                case 3:
                    System.out.print("Enter Contact ID to Update:=");
                    id = sc.nextInt();
                    sc.nextLine();
                    found = false;
                    for(int i = 0; i < list.size(); i++) 
                    {
                        if(list.get(i).id == id) 
                        {
                            System.out.print("Enter New Name:=");
                            list.get(i).name = sc.nextLine();
                            System.out.print("Enter New Phone Number:=");
                            list.get(i).phone = sc.nextLine();
                            System.out.println("Contact Updated Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("Contact Not Found.");
                    break;
                case 4:
                    System.out.print("Enter Contact ID to Delete: ");
                    id = sc.nextInt();
                    found = false;
                    for(int i = 0; i < list.size(); i++) 
                    {
                        if(list.get(i).id == id) 
                        {
                            list.remove(i);
                            System.out.println("Contact Deleted Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("Contact Not Found.");
                    break;
                case 5:
                    if(list.isEmpty()) 
                    {
                        System.out.println("No Contacts Available.");
                    }
                    else 
                    {
                        System.out.println(" Contact List==");
                        for(int i = 0; i < list.size(); i++) 
                        {
                            System.out.println("Contact ID   : " + list.get(i).id);
                            System.out.println("Name         : " + list.get(i).name);
                            System.out.println("Phone Number : " + list.get(i).phone);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }//closing switch case
        }//closing do while loop
        while(ch != 6);
        sc.close();
    }//closing main
}//closing class