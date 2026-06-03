<<<<<<< HEAD
#include <iostream>
using namespace std;
int main()
{//opening main
    int n,num;//initialising variables
    cout << "Enter starting number: ";
    cin >> n;
    cout << "Enter ending number: ";
    cin >> num;
    for (int i=n;i<=num; i++)
    {//opening for loop
        int temp =i;
        int sum = 0, d;
        while (temp > 0)
        {//opening while loop
            d = temp % 10;
            sum = sum + (d*d*d);
            temp = temp / 10;
        }//closing while loop
        if (sum ==i)
        {//opening if loop
            cout << i << " ";
        }//closing if loop
    }//closing for loop
    return 0;
}//closing main loop
=======
#include<iostream>
using namespace std;
int main()
{//opening main
    int n,c=0,num,d,sum=0,p=1,no,e;//initialising variables
        cout<<"ENTER NUMBER FROM WHERE RANGE IS TO START AND END";
    cin>>n>>e;//taking input from keyboard
    for(int j=n;j<=e;j++)
    {//OPENING FOR LOOP
        sum=0;
        c=0;
    num=j;
    no=j;
    int temp=j;
    while(temp!=0)
    {//opening while loop
        temp=temp/10;
        c++;//calculating number of digits
    }//closing while loop
    while(num!=0)
    {//opening while loop
        d=num%10;
        for(int i=1;i<=c;i++)
        {//opening for loop
            p=p*d;
        }//closing for loop
        sum=sum+p;
        num=num/10;
        p=1;
    }//closing while loop
if(no==sum)//CHECKING WHETHER INPUT NUMBER IS ARMSTRONG OR NOT
{
cout<<no<<" \n";
}
    }//CLOSING FOR LOOP
return 0;
}//closing main
>>>>>>> 19237b1 (update files)
