import java.util.Scanner;
public class MiniEmployee3 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        int MAX = 100;//giving limit for employees
        int[] empId = new int[MAX];
        String[] empName = new String[MAX];
        String[] empDept = new String[MAX];
        double[] empSalary = new double[MAX];
        int c = 0;
        int ch;
        do 
        {//opening do while loop
            System.out.println(" EMPLOYEE MANAGEMENT SYSTEM:=");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) 
            {
                case 1:
                    if (c == MAX) 
                    {
                        System.out.println("Employee list is full.");
                        break;
                    }
                    System.out.print("Enter Employee ID:=");
                    empId[c] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name:=");
                    empName[c] = sc.nextLine();
                    System.out.print("Enter Department:=");
                    empDept[c] = sc.nextLine();
                    System.out.print("Enter Salary:=");
                    empSalary[c] = sc.nextDouble();
                    c++;
                    System.out.println("Employee Added Successfully.");
                    break;
                case 2:
                    if (c == 0) 
                    {
                        System.out.println("No Employees Found.");
                    } 
                    else 
                    {
                        System.out.println("Employee Details");
                        for (int i = 0; i < c; i++) 
                        {
                            System.out.println("ID         : " + empId[i]);
                            System.out.println("Name       : " + empName[i]);
                            System.out.println("Department : " + empDept[i]);
                            System.out.println("Salary     : " + empSalary[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < c; i++) 
                    {
                        if (empId[i] == searchId) 
                        {
                            System.out.println("Employee Found");
                            System.out.println("ID         : " + empId[i]);
                            System.out.println("Name       : " + empName[i]);
                            System.out.println("Department : " + empDept[i]);
                            System.out.println("Salary     : " + empSalary[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Employee Not Found.");
                    break;
                case 4:
                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();
                    found = false;
                    for (int i = 0; i < c; i++) 
                    {
                        if (empId[i] == updateId) 
                        {
                            System.out.print("Enter New Salary: ");
                            empSalary[i] = sc.nextDouble();
                            System.out.println("Salary Updated Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Employee Not Found.");
                    break;
                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int del = sc.nextInt();
                    found = false;
                    for (int i = 0; i < c; i++) 
                    {
                        if (empId[i] == del) 
                        {
                            for (int j = i; j < c - 1; j++) 
                            {
                                empId[j] = empId[j + 1];
                                empName[j] = empName[j + 1];
                                empDept[j] = empDept[j + 1];
                                empSalary[j] = empSalary[j + 1];
                            }
                            c--;
                            found = true;
                            System.out.println("Employee Deleted Successfully.");
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Employee Not Found.");
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }//closing switch case
        } //closing do while loop
        while (ch != 6);
        sc.close();
    }//closing main
}//closing class