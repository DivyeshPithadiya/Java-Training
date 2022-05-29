package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {
	
	public static void hello() throws FileNotFoundException {
		File f=new File("dependencies.txt");
		FileReader fr=new FileReader(f);
	}
	
	public static void main(String args[]) {
		
		try 
		{
			hello();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello");
		
	}

}
