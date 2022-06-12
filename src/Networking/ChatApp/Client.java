package Networking.ChatApp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.*;

public class Client {
	
	public static void main(String args[]) throws Exception {
		
		Socket clientSocket = new Socket("localhost",8000);
		
		DataOutputStream dou=new DataOutputStream(clientSocket.getOutputStream());
		DataInputStream din = new DataInputStream(clientSocket.getInputStream());
		
		System.out.println("Start conversation");
		
		Scanner in=new Scanner(System.in);
		String data=in.nextLine();
		dou.writeUTF(data);
		
		String s1="",s2="";
		
		while(! (s1.equals("stop") || s2.equals("stop")) )
		{
			s1=din.readUTF();
			System.out.println("Server : "+s1);
			s2=in.nextLine();
			dou.writeUTF(s2);
			dou.flush();
		}
		
		dou.close();
		clientSocket.close();
		
		
	}

}
