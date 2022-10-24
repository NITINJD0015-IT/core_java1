package collection;
import java.util.Comparator;


public class EmpComparator implements Comparator 
{

	@Override
	public int compare(Object arg0, Object arg1) 
	{
		Employee e1=(Employee)arg0;
		Employee e2=(Employee)arg1;
		
		
		if(e1.salary>e2.salary)
			return 1;
		else
			if(e1.salary<e2.salary)
				return -1;
		
		return 0;
	}

}
