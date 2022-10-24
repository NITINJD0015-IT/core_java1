package annotation;


public class Employee implements Comparable
{
	private int eid;
	private String ename;
	
	private double salary;
	
	
	
     public Employee() 
	{
	      eid=100;
	      ename="Nitin";
	      salary=10233.90;
	}

	public Employee(int eid, String ename, double salary)
	{
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
		
	@Deprecated
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary="
				+ salary + "]";
	}

	public int compareTo(Object obj) 
	{
		Employee e=(Employee)obj;
		
		if(this.eid>e.eid)
			return 1;
		else
			if(this.eid<e.eid)
				return -1;
		
		
		return 0;
	}


}
