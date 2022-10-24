

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestDialog extends JFrame 
{
        JButton clk;
        
        public TestDialog() {
		
        	clk=new JButton("Show");
        	add(clk);
        	clk.setToolTipText("Click button");
        	
        	//Handler h=new Handler(this);
        	//clk.addActionListener(h);
        	setLayout(new FlowLayout());
        	setVisible(true);
        	setSize(300,300);
		}
        
        public static void main(String[] args) {
			new TestDialog();
		}
}
