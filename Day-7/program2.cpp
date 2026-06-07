#include <iostream>
using namespace std;
int fibonacci(int n)//Recursive function to find nth Fibonacci number
 {
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
int main()
 {//opening main
    int n;
    cout << "Enter the number of terms: ";
    cin >> n;//taking input from user
    cout << "Fibonacci Series: ";
    for (int i=0; i<n; i++)
     {//opening for loop
        cout << fibonacci(i) << " ";
    }//closing for loop
    return 0;
}//closing main
