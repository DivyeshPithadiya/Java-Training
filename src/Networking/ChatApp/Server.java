package Networking.ChatApp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.*;

public class Server {

	public static void main(String[] args) throws Exception{
		
		ServerSocket s=new ServerSocket(8000);
		Socket so=s.accept();
		
		DataInputStream din=new DataInputStream(so.getInputStream());
		DataOutputStream dou=new DataOutputStream(so.getOutputStream());
				
		Scanner in=new Scanner(System.in);
		String s1="", s2="";
		 
		while( ! (s1.equals("stop")||s2.equals("stop")) ) {
			s1=din.readUTF();
			System.out.println("Client: "+s1);
			s2=in.nextLine();
			dou.writeUTF(s2);
			dou.flush();
		}
		
		din.close();
		dou.close();
		s.close();
		so.close();
	}

}
