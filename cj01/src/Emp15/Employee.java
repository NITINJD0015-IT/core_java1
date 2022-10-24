package E15;

public class Employee implements Printable{
	int id;
	String name ;
	double basic_salary;
	double hra;

	Employee(int id,String name,double bsalary){

		this.id=id; 
		this.name= name;
		this.basic_salary =bsalary ;
	}

	public void print(){
		System.out.println("Employ ID :"+id);
		System.out.println("Employ Name : "+ name);
		System.out.println("Basic Salary :"+basic_salary);
	}




}
