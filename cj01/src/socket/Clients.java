package socket;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Clients extends JFrame implements ActionListener {
	
	JButton btnsend;
	JTextField txtfld;
	JTextArea txtarea;
	
	Socket s;

	DataInputStream dis;
	DataOutputStream dos;
	
	String str,str1;
	
	public Clients() {
		
		
	txtfld=new JTextField (40);
	btnsend=new JButton("Send");
	txtarea=new JTextArea(10,10);
		
	btnsend.addActionListener(this);
		
	add(txtfld);
	add(btnsend);
	add(txtarea);
	
	setVisible(true);
	setSize(600,400);
	setLayout(new FlowLayout());
	setResizable(true);
	
			
	try {
		s=new Socket("192.168.1.33",3000);
		
		dis=new DataInputStream(s.getInputStream());
		
		dos=new DataOutputStream(s.getOutputStream());
		
		while(true)
		{
		str=dis.readUTF();
		
		txtarea.setText(str);
		}
		
	} catch ( IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	

	
	
}

public static void main(String[] args)
{
	
	new Clients();
	
}

@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==btnsend)
	{
		str1=txtfld.getText();
		
		try {
			dos.writeUTF(str1);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	

	
		
	}

}
