package Networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		ServerSocket s=new ServerSocket(5000); // 5000 indicates port
		Socket serverSocket=s.accept();
		DataInputStream d=new DataInputStream(serverSocket.getInputStream());
		System.out.println(d.readUTF());
		d.close();
		serverSocket.close();
	}

}
