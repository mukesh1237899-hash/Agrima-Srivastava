#include<iostream>
using namespace std;
int main()
{//opening main
    cout<<"PRINTING REVERSE STAR PATTERN"<<endl;
    for(int i=1;i<=5;i++)
    {//OPENING FOR LOOP
        for(int j=5;j>=i;j--)
        {//opening for loop
            cout<<"* ";
        }//closing for loop
        cout<<endl;
    }//CLOSING FOR LOOP
    return 0;
}//closing main