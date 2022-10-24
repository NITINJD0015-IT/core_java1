
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;


public class SplitDemo extends JFrame 
{

	JButton b1,b2,b3,b4,b5;
	JPanel p1,p2,p3;
	JSplitPane jsp;
	
	public SplitDemo() {
	        b1=new JButton("Core Java");
	        b2=new JButton("WCD");
	        b3=new JButton("Spring");
	        b4=new JButton("Hibernate");
	        b5=new JButton("Struts");
	        
	        p1=new JPanel();
	        p2=new JPanel();
	        p3=new JPanel();
	        p1.add(b1);
	        p1.add(b2);
	        
	        p2.add(b3);
	        p2.add(b4);
	        
	        p3.add(b5);
	        jsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT, p1, p2);
	        
	       
	        jsp.setDividerSize(10);
	        
	        add(jsp);
	        setSize(600,600);
	        setVisible(true);
	        setLayout(new FlowLayout());
	        
	        FrameHAndler h=new FrameHAndler(this);
	        this.addMouseListener(h);
	        
	        
	}
	
	public static void main(String[] args) {
		new SplitDemo();
	}

	
}
