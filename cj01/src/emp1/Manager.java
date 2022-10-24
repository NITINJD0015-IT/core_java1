
public class Manager extends Employee {
	double fa;
	double oa;
	double pa;
	 
	
	Manager(int id,String name,double bsalary,double med,MyDate bt,double pa,double fa,double oa){
		super(id,name,bsalary,med,bt);
		this.pa = pa;
		this.fa = fa;
		this.oa = oa;
		
	}
	void calculate(){
		pa = basic_salary*0.08;
		fa = basic_salary*.13;
		oa = basic_salary*.03; 
		hra = basic_salary*0.5;
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
