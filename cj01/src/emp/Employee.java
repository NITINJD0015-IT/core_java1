package emp;

import java.util.*;

public class Employee{
	int id;
	String name ;
	double basic_salary;
	double hra;
	Set skillset;

	Employee(int id,String name,double bsalary, String ...skills){

		this.id=id; 
		this.name= name;
		this.basic_salary =bsalary ;
		skillset = new HashSet();
		
		for(int i=0; i < skills.length; i++){
			skillset.add(skills[i]);
		}
		
		
		//System.out.println(skillset);
	}

//	public void print(){
//		System.out.println("Employ ID :"+id);
//		System.out.println("Employ Name : "+ name);
//		System.out.println("Basic Salary :"+basic_salary);
//	}

	public double getBasic_salary() {
		return basic_salary;
	}

	public void setBasic_salary(double basic_salary) {
		this.basic_salary = basic_salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basic_salary="
				+ basic_salary + ", hra=" + hra + ", skillset=" + skillset
				+ "]";
	}




}
