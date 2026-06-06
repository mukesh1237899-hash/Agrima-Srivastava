#include <iostream>
using namespace std;
int main()
{//opening main
    int n,num;//initialising variables
    cout << "Enter starting number: ";
    cin >> n;
    cout << "Enter ending number: ";
    cin >> num;
    for (int i=n;i<=num; i++)
    {//opening for loop
        int temp =i;
        int sum = 0, d;
        while (temp > 0)
        {//opening while loop
            d = temp % 10;
            sum = sum + (d*d*d);
            temp = temp / 10;
        }//closing while loop
        if (sum ==i)
        {//opening if loop
            cout << i << " ";//printing those that are armstrong 
        }//closing if loop
    }//closing for loop
    return 0;
}//closing main loop

