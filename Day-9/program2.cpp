#include<iostream>
using namespace std;
int main()
{//opening main
    cout<<"PRINTING REVERSE NUMBER PATTERN"<<endl;
    for(int i=5;i>=1;i--)
    {// OPENING FOR LOOP
        for(int j=1;j<=i;j++)
        {//opening for loop
            cout<<j;
        }//closing for loop
        cout<<endl;
    }//CLOSING FOR LOOP
    return 0;
}//closing main