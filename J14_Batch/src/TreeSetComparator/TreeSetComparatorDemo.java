package TreeSetComparator;

import java.util.TreeSet;

//import TreeSetComparator.Employee;

public class TreeSetComparatorDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee(10,"Snehal",600000);
		Employee emp2=new Employee(20,"Aarti",900000);
		Employee emp3=new Employee(30,"Sunita",800000);
		Employee emp4=new Employee(40,"Ajit",700000);
		
		TreesetEmpidAsComparator tsc=new TreesetEmpidAsComparator();
		
		TreeSet ts=new TreeSet(tsc);
		ts.add(emp2);
		ts.add(emp4);
		ts.add(emp1);
		ts.add(emp3);
		
		System.out.println(ts);
	}

}
