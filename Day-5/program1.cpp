#include <iostream>
using namespace std;
int main()
{//opening main
    int n, sum = 0;//initialising variables
    cout << "Enter a number: ";
    cin >> n;//taking input from user
    for(int i = 1; i < n; i++)
    {//opening for loop
        if(n % i == 0)
        {//opening if loop
            sum = sum + i;
        }//closing if loop
    }//closing for loop
    if(sum == n)//checking whether perfect number or not
        cout << n << " is a Perfect Number";
    else
        cout << n << " is not a Perfect Number";
    return 0;
}//closing main