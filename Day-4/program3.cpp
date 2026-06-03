#include <iostream>
using namespace std;
int main()
{//opening main
int n,num,sum=0,d;//initialising variables
    cout << "Enter a number: ";
    cin >> n;//taking input from keyboard
    num= n;
    while (num> 0)
    {//opening while loop
        d = num % 10;
        sum = sum + (d*d*d);
        num = num / 10;
    }//closing while loop
    if (sum == n)//applying conditions for armstrong number
        cout << n << " is an Armstrong number.";
    else
        cout << n << " is not an Armstrong number.";
    return 0;
}//closing main