import java.util.*;
import java.io.*;
public class MethodOverloadingDemo {
 public void area(int x){
	 System.out.println("area of square = "+(x*x));
 }
public void area(int x, int y){
	System.out.println("area of ractangle = "+(x*y));
}

public static void main(String args[]){
	MethodOverloadingDemo obj = new MethodOverloadingDemo();
	obj.area(10);
	obj.area(10,20);
	
}
}

