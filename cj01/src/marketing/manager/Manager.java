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
public class Manager extends Employee {
	double fa;
	double oa;
	double pa;
	 
	
	Manager(int id,String name,double bsalary,double med,MyDate bt,double fa,double ta){
		super(id,name,bsalary,med,bt);
		this.fa = fa;
		this.oa = oa;
		this.pa = pa;
	}
	void cal(){
		pa  = basic_salary*0.5;
		pf = basic_salary*.12;
		gross_salary = basic_salary+hra+medical;
		net_salary = gross_salary+(pf+pt);
	}
		
	public String toString(){
		return "Manager ID :"+id+"\n"+"Manager Name : "+ name+"\n"+"Basic Salary :"+basic_salary+
		"\n"+"HRA :"+hra+"\n"+"Medical :"+medical+"\n"+"PF :"+pf+"\n"+"PT :"+pt+"\n"+
		"Gross Salary :"+gross_salary+"\n"+"Net Salary :"+net_salary+"\n"+"Date of Barth :"+barthdate;
	}

}
