package Polymorphism;

class Bike{  
	  void run(){System.out.println("running");}  
	}  
	class Test0 extends Bike{ 
		 
	  void run(){System.out.println("running safely with 60km");}  
	  
	  public static void main(String args[]){ 
		
	    Bike b = new Test0();//upcasting  
	    b.run();  
	  }  
	} 