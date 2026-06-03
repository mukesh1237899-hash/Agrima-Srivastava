#include<iostream>
using namespace std;
int main()
{//opening main
    int n,c=0,num,d,sum=0,p=1,no;//initialising variables
        cout<<"ENTER NUMBER:";
    cin>>n;//taking input from keyboard
    num=n;
    no=n;
    while(n!=0)
    {//opening while loop
        n=n/10;
        c++;//calculating number of digits
    }//closing while loop
    while(num!=0)
    {//opening while loop
        d=num%10;
        for(int i=1;i<=c;i++)
        {//opening for loop
            p=p*d;
        }//closing for loop
        sum=sum+p;
        num=num/10;
        p=1;
    }//closing while loop
if(no==sum)//CHECKING WHETHER INPUT NUMBER IS ARMSTRONG OR NOT
cout<<no<<" IS ARMSTRONG NUMBER";
else
cout<<no<<" IS NOT ARMSTRONG NUMBER";
return 0;
}//closing main