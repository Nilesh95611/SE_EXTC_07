#include<iostream>
#include<conio.h>
using namespace std;
class Person 
{
  public:
    string name;
    int age;
    void data()
    {
     cout<<"enter your name and age ";
     cin>>name>>age;
     cout<<name<<" ";
     cout<<age;
    }
    
};
int main()
{
  Person obj;
  obj.data();
}


