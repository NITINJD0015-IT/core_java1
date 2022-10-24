
public class Emp {
	static int count = 0;	
	int e_id;
	String e_name = "jj";
	double basic_salary;
	double hra;
	double medical;
	double pf;
	double pt=200;
	double net_salary;
	double gross_salary;

	
	Emp(){
		
		e_id=000; 
		e_name= "xyx";
		basic_salary =25000 ;
		medical=1000;

	}

	Emp(int id,String name,double bsalary,double med){
		count++;
		e_id=id; 
		e_name= name;
		basic_salary =bsalary ;
		medical=med;

	}
	void cal(){
		hra = basic_salary*0.5;
		pf = basic_salary*.12;
		gross_salary = basic_salary+hra+medical;
		net_salary = gross_salary+(pf+pt);
		//pt=200;

	}
	void grosSalary(){
		//System.out.println("Gross Salary "+gross_salary);
	}
	void netSalary(){
		//System.out.println("Net Salary "+net_salary);
	}
	void display(){
		System.out.println("Employ ID "+e_id);
		System.out.println("Employ Name "+ e_name);
		System.out.println("Basic Salary "+basic_salary);
		System.out.println("HRA "+hra);
		System.out.println("Medical "+medical);
		System.out.println("PF "+pf);
		System.out.println("PT "+pt);
		System.out.println("Gross Salary "+gross_salary);
		System.out.println("Net Salary "+net_salary);
		System.out.println("no of employ = "+count);

	}
	public static void main(String[] args){
		Emp a = new Emp();
		a.cal();
		a.display();
		a.grosSalary();
		a.netSalary();
		System.out.println("---------------------------");
		Emp s = new Emp(101,"nitin",35000,1000);
		Emp d = new Emp(102,"sumit",35000,1000);
		Emp f = new Emp(103,"hitesh",35000,1000);
		s.cal();
		s.display();
		s.grosSalary();
		s.netSalary();
		d.cal();
		d.display();
		d.grosSalary();
		d.netSalary();
		f.cal();
		f.display();
		f.grosSalary();
		f.netSalary();
	}
}
