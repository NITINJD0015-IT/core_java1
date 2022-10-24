package E12;

public class Manager extends Employee {
	double pa;
	double fa;
	double oa;
	
	 
	
	Manager(int id,String name,double bsalary,MyDate bt,double pa,double fa,double oa){
		super(id,name,bsalary,bt);
		this.pa = pa;
		this.fa = fa;
		this.oa = oa;
		
	}
	void calculate(){
		pa = basic_salary*0.08;
		fa = basic_salary*.13;
		oa = basic_salary*.03; 
		hra = basic_salary*0.5;
		
	}
		
	public String toString(){
		return "Manager ID :"+id+"\n"+"Manager Name : "+ name+"\n"+"Basic Salary :"+basic_salary+
		"\n"+"HRA :"+hra+"\n"+"Date of Barth :"+barthdate;
	}

}
