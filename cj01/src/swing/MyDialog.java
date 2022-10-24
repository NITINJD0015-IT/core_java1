

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class MyDialog extends JDialog
{
         JButton yes,no;
         JLabel msg;
         
         public MyDialog(Frame f,String s,boolean modal) {
        	
        	 super(f,s,modal);
        	 msg=new JLabel("Do u want to continue?");
        	 yes=new JButton("Yes");
        	 no=new JButton("No");
        	 
        	 setLayout(new FlowLayout());
        	 add(msg);
        	 add(yes);
        	 add(no);
        	 setVisible(true);
        	 setSize(150,100);
        
		}
}
