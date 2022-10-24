/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketing.manager;

/**
 *
 * @author nitin
 */
public class Employee {
    static int count ;	
	int id;
	String name ;
	double basic_salary;
	double hra;
	double medical;
	double pf;
	double pt=200;
	double net_salary;
	double gross_salary;
	MyDate barthdate;

//	Employee(){
//		id=000; 
//		name= "xyx";
//		basic_salary =25000 ;
//		medical=1000;
//		barthdate  = new MyDate();
//	}

	Employee(int id,String name,double bsalary,double med,MyDate bt){
		count++;
		this.id=id; 
		this.name= name;
		this.basic_salary =bsalary ;
		this.medical=med;
		barthdate = bt;
	}
	void count(){
		System.out.println("no of employ = "+count);
		System.out.println("---------------------------");
	}
	void cal(){
		hra = basic_salary*0.5;
		pf = basic_salary*.12;
		gross_salary = basic_salary+hra+medical;
		net_salary = gross_salary+(pf+pt);
	}
//	void grosSalary(){
//		System.out.println("Gross Salary "+gross_salary);
//	}
//	void netSalary(){
//		System.out.println("Net Salary "+net_salary);
//	}
//	void display(){
//		System.out.println("Employ ID :"+id);
//		System.out.println("Employ Name : "+ name);
//		System.out.println("Basic Salary :"+basic_salary);
//		System.out.println("HRA :"+hra);
//		System.out.println("Medical :"+medical);
//		System.out.println("PF :"+pf);
//		System.out.println("PT :"+pt);
//		System.out.println("Gross Salary :"+gross_salary);
//		System.out.println("Net Salary :"+net_salary);
//		System.out.println(barthdate);
//	}
	
	/*public String toString(){
		return "Employ ID :"+id+"\n"+"Employ Name : "+ name+"\n"+"Basic Salary :"+basic_salary+
		"\n"+"HRA :"+hra+"\n"+"Medical :"+medical+"\n"+"PF :"+pf+"\n"+"PT :"+pt+"\n"+
		"Gross Salary :"+gross_salary+"\n"+"Net Salary :"+net_salary+"\n"+barthdate;
	}*/
}
