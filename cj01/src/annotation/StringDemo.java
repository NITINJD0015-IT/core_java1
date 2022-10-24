package annotation;

public class StringDemo
{
		public static void main(String[] args)
		{
			String s="abc";
			String s1=new String("abc");
		    
			System.out.println("s equals s1:"+s.equals(s1));
			if(s==s1)
				System.out.println("same");
			else
				System.out.println("difft");
		}
}

