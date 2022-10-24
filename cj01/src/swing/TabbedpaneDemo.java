

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class TabbedpaneDemo extends JFrame
{
   JTabbedPane tb;
   JLabel l1,l2,l3;
   
   
  public TabbedpaneDemo()
   {
	   tb=new JTabbedPane(JTabbedPane.TOP);
	   l1=new JLabel(new ImageIcon("z:\\break.jpg"));
	   l2=new JLabel(new ImageIcon("z:\\lunch.jpg"));
	   l3=new JLabel(new ImageIcon("z:\\dinner.jpg"));
	   
	   tb.addTab("Break Fast",l1);
	   tb.addTab("Lunch",l2);
	   tb.addTab("Dinner",l3);
	   add(tb);
	   
	   setVisible(true);
	   setSize(300,300);
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new TabbedpaneDemo();
	}

}
