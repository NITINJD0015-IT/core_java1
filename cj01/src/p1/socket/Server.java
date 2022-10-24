package socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	
public static void main(String[] args) {
	String str;
	try 
	{
		ServerSocket ss = new ServerSocket(400);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		str=(String)dis.readUTF();
		System.out.println(str);
		ss.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
