package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try 
		{
			Socket s = new Socket(InetAddress.getLocalHost(),400);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("connected........");
			dos.close();
			s.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
