#include<iostream>
#include<string>//since string is used hence this line is important
using namespace std;
int main()
{//opening main
    int d,r;//initialising variables
    string binaryr="";
    cout<<"ENTER POSITIVE DECIMAL NUMBER";
    cin>>d;//taking input from user
    if(d==0)
    {//opening if loop
        cout<<"Binary value=0"<<endl;
        return 0;
    }//closing if loop
    while(d>0)
    {//opening while loop
    r=d%2;
    binaryr=to_string(r)+binaryr;
    d=d/2;
    }//closing while loop
    cout<<"BINARY VALUE="<<binaryr<<endl;//printing binary value of decimal value
    return 0;
}//closing main