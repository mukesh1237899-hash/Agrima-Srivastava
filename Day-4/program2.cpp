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