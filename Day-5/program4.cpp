#include<iostream>
using namespace std;
int main()
{//opening main
    int n,c=0,d=0;//initialising variables
    cout<<"ENTER NUMBER";
    cin>>n;//input number from keyboard
    for(int i =1;i<n;i++)
    {//opening for loop
        if(n%i==0)
        {
        c++;
        }
    }//closing for loop
    for(int j=1;j<n;j++)
    {//opening for loop
        if(n%j==0)
        {//opening if loop
            d++;
            if(d==c)
            cout<<"LARGEST PRIME FACTOR"<<j;
            else
            continue; 
        }//closing if loop
    }//closing for loop
    return 0;
}//closing main