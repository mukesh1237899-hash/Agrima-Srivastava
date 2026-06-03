#include<iostream>
using namespace std;
int main() 
{//opening main
    int a, b,z;//initializing variables
    cout<<"Enter two numbers ";
    cin>>a>>b;//taking input from user
    while (b != 0) 
    {//opening while loop
        z= b;
        b = a % b;
        a = z;
    }//closing while loop
    cout<<"GCD="<<a;//calculated result
    return 0;
}//closing main