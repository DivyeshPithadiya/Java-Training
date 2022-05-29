package FileHandling;

import java.io.*;

public class BufferedReadAndWrite {
	
	public static void main(String[] args) throws Exception {
		
		FileReader fr=new FileReader("C:\\Users\\Divyesh\\eclipse-workspace\\CMTechno\\src\\FileHandling\\cm.txt");
		
		/* File reader using BufferedReader */
		
		BufferedReader br = new BufferedReader(fr); 
		String data;
		
		while((data=br.readLine())!=null ) {
			System.out.println(data);
		}
		
		/* File Writing using BufferedWriter*/
		
		FileWriter fw=new FileWriter("C:\\Users\\Divyesh\\eclipse-workspace\\CMTechno\\src\\FileHandling\\cm.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Sanjay Pandey");
		bw.flush();
		
		bw.newLine();
		bw.write("Surya Patel");
		bw.flush();
		
		bw.newLine();
		bw.write("Mahek Shah");
		bw.flush();
	}

}
