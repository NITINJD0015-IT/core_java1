package applet;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
 

public class SelectApplet extends Applet implements ActionListener
  {

     private Button r,g,b;
     private OvalApplet ovalApp;
     private AppletContext ctx;
     
	public  SelectApplet()
	{
		r=new Button("RED");
		g=new Button("GREEN");
		b=new Button("BLUE");
		
		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
		
		add(r);
		add(g);
		add(b);
		
	}
	
  public void actionPerformed(ActionEvent ae)
  {
  	  ctx=getAppletContext();
  	 ovalApp= (OvalApplet)ctx.getApplet("OAPP");
  	 
  	 if(ae.getActionCommand().equals("RED"))
  	  
  	  	 ovalApp.setColor123(Color.red);
  	  	 
  	  
  	  
  	 if(ae.getActionCommand().equals("GREEN"))
  	  
  	  ovalApp.setColor123(Color.green);
  	  
  	  
  	 if(ae.getActionCommand().equals("BLUE")) 	
  	 
  	 	 ovalApp.setColor123(Color.blue);
  	 	 
  	 
  	ovalApp.repaint();
  }
  	 		 
 
   	 
				
}
