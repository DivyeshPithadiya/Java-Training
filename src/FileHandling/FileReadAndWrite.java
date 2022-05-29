package FileHandling;

import java.io.*;

public class FileReadAndWrite {

	public static void main(String[] args) throws Exception{
		
		File f=new File("C:\\Users\\Divyesh\\eclipse-workspace\\CMTechno\\src\\FileHandling\\cm.txt");
		
		/* Read data from file using FileReader */
		
		FileReader fr = new FileReader(f);
		int i;
		while( (i=fr.read()) !=-1) {
			char c=(char)i;
			System.out.print(c);
		}
		
		
		/* Writing Data into the file using FileWriter */
		
		FileWriter fw= new FileWriter(f);
		fw.write("Vikas Patel");
		fw.flush();
		
		fw.append(" Student");
		fw.flush();
		
		
	}
	
}
