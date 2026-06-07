#include <iostream>
using namespace std;
int reverseNum(int n, int rev = 0)//Recursive function to find reverse number
{
    if (n == 0)
        return rev;
    return reverseNum(n / 10, rev * 10 + n % 10);
}
int main() 
{//opening main
    int num;
    cout << "Enter a number: ";
    cin >> num;//taking input from user
    cout << "Reversed number = " << reverseNum(num);
    return 0;
}//closing main