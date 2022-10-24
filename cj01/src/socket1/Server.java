package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
	public static void main(String[] args) {

		ServerSocket ss;
		Socket s;
		DataInputStream dis;
		DataOutputStream dos;
		String str;
		String str1;
		try 
		{
			ss = new ServerSocket(2000,1,InetAddress.getLocalHost());
			System.out.println("waiting for client....");
			s = ss.accept();
			System.out.println("Connected....");
			dis = new DataInputStream(s.getInputStream());
			//dos = new DataOutputStream(s.getOutputStream());
			str = (String)dis.readUTF();
			System.out.println(str);
			
		}
		catch (IOException e)
		{

			e.printStackTrace();
		}

	}


}
