import java.util.Scanner;
public class SalaryManagementSystem3
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int[] empId = new int[50];
        String[] empName = new String[50];
        double[] basic = new double[50];
        double[] hra = new double[50];
        double[] da = new double[50];
        double[] ta = new double[50];
        double[] pf = new double[50];
        double[] gS = new double[50];
        double[] NS = new double[50];
        int c = 0;
        int ch;
        do 
        {//opening do while loop
            System.out.println("Salary Management System :=");
            System.out.println("1. Add Employee ");
            System.out.println("2. Display All Employee");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update basic Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice:=");
            ch = sc.nextInt();
            switch (ch) 
            {//opening switch case
                case 1:
                    System.out.print("Enter Employee ID:=");
                    empId[c] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name:=");
                    empName[c] = sc.nextLine();
                    System.out.print("Enter Basic Salary:=");
                    basic[c] = sc.nextDouble();
                    hra[c] = (20 * basic[c])/100;
                    da[c] = (10 * basic[c])/100;
                    ta[c] = (5 * basic[c])/100;
                    pf[c] = (12 * basic[c])/100;
                    gS[c] = basic[c]+hra[c]+da[c]+ta[c];
                    NS[c] = gS[c] - pf[c];
                    c++;
                    System.out.println("congrats!!Employee details has been Added Successfully");
                    break;
                case 2:
                    if (c == 0) 
                    {
                        System.out.println("No Employee Records Found.");
                    } 
                    else 
                    {
                        System.out.println("SALARY DETAILS OF EMPLOYEES");
                        for (int i = 0; i < c; i++) 
                        {
                            System.out.println("EMPLOYEE ID " +"\t"+ "NAME" +"\t"+ "BASIC SALARY"+"\t"+"HRA" +"\t"+ "DA" +"\t"+"TA"+"\t"+ "PF"+"\t"+ "GROSS SALARY"+"\t"+"NET SALARY");
                            System.out.println(empId +"\t" + empName[i] +"\t"+ basic[i]+"\t" +hra[i] + "\t"+ da[i] +"\t" + ta[i] + "\t"+ pf[i] + "\t" + gS[i] + "\t"+ NS[i]);
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
                            System.out.println("Basic Salary  : " + basic[i]);
                            System.out.println("HRA  : " + hra[i]);
                            System.out.println("DA  : " + da[i]);
                            System.out.println("TA  : " + ta[i]);
                            System.out.println("PF  : " + pf[i]);
                            System.out.println("Gross Salary  : " + gS[i]);
                            System.out.println("Net Salary : " + NS[i]);
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
                            System.out.print("Enter New Basic Salary:=");
                            basic[i] = sc.nextDouble();
                            hra[c] = (20 * basic[c])/100;
                            da[c] = (10 * basic[c])/100;
                            ta[c] = (5 * basic[c])/100;
                            pf[c] = (12 * basic[c])/100;
                            gS[c] = basic[c]+hra[c]+da[c]+ta[c];
                            NS[c] = gS[c] - pf[c];
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
                                basic[j] = basic[j + 1];
                                hra[j] = hra[j + 1];
                                da[j] = da[j + 1];
                                ta[j] = ta[j + 1];
                                pf[j] = pf[j + 1];
                                gS[j] = gS[j + 1];
                                NS[j] = NS[j + 1];
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

