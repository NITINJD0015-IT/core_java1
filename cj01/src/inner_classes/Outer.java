package inner_classes;
public class Outer
{
       private int p=10;
       
       class Inner
       {
    	  public int val=20;
    	   
    	    void show()
    	   {
    		   System.out.println("p:"+p);
    		   System.out.println("val:"+val);
    	   }    	   
       }
       
       class Inner1
       {
    	   void show1()
    	   {
    		   Inner in=new Inner();
    		   System.out.println("val:"+in.val); 
    	   }
       }
       
       void display()
       {
    	   System.out.println("p:"+p);
    	   
    	   Inner in=new Inner();
    	   
		   System.out.println("val:"+in.val);
       }
       
       
       public static void main(String[] args) 
       {
		    Outer out=new Outer();
		    Outer.Inner inner=out.new Inner();
		    
		   // Outer.Inner in=new Outer().new Inner();
		    
		    inner.show();
       }
}
