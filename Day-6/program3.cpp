#include<iostream>
using namespace std;
int main()
{//opening main
    int n,c=0;//initialising variables
    cout<<"ENTER NUMBER=";
    cin>>n;//taking input from user
    while(n>0)
    {//opening while loop
        if(n%2==1)
        {//opening if loop
            c++;//counting number of bits 
        }//closing if loop
        n=n/2;
    }//closing while loop
     cout<<"NUMBER OF SET BITS="<<c<<endl;//printing result
     return 0;
}//closing main