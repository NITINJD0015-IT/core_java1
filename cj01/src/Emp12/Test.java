package E12;

public class Test {
	public static void main(String[] args){
		//MyDate o = new MyDate();
		//System.out.println(o);
		/*o1.display();
		MyDate o2 = new MyDate(6,7,1990);
		o2.display();*/

//		Employee ee = new Employee();
//		Employee e[] = new Employee[2];
//		e[0]=new Employee(101,"nitin",56000,1000,new MyDate(28,6,1999));
//		e[1]=new Employee(202,"Hitesh",46000,1000,new MyDate(15,8,2015));
//		for(Employee i:e){
//			i.cal();
//			//i.display();
//			//i.grosSalary();
//			//i.netSalary();
//			i.count();
//			System.out.println(i);
//		}
		Employee m = new Manager(301,"hitesh",60000,new MyDate(28,6,1984),2000,1000,500);
		Employee em = new MarketingExecutive(444,"Ali",40000,new MyDate(28,6,1946),250);
		


		//if(m instanceof Manager){
			//m.calculate();
			System.out.println(m);
			System.out.println(em);
		//}

	}
}
