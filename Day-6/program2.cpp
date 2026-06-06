#include<iostream>
#include<cmath>//function is used since pow is used here
using namespace std;
int main()
{//opening main
long b;//initialising variables
int d=0,i=0,r;
cout<<"ENTER BINARY NUMBER=";
cin>>b;//taking input from user
while(b!=0)
{//opening while
    r=b%10;
    d=d+(r*pow(2,i));
    b=b/10;
    i++;
}//closing while
cout<<"DECIMAL NUMBER="<<d<<endl;//princing decimal value of input binary number
return 0;
}//closing main