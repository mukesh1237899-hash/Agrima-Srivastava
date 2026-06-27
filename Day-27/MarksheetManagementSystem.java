import java.util.ArrayList;
import java.util.Scanner;
class Student 
{
    int rollNo;
    String name;
    int physics, chemistry, maths;
    int total;
    double percentage;
    String grade;
    Student(int rollNo, String name, int physics, int chemistry, int maths) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
        calculateResult();
    }
    void calculateResult() 
    {
        total = physics + chemistry + maths;
        percentage = total / 3.0;
        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "Fail";
    }
    void display() 
    {
        System.out.println("Roll No      : " + rollNo);
        System.out.println("Name         : " + name);
        System.out.println("Physics      : " + physics);
        System.out.println("Chemistry    : " + chemistry);
        System.out.println("Mathematics  : " + maths);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage);
        System.out.println("Grade        : " + grade);
    }
}
public class MarksheetManagementSystem 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int choice;
        do 
        {
            System.out.println(" MARKSHEET MANAGEMENT SYSTEM ");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Roll Number:=");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name:=");
                    String name = sc.nextLine();
                    System.out.print("Enter Physics Marks:=");
                    int phy = sc.nextInt();
                    System.out.print("Enter Chemistry Marks:=");
                    int chem = sc.nextInt();
                    System.out.print("Enter Mathematics Marks:=");
                    int math = sc.nextInt();
                    list.add(new Student(roll, name, phy, chem, math));
                    System.out.println("Student Added Successfully.");
                    break;
                case 2:
                    if (list.size()==0) 
                    {
                        System.out.println("No Records Found.");
                    } else 
                    {
                        for (int i=0;i<list.size();i++) 
                        {
                            list.get(i).display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll Number: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for(Student s : list)
                    {
                        if (s.rollNo == searchRoll) 
                        {
                            s.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Student Not Found.");
                    break;
                case 4:
                    System.out.print("Enter Roll Number: ");
                    int updateRoll = sc.nextInt();
                    found = false;
                    for (Student s : list) {
                        if (s.rollNo == updateRoll) 
                        {
                            System.out.print("Enter New Physics Marks: ");
                            s.physics = sc.nextInt();
                            System.out.print("Enter New Chemistry Marks: ");
                            s.chemistry = sc.nextInt();
                            System.out.print("Enter New Mathematics Marks: ");
                            s.maths = sc.nextInt();
                            s.calculateResult();
                            System.out.println("Record Updated Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Student Not Found.");
                    break;
                case 5:
                    System.out.print("Enter Roll Number: ");
                    int deleteRoll = sc.nextInt();
                    found = false;
                    for (int i = 0; i < list.size(); i++) 
                    {//opening for loop
                        if (list.get(i).rollNo == deleteRoll) 
                        {
                            list.remove(i);
                            System.out.println("Student Deleted Successfully.");
                            found = true;
                            break;
                        }
                    }//closing for loop
                    if (!found)
                        System.out.println("Student Not Found.");
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } 
        while (choice != 6);
        sc.close();
    }//closing main
}//closing class