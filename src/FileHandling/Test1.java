package FileHandling;

import java.io.File;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Food Order");
		String location="E:/FoodOrder";
		File food=new File(location);
		float price=250.50f;
		String foods="Pizza";
		System.out.println("Orer="+foods);
		try {
			boolean b=food.createNewFile();
			System.out.println("Able to order Pizza");
		} catch (IOException e) {
			 
			System.out.println("Not Able to order Pizza");
		}
		 
			
		
		 
		
		
	}

}
