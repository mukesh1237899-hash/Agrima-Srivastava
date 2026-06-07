#include <iostream>
using namespace std;
int sumOfDigits(int n) // Recursive function to find sum of digits
{
    if (n == 0)
        return 0;

    return (n % 10) + sumOfDigits(n / 10);
}
int main() 
{//opening main
    int num;
    cout << "Enter a number: ";
    cin >> num;//taking input from user
    cout << "Sum of digits = " << sumOfDigits(num);
    return 0;
}//closing main