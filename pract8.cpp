#include <iostream>
using namespace std;

//Compiler version g++ 6.3.0

class Area_of_rectangle
{
  public:
    int length ,width, area;
    
    void input(){
      cout<<"Enter length of rectangle: ";
      cin>>length;
      cout<<"Enter width of rectangle: ";
      cin>>width;
      }
   
    void findArea(){
     area=length*width;
   }
    void display(){
      cout<<"Area of rectangle: "<<area;
    }
};
int main(){
  Area_of_rectangle obj;
  obj.input();
  obj.findArea();
  obj.display();
  return 0;
}