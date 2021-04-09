package Inheritance;
//Hirerachial Inheritance
class Parant1
{
	  void fun()
 {
	 System.out.println("Fun is possible");
 }
}
class Parant2 extends Parant1
{
	  void fast()
 {
	 System.out.println("Fun is fast  ");
 }
}
class Parant3 extends Parant1
{
	  void slow()
 {
		 
	 System.out.println("Fun is  slow  ");
 }
}
class Fun 
{
 
	public static void main(String[] args)
	{
		Parant3 f=new Parant3();
		f.fun();
		f.slow();
		 
		
		
	}

}

