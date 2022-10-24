

import java.util.HashSet;
import java.util.Set;

public class Employee implements Comparable
{
	
	 private String name;
	 private double salary;
	 private int id;
	 HashSet<String> skillsets;
	
	 Employee()
	{
		HashSet<String> m1= new HashSet<String>();
		m1.add("CoreJ");
		name="Hitesh";
		salary=50000;
		id =100;
		skillsets=m1;
		
		}
	 Employee(double salary,   String name,int id ,HashSet<String>skillsets)
	{	
		this.salary = salary;
		this.id = id;
		this.name =name;
		this.skillsets=skillsets;
	}
	public String  toString()
	{
		return "\nsalary "+salary+"\tid "+id+"\tname "+name+"\tSkillsets "+skillsets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	
	
	public int compareTo(Object m) 
	{
		// TODO Auto-generated method stub
		Employee t2=(Employee)m;
		
		String a,b;
		a= this.getName();
		b= t2.getName();
		
		 return a.compareToIgnoreCase(b);
		
		
	}
	}
	
	


