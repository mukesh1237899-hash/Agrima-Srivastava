#include<iostream>
using namespace std;
int main()
{//opening main
    cout<<"PRINTING CHARACTER TRIANGLE"<<endl;
    for(int i=65;i<=69;i++)
    {//OPENING FOR LOOP
        for(int j=65;j<=i;j++)
        {//opening for loop
            cout<<(char)j;
        }//closing for loop
        cout<<endl;
    }//CLOSING FOR LOOP
    return 0;
}//closing main