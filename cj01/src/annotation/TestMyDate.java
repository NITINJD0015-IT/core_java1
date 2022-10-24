package annotation;

public class TestMyDate {

	
	public static void main(String[] args)
	{
	       MyDate d1=new MyDate(11,8,2015);
	       MyDate d2=new MyDate(11,8,2015);
	       
	       if(d1.equals(d2))
	    	   System.out.println("same");
	       else
	    	   System.out.println("difft");
	}

}
