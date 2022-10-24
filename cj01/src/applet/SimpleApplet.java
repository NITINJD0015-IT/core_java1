package applet;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;


public class SimpleApplet extends JApplet
{
	int s;
	String font;
	
       @Override
    public void start() 
       {
            System.out.println("Start...");
       }
       @Override
    public void stop() {
    	   System.out.println("Stop...");
       }
       
       @Override
    public void init() 
       {
    	   System.out.println("init...");
    	   font=getParameter("fontname");
    	   s=Integer.parseInt(getParameter("size"));
    	  
    	   
       }

       @Override
    public void destroy() {
    	   System.out.println("destroy...");
       }
      
     @Override
    public void paint(Graphics g) 
     {
       	super.paint(g);
       	System.out.println("paint....");
       	
       	Font f=new Font(font, Font.BOLD,s);
       	g.setFont(f);
       	g.drawString("Hello", 50, 50);
    }

}
