import java.util.ArrayList;
import java.util.Scanner;
class Product 
{
    int id;
    String name;
    int quantity;
    double price;
    Product(int id, String name, int quantity, double price) 
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
public class InventoryManag4
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        int ch;
        do 
        {//opening do while loop
            System.out.println("INVENTORY MANAGEMENT SYSTEM:=");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice:=");
            ch = sc.nextInt();
            switch (ch) 
            {//opening switch case
                case 1:
                    System.out.print("Enter Product ID:=");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name:=");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity:=");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Price:=");
                    double price = sc.nextDouble();
                    list.add(new Product(id, name, quantity, price));
                    System.out.println("Product Added Successfully.");
                    break;
                case 2:
                    if (list.isEmpty()) 
                    {
                        System.out.println("No Products Available.");
                    } 
                    else 
                    {
                        System.out.println("\nID\tName\tQuantity\tPrice");
                        for (int i = 0; i < list.size(); i++) 
                        {
                            Product p = list.get(i);
                            System.out.println(p.id + "\t" + p.name + "\t" + p.quantity + "\t\t" + p.price);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID to Search:=");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < list.size(); i++) 
                    {//opening for loop
                        Product p = list.get(i);
                        if (p.id == searchId) 
                        {
                            System.out.println("Product Found:");
                            System.out.println("ID: " + p.id);
                            System.out.println("Name: " + p.name);
                            System.out.println("Quantity: " + p.quantity);
                            System.out.println("Price: " + p.price);
                            found = true;
                            break;
                        }
                    }//closing for loop
                    if (!found) 
                    {
                        System.out.println("Product Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Product ID: ");
                    int updateId = sc.nextInt();
                    found = false;
                    for (int i = 0; i < list.size(); i++) 
                    {
                        Product p = list.get(i);
                        if (p.id == updateId) 
                        {
                            System.out.print("Enter New Quantity:=");
                            p.quantity = sc.nextInt();
                            System.out.println("Quantity Updated Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Product Not Found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Product ID to Delete:=");
                    int deleteId = sc.nextInt();
                    found = false;
                    for (int i = 0; i < list.size(); i++) 
                    {
                        if (list.get(i).id == deleteId) 
                        {
                            list.remove(i);
                            System.out.println("Product Deleted Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Product Not Found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }//closing switch case
        }//closing do while loop
        while (ch != 6);
        sc.close();
    }//closing main
}//closing class
