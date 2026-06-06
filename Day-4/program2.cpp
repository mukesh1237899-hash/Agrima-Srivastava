#include <iostream>
using namespace std;
int main()
{//opening main
    int n, a = 0, b = 1, c;//initialising variables
    cout << "Enter n: ";
    cin >> n;//taking input from keyboard
    if (n == 1)
        cout << a;
    else if (n == 2)
        cout << b;
    else
    {//opening else 
    int n,a=0,b=1,c;//intialising variables
    cout << "Enter the value of n: ";
    cin >> n;//taking input from keyboard
    if (n == 1)
        cout << "The 1st Fibonacci number is " << a;
    else if (n == 2)
        cout << "The 2nd Fibonacci number is " << b;
    else
    {
        for (int i = 3; i <= n; i++)
        {//opening for loop
            c = a + b;
            a = b;
            b = c;
        }//closing for loop
        cout << b;
    }//closing else
    return 0;
}//closing main
        cout << "The " << n << "th Fibonacci number is " << b;//GENERATING NTH FIBONACCI NUMBER
        return 0;
}//closing main
