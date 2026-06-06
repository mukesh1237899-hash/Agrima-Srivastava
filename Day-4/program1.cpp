#include <iostream>
using namespace std;
int main()
{//opening main
    int n ,a = 0, b = 1, c;//initialising variables
    cout << "Enter the number of terms: ";
    cin >> n;//input number from user
    cout << "Fibonacci Series: ";
    for(int i = 1; i <= n; i++)
    {//opening for loop
        cout << a << " ";//PRINTING FIBONACCI SERIES
    int n, a = 0, b = 1, c;
    cout << "Enter the number of terms: ";
    cin >> n;//taking input from keyboard
    cout << "Fibonacci Series: ";
    for(int i = 1; i <= n; i++)
    {//opening for loop
        cout << a << " ";//GENERATING FIBONACCI SERIES
        c = a + b;
        a = b;
        b = c;
    }//closing for loop
    return 0;
}//closing main