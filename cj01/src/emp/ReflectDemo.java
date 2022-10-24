package emp;

import java.lang.reflect.*;


public class ReflectDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class c1 = Class.forName("emp.Employee");
		
/*		System.out.println(c1);
		
		System.out.println(c1.getClass().getName());
		
		Class c2 = (Class) Class.forName("emp.Employee").newInstance();
		System.out.println("new instance"+c2);
		
		Class sn = c1.getSuperclass();
		System.out.println("super class"+sn);
		
		Method mth[] = c1.getMethods();*/
		
		Field fd[] = c1.getDeclaredFields();
		for(Field m:fd ){
			
			System.out.println(m);
			
		}
	}
}
