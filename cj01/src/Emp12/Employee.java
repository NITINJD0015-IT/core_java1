package E12;

public class Employee {
	int id;
	String name ;
	double basic_salary;
	double hra;
	MyDate barthdate;

	Employee(int id,String name,double bsalary,MyDate bt){
		
		this.id=id; 
		this.name= name;
		this.basic_salary =bsalary ;
		barthdate = bt;
	}
	
	void calculat(){
		
	}
	//	void grosSalary(){
	//				System.out.println("Gross Salary "+gross_salary);
	//		}
	//	void netSalary(){
	//				System.out.println("Net Salary "+net_salary);
	//		}
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
