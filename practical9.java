import java.util.*;

class prac9{
  static int area;
  float Area(int l,int b){
    return area=l*b;
    }
  float Area(int r){
    return area=r*r;
    }
    void display(){
      System.out.println("Area: " +area);
      }
public static void main(String[] args){
    prac9 obj = new prac9();
    obj.Area(5, 6);
    obj.display();
    obj.Area(7);
    obj.display();
  }
}