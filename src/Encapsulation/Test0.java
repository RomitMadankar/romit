package Encapsulation;

class A
{
 private int value;
 
 public void setValue(int x)
 {
	 value=x;
	 
 }
 public int getValue()
 {
	 return value;
 }
}


public class Test0 {
	public static void main(String[] args) 
	{
		A r=new A();
		r.setValue(100);
		System.out.println(r.getValue());
	}

}
