package FileHandling;

import java.io.*;
public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {
		
		/* File Writing using PrintWriter */
		
		PrintWriter pr=new PrintWriter("C:\\Users\\Divyesh\\eclipse-workspace\\CMTechno\\src\\FileHandling\\cm.txt");
		pr.println("Divyesh");
		pr.print("Pithadiya");
		pr.println(" "+true);
		pr.print(45);
		pr.flush();
	}
	
}
