package E12;

public class MarketingExecutive extends Employee {
	double klmt;
	double ta = 5; //ta=5rs  par kl/m
	double Tel_a = 1500;
	double tta;
	
	MarketingExecutive(int id,String name,double bsalary,MyDate bt,double kt){
		super(id,name,bsalary,bt);
		this.klmt =kt;
		tta = klmt*ta;
		
	}
	void calculate(){
			
	}
		
	public String toString(){
		return "Manager ID :"+id+"\n"+
			"Manager Name : "+ name+"\n"+
			"Basic Salary :"+basic_salary+"\n"+
			"Total travelled Allowance :"+tta+"\n"+
			"travelled Allowance :"+ta+"\n"+
			"Telephone Allowance :Tel_a "+
			"\nDate of Barth :"+barthdate;
	}

}
