#include<iostream>
using namespace std;
int main()
{//opening main
    int n;//initialising variables
    cout<<"ENTER NUMBER";
    cin>>n;//input number from keyboard
    for(int i =1;i<=n;i++)
    {//opening for loop
        if(n%i==0)
        cout<<i<<"\n";//printing factors of number
    }//closing for loop
    return 0;
}//closing main