import java.util.Scanner;
public class EmployeeManagementSystem2
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        int[] empId = new int[50];
        String[] empName = new String[50];
        String[] department = new String[50];
        double[] salary = new double[50];
        int c = 0;
        int ch;
        do 
        {//opening do while loop
            System.out.println("Employee Management System :=");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) 
            {
                case 1:
                    System.out.print("Enter Employee ID=");
                    empId[c] = sc.nextInt();
                    System.out.print("Enter Employee Name:=");
                    empName[c] = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter Department:= ");
                    department[c] = sc.nextLine();
                    System.out.print("Enter Salary per annum:= ");
                    salary[c] = sc.nextDouble();
                    c++;
                    System.out.println("Employee Added Successfully.");
                    break;
                case 2:
                    if (c == 0) 
                    {
                        System.out.println("No Employee Records Found.");
                    } 
                    else 
                    {
                        System.out.println("\nID\tName\tDepartment\tSalary");
                        for (int i = 0; i < c; i++) 
                        {
                            System.out.println(empId[i] + "\t" + empName[i] + "\t" + department[i] + "\t\t" + salary[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to Search:=");
                    int search = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < c; i++) 
                    {
                        if (empId[i] == search)
                        {
                            System.out.println("Employee Id : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Department  : " + department[i]);
                            System.out.println("Salary per annum    : " + salary[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("Not found");
                    break;
                case 4:
                    System.out.print("Enter Employee Id to Update:=");
                    int update = sc.nextInt();
                    sc.nextLine();
                    
                    for (int i = 0; i < c; i++) 
                    {
                        if (empId[i] == update) 
                        {
                            System.out.print("Enter New Name:=");
                            empName[i] = sc.nextLine();
                            System.out.print("Enter New Department:=");
                            department[i] = sc.nextLine();
                            System.out.print("Enter New Salary:=");
                            salary[i] = sc.nextInt();
                            System.out.println("Record Updated Successfully.");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter Employee Id to Delete: ");
                    int del = sc.nextInt();
                    for (int i = 0; i < c; i++) 
                    {
                        if (empId[i] == del) 
                        {
                            for (int j = i; j < c - 1; j++) 
                            {
                                empId[j] = empId[j + 1];
                                empName[j] = empName[j + 1];
                                department[j] = department[j + 1];
                                salary[j] = salary[j + 1];
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
