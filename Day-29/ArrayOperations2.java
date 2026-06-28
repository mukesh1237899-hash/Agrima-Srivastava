import java.util.Scanner;
public class ArrayOperations2 
{//opening class
    public static void main(String[] args) 
    {//opening main
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:=");
        int n = sc.nextInt();
        int ch;
        int arr[] = new int[n];
        System.out.println("Enter array elements:=");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();//storing elements
        }
        do 
        {//opening do while loop
            System.out.println("ARRAY OPERATIONS MENU :=");
            System.out.println("1. Display Array");
            System.out.println("2. Search Element");
            System.out.println("3. Find Maximum");
            System.out.println("4. Find Minimum");
            System.out.println("5. Calculate Sum");
            System.out.println("6. Calculate Average");
            System.out.println("7. Exit");
            System.out.print("Enter your choice:=");
            ch = sc.nextInt();
            switch (ch) 
            {//opening switch case
                case 1:
                    System.out.println("Array Elements:=");
                    for (int i = 0; i < n; i++) 
                    {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter element to search:=");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) 
                    {
                        if (arr[i] == key) 
                        {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Element not found.");
                    }
                    break;
                case 3:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) 
                    {
                        if (arr[i] > max) 
                        {
                            max = arr[i];
                        }
                    }
                    System.out.println("Maximum Element = " + max);
                    break;
                case 4:
                    int min = arr[0];
                    for (int i = 1; i < n; i++) 
                    {
                        if (arr[i] < min) 
                        {
                            min = arr[i];
                        }
                    }
                    System.out.println("Minimum Element = " + min);
                    break;
                case 5:
                    int sum = 0;
                    for (int i = 0; i < n; i++) 
                    {
                        sum = sum + arr[i];
                    }
                    System.out.println("Sum = " + sum);
                    break;
                case 6:
                    int total = 0;
                    for (int i = 0; i < n; i++) 
                    {
                        total = total + arr[i];
                    }
                    double avg = (double) total / n;
                    System.out.println("Average = " + avg);
                    break;
                case 7:
                    System.out.println("EXITING THE PROGRAM!!");
                    break;
                default://Choice input is greater than 7
                    System.out.println("Invalid Choice!");
            }//closing switch case
        }//closing do while loop
        while (ch != 7);
        sc.close();
    }//closing main
}//closing class