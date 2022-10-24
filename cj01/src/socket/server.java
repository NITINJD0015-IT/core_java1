package socket;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class server extends JFrame implements ActionListener
{
	JButton btn1;
	JTextArea txtarea;
	JTextField textfield;
	
	ServerSocket ss;
	DataInputStream dis;
	DataOutputStream dos;
	Socket s;
	
	String str,str1;
	
	public server() 
	{
		Handler h = new Handler();
		
		btn1=new JButton("Send");
		txtarea=new JTextArea(10,10);
		textfield=new JTextField(40);
		
		add(txtarea);
		add(textfield);
		add(btn1);
		
	
		
		btn1.addActionListener(this);
		
		setSize(600,400);
		setResizable(true);
		setVisible(true);
		setLayout(new FlowLayout());
		
		try {
		    ss=new ServerSocket(3000, 1, InetAddress.getLocalHost());
		
		//System.out.println("server started...");
	}
    catch (IOException e) {
		
		e.printStackTrace();
	}
		
	try {
	
		s=ss.accept();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}	
	
	try {
		   dis=new DataInputStream(s.getInputStream());
		   dos=new DataOutputStream(s.getOutputStream());
		   
		   
		   
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		while(true)
		{
		str1=dis.readUTF();
		 txtarea.setText(str1);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}
	
	public static void main(String[] args) 
	{
		new server();
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==btn1)
		{
				
		 str=textfield.getText();
		
		
			try 
			{
				dos.writeUTF(str);
			} 
			catch (IOException e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
		
	}
}
