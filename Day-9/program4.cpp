#include<iostream>
using namespace std;
int main()
{//opening main
    int s=5;
    cout<<"PRINTING HOLLOW SQUARE PATTERN"<<endl;
    for(int i=0;i<s;i++)
    {// OPENING FOR LOOP
        for(int j=0;j<s;j++)
        {//opening for loop
            if(i==0||i==s-1||j==0||j==s-1)
            cout<<"*";
            else
            cout<<" ";
        }//closing for loop
        cout<<endl;
    }//CLOSING FOR LOOP
    return 0;
}//closing main