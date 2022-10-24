package socket1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		Socket s;
		DataOutputStream dos ;
		DataInputStream dis; 
		try {
			s = new Socket(InetAddress.getLocalHost(), 2000);
			System.out.println("request sent....");
			dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("connected");
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
