#include <iostream>
using namespace std;
long long factorial(int n)// Recursive function to find factorial
 {
    if (n == 0 || n == 1)  // Base case
        return 1;
    else
        return n * factorial(n - 1);  // Recursive call
 }
int main()
 {//opening main
    int num;
    cout << "Enter a number: ";
    cin >> num;
    if (num < 0)
        cout << "Factorial is not defined for negative numbers." << endl;
    else
        cout << "Factorial of " << num << " is " << factorial(num) << endl;
    return 0;
}//closing main
