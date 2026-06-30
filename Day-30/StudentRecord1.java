import java.util.Scanner;
public class StudentRecord1
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        int MAX = 100;//setting limit of number of students
        int roll[] = new int[MAX];
        String name[] = new String[MAX];
        String course[] = new String[MAX];
        int c = 0;
        int ch;
        do 
        {//opening do while loop
            System.out.println("STUDENT RECORD SYSTEM:=");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice:=");
            ch = sc.nextInt();
            switch (ch) 
            {//opening switch case
                case 1:
                    if (c < MAX) 
                    {
                        System.out.print("Enter Roll Number: ");
                        roll[c] = sc.nextInt();
                        sc.nextLine();//clear buffer
                        System.out.print("Enter Name: ");
                        name[c] = sc.nextLine();
                        System.out.print("Enter Course: ");
                        course[c] = sc.nextLine();
                        c++;
                        System.out.println("Student Added Successfully.");
                    } 
                    else 
                    {
                        System.out.println("Record is Full.");
                    }
                    break;
                case 2:
                    if (c == 0) 
                    {
                        System.out.println("No Records Found.");
                    } 
                    else
                    {
                        System.out.println("Student Records:");
                        for (int i = 0; i < c; i++) 
                        {
                            System.out.println("Roll No : " + roll[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Course  : " + course[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < c; i++) 
                    {
                        if (roll[i] == search) 
                        {
                            System.out.println("Student Found");
                            System.out.println("Roll No : " + roll[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Course  : " + course[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Student Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Roll Number to Update: ");
                    int update = sc.nextInt();
                    sc.nextLine();
                    found = false;
                    for (int i = 0; i < c; i++) 
                    {
                        if (roll[i] == update) 
                        {
                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();
                            System.out.print("Enter New Course: ");
                            course[i] = sc.nextLine();
                            System.out.println("Record Updated.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Student Not Found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Roll Number to Delete: ");
                    int del = sc.nextInt();
                    found = false;
                    for (int i = 0; i < c; i++) 
                    {//opening for loop
                        if (roll[i] == del) 
                        {
                            for (int j = i; j < c - 1; j++) 
                            {
                                roll[j] = roll[j + 1];
                                name[j] = name[j + 1];
                                course[j] = course[j + 1];
                            }
                            c--;
                            found = true;
                            System.out.println("Record Deleted.");
                            break;
                        }
                    }//closing for loop
                    if (!found) 
                    {
                        System.out.println("Student Not Found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting the Program");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }//closing switch case
        } //closing do while loop
        while (ch != 6);
        sc.close();
    }//closing main
}//closing class