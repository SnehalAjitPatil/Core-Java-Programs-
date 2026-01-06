package MapAPI;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee(1,"Snehal",80000);
		Employee emp2=new Employee(1,"Snehal",80000);
		Employee emp3=new Employee(2,"Aarti",70000);
		Employee emp4=new Employee(3,"Sunita",70000);
		Employee emp5=emp4;
		
		IdentityHashMap<Employee,String> ihm=new IdentityHashMap<>();
		
		ihm.put(emp1, "aaa");
		ihm.put(emp2, "bbb");
		ihm.put(emp3, "ccc");
		ihm.put(emp4, "ddd");
		ihm.put(emp5, "eee");
		
		System.out.println("IdentityHashMap: "+ihm);
	}

}
