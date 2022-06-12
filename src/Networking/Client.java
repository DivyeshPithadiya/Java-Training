package Networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String args[]) throws UnknownHostException, IOException {
		
		Socket clientSocket = new Socket("127.0.0.1",5000);
		DataOutputStream d= new DataOutputStream(clientSocket.getOutputStream());
		d.writeUTF("Hello this is Divyesh");
		d.flush();
		d.close();
		clientSocket.close();
	}

}
