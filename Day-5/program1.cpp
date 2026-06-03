#include<iostream>
using namespace std;
int main()
{//opening main
int n,sum=0;
cout<<"ENTER NUMBER";
cin>>n;//input number from keyboard
for(int i=1;i<n;i++)
{//opening for
    if(n%i==0)
    sum=sum+i;
}//closing for
if(sum==n)//CHECKING WHETHER PERFECT NUMBER OR NOT
cout<<"PERFECT NUMBER";
else
cout<<"NOT A PERFECT NUMBER";
return 0;
}//closing main

