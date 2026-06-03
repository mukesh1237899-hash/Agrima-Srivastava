#include<iostream>
using namespace std;
int main() 
{//opening main
    int a, b, x, y, gcd, lcm;//initialising variables
    cout<<"Enter two numbers";
    cin>>a>>b;//store input in variables
    x = a;
    y = b;
    while (y != 0)
     {//opening while loop
        int temp = y;
        y = x % y;
        x = temp;
    }//closing while loop
    gcd = x;
    lcm = (a * b) / gcd;
    cout<<"LCM ="<<lcm;//printing lcm of numbers
    return 0;
}//closing main