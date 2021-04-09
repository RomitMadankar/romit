package Polymorphism;

class Square
{
 void shape()
 {
	 System.out.println("Shape is Square");
 }
}
class Rectangle extends Square
{
 
 void shape()
 {
	 super.shape();
	 System.out.println("Shape is Rectangle");
 }
}
class Triangle extends Square
{
 void shape()
 {
 
	 System.out.println("Shape is Triangle");
 }
}

 class Test1
 {
	 public static void main(String[] args) {
		 Square S;
		 S=new Rectangle();
		 S.shape();
		 S=new Triangle();
		 S.shape();
		  
	}
 }