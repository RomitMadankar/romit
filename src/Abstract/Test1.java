package Abstract;

abstract class Demo1
{
	abstract void display();
}
class Demo2 extends Demo1
{
	void display()
	{
		System.out.println("providing implementation for display method...");
	}
}
class  Test1
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Demo2 d1=new Demo2();
		d1.display();
		System.out.println("end of java code");
	}
}
