
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;


public class SpinnerDemo  extends JFrame
{
      SpinnerListModel ls;
      SpinnerNumberModel sp;
      JSpinner js;
      
      public SpinnerDemo()
      {
	        String month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug"};
	        ls=new SpinnerListModel(month);
	        
    	    sp=new SpinnerNumberModel(0,-10,100,5);
    	  
	        js=new JSpinner(ls);
	        add(js);
	        setVisible(true);
	        setSize(200,200);
	        setLayout(new FlowLayout());
    	  
	}
      public static void main(String[] args) {
		 new SpinnerDemo();
	}
      
}
