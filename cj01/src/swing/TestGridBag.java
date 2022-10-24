

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGridBag extends JFrame {
 
	Font font;
	JButton buttonJava,buttonServlet,buttonSpring,buttonHibernate;
	GridBagConstraints constraints;
	
	public TestGridBag() {
	
		 font=new Font("Times New Roman",Font.BOLD,20);
		 
		 buttonJava=new JButton("JAVA");
		 buttonServlet=new JButton("SERVLET");
		 buttonSpring=new JButton("SPRING");
		 buttonHibernate=new JButton("HIBERNATE");
		 
		 buttonJava.setFont(font);
		 buttonServlet.setFont(font);
		 buttonSpring.setFont(font);
		 buttonHibernate.setFont(font);
		 
		 GridBagLayout layout=new GridBagLayout();
		 constraints=new GridBagConstraints();
		 setLayout(layout);
		 
		 constraints.gridwidth=3;
		 constraints.gridheight=5;
		 constraints.gridx=1;
		 constraints.gridy=2;
		 constraints.weightx=0.3;
		 constraints.weighty=0.3;
		 
		 add(buttonJava,constraints);
		 
		 constraints.gridwidth=3;
		 constraints.gridheight=5;
		 constraints.gridx=5;
		 constraints.gridy=2;
		 
		 add(buttonServlet,constraints);
		 
		 constraints.gridwidth=4;
		 constraints.gridheight=5;
		 constraints.gridx=8;
		 constraints.gridy=2;
		
		 
		 add(buttonSpring,constraints);
	
		 constraints.gridwidth=4;
		 constraints.gridheight=5;
		 constraints.gridx=5;
		 constraints.gridy=8;
		
		 
		 add(buttonHibernate,constraints);
	}
	
	
	public static void main(String[] args) {
		TestGridBag bag=new TestGridBag();
		bag.setTitle("Test Grid Bag....");
		bag.setSize(600,600);
		bag.setResizable(false);
		bag.setVisible(true);

	}

}
