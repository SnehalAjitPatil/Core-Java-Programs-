package MapAPI;

import java.util.Objects;

public class Employee {
	private int Id;
	private String Name;
	private int Salary;
	public Employee() {
		super();
	}
	public Employee(int id, String name, int salary) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id, Name, Salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Id == other.Id && Objects.equals(Name, other.Name) && Salary == other.Salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
}
