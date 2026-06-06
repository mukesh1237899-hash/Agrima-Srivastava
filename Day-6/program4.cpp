#include<iostream>
using namespace std;
int main()
{//opening main
    int x,n,r=1;//initialising variables
    cout<<"INPUT NUMBER AND POWER OF INPUT NUMBER=";
    cin>>x>>n;//taking inputs
    for(int i=1;i<=n;i++)
    {//opening for loop
        r=x*r;
    }//closing for loop
    cout<<r;//printing results
    return 0;
}//closing main