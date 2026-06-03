#include<iostream>
using namespace std;
int main()
{//opening main
    int n,d,p=1,sum=0,num;//initialising variables
    cout<<"ENTER NUMBER";
    cin>>n;//input number from keyboard
    num=n;
    while(n!=0)
    {//OPENING WHILE LOOP
        d=n%10;
        for(int i=1;i<=d;i++)//APPLYING CONDITIONS
        {//OPENING FOR LOOP
            p=p*i;
        }//CLOSING FOR LOOP
        sum=sum+p;
        n=n/10;
        p=1;
    }//CLOSING WHILE LOOP
    if(num==sum)//CHECKING WHETHER STRONG NUMBER OR NOT
    cout<<num<<" STRONG NUMBER";
    else
    cout<<num<<" is not STRONG NUMBER";
     return 0;
}//closing main