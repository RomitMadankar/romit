package Polymorphism;

class WatsAppV1
{
	String colour="pink";
	void readMessage()
	{
		String colour="white";
		System.out.println(colour+" double ticks");
	}
}
class WatsAppV2 extends WatsAppV1
{
	void readMessage()
	{
		super.readMessage();
		String colour=super.colour;
		System.out.println(colour+" double ticks");
	}
}
class  Demo1
{
	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		WatsAppV1 v1=new WatsAppV2();
		v1.readMessage();
		System.out.println("end of java code");
	}
}
