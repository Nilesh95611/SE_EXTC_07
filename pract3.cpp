#include <iostream>
using namespace std;

//Compiler version g++ 6.3.0

int main()
{
   int num1=5,num2=10;
   cout <<"Before swap num1="<<num1<<"num2="<<num2<<endl;
   num1=num1+num2;
   num2=num1-num2;
   num1=num1-num2;
   cout<<"After swap num1="<<num1<<"num2="<<num2<<endl;
   return 0;
}
    