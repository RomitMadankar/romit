package Abstract;

abstract class Bike
{
 abstract void run();
 
}
class Vehicle extends Bike
{
 void run()
 {
	 System.out.println("Bike is running");
 }
}

public class Test2 {
	public static void main(String[] args) {
		System.out.println("Start of java code");
		Vehicle V=new Vehicle();
		V.run();
		System.out.println("End of java code");
		
	}

}
