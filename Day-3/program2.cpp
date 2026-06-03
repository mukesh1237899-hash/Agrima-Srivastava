#include<iostream>
using namespace std;
int main()
{//OPENING MAIN
    int n,c=0;//intialising variables
cout<<"enter number";
    cin>>n;//taking input from keyboard
    for(int i=1;i<=n;i++)//checking whether prime number or not
    {//opening for loop
        for(int j=1;j<=i;j++)
        {//opening for loop
        if(i%j==0)
        c++;
        }//closing for loop
if(c==2)
cout<<i<<"\n";//PRINTING THOSE NUMBERS THAT ARE PRIME
c=0;
    }//closing for loop
    return 0;
}//CLOSING MAIN