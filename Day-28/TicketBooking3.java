import java.util.ArrayList;
import java.util.Scanner;
class Ticket 
{
    int ticketId;
    String passengerName;
    String destination;
    // Constructor
    Ticket(int ticketId, String passengerName, String destination) 
    {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.destination = destination;
    }
}
public class TicketBooking3
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        ArrayList<Ticket> list = new ArrayList<>();
        int ch;
        do 
        {//opening do while loop
            System.out.println(" TICKET BOOKING SYSTEM :=");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Search Ticket");
            System.out.println("4. Display All Tickets");
            System.out.println("5. Exit");
            System.out.print("Enter your choice:=");
            ch = sc.nextInt();
            switch (ch) 
            {//opening switch case
                case 1:
                    System.out.print("Enter Ticket ID:=");
                    int id = sc.nextInt();
                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Passenger Name:=");
                    String name = sc.nextLine();
                    System.out.print("Enter Destination:=");
                    String destination = sc.nextLine();
                    list.add(new Ticket(id, name, destination));
                    System.out.println("Ticket Booked Successfully.");
                    break;
                case 2:
                    System.out.print("Enter Ticket ID to Cancel:=");
                    id = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < list.size(); i++) 
                    {
                        if (list.get(i).ticketId == id) 
                        {
                            list.remove(i);
                            System.out.println("Ticket Cancelled Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Ticket Not Found.");
                    break;
                case 3:
                    System.out.print("Enter Ticket ID to Search:=");
                    id = sc.nextInt();
                    found = false;
                    for (int i = 0; i < list.size(); i++) 
                    {
                        if (list.get(i).ticketId == id) 
                        {
                            System.out.println("Ticket ID      : " + list.get(i).ticketId);
                            System.out.println("Passenger Name : " + list.get(i).passengerName);
                            System.out.println("Destination    : " + list.get(i).destination);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Ticket Not Found.");
                    break;
                case 4:
                    if (list.isEmpty()) 
                    {
                        System.out.println("No Tickets Booked.");
                    } 
                    else 
                    {
                        System.out.println("Booked Tickets:=");
                        for (int i = 0; i < list.size(); i++) 
                        {
                            System.out.println("Ticket ID      : " + list.get(i).ticketId);
                            System.out.println("Passenger Name : " + list.get(i).passengerName);
                            System.out.println("Destination    : " + list.get(i).destination);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }//closing switch case
        }//closing do while loop
        while (ch != 5);
        sc.close();
    }//closing main
}//closing class
    
