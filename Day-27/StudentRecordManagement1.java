import java.util.Scanner;
public class StudentRecordManagement1 
{//opening class

    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        int[] roll = new int[50];
        String[] name = new String[50];
        String[] course = new String[50];
        int[] marks = new int[50];
        int c = 0;
        int ch;
        do 
        {//opening do while loop
            System.out.println(" Student Record Management System:=");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Record");
            System.out.println("5. Delete Student Record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice=");
            ch = sc.nextInt();
            switch (ch) 
            {//opening switch case
                case 1:
                    System.out.print("Enter Roll Number:=");
                    roll[c] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name:=");
                    name[c] = sc.nextLine();
                    System.out.print("Enter Course:=");
                    course[c] = sc.nextLine();
                    System.out.print("Enter Marks:=");
                    marks[c] = sc.nextInt();
                    c++;
                    System.out.println("Record Added Successfully.");
                    break;
                case 2:
                    if (c == 0) 
                    {
                        System.out.println("No Records Found.");
                    }
                    else 
                    {
                        System.out.println("\nRoll\tName\tCourse\tMarks");
                        for (int i = 0; i < c; i++) 
                        {
                            System.out.println(roll[i] + "\t" + name[i] + "\t" + course[i] + "\t" + marks[i]);
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
                            System.out.println("Roll Number : " + roll[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Course      : " + course[i]);
                            System.out.println("Marks       : " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Student Record Not Found.");
                    break;
                case 4:
                    System.out.print("Enter Roll Number to Update: ");
                    int update = sc.nextInt();
                    for (int i = 0; i < c; i++) 
                    {
                        if (roll[i] == update) 
                        {
                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();
                            System.out.print("Enter New Course: ");
                            course[i] = sc.nextLine();
                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextInt();
                            System.out.println("Record Updated Successfully.");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter Roll Number to Delete: ");
                    int del = sc.nextInt();
                    for (int i = 0; i < c; i++) 
                    {
                        if (roll[i] == del) 
                        {

                            for (int j = i; j < c - 1; j++) 
                            {
                                roll[j] = roll[j + 1];
                                name[j] = name[j + 1];
                                course[j] = course[j + 1];
                                marks[j] = marks[j + 1];
                            }
                            c--;
                            System.out.println("Record Deleted Successfully.");
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }//closing switch case
        }//closing do while loop
        while (ch != 6);
        sc.close();
    }//closing main
}//closing class
