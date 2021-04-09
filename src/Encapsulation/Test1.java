package Encapsulation;
//package com.javatpoint;  
public class Sumit{  
//private data member  
private String name;  
//getter method for name  
public String getName(){  
return name;  
}  
//setter method for name  
public void setName(String name){  
this.name=name  ;
}  
}  
		

public class Test1 {

	public static void main(String[] args) {
		Sumit S=new Sumit();
		S.setName("Romit");
		System.out.println(S.getName());
		 

	}

}
