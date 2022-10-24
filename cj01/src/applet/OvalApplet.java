package applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.color.*;
 import java.applet.*;

public class OvalApplet extends Applet
  {
     private Color color=Color.black;
     
	public void paint(Graphics g)
	 { 
	 	
	 	g.setColor(color);
	 	g.fillOval(100,100,100,100);
	 }	 

	

	
	public void setColor123(Color color) {
		this.color = color;
	}
	
	
	
	
}
