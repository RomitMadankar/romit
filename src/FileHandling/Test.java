package FileHandling;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		System.out.println("Start of Java Code");
		String location="E:/FileHandling";
		File f=new File(location);
		try {
			if(f.createNewFile())
			{
				System.out.println("File got created");
			}
			else
			{
				System.out.println("File not created");
			}
		} catch (IOException e) {
		 
          System.out.println("IOException is occurs");
		}
	}

}
