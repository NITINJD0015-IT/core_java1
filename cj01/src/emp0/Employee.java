package collaction;

public class Employee {
	int id;
	String name ;
	double basic_salary;


	public Employee(int id, String name, double basic_salary) {
		super();
		this.id = id;
		this.name = name;
		this.basic_salary = basic_salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getBasic_salary() {
		return basic_salary;
	}



	public void setBasic_salary(double basic_salary) {
		this.basic_salary = basic_salary;
	}



	public String toString(){
		return "Employ ID :"+id+"\n"+"Employ Name : "+ name+"\n"+"Basic Salary :"+basic_salary;
	}



}
