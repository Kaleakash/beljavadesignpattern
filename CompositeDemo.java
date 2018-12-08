import java.util.*;

class Employee
{
	String name;
	int salary;
	String dept;
	
	List<Employee> subordinates;
	
	public Employee(String nm, String dep, int sal)
	{
		name = nm;
		dept = dep;
		salary = sal;
		subordinates = new ArrayList<Employee>();
	}
	public void add(Employee emp)
	{
		subordinates.add(emp);
	}
	public void remove(Employee emp)
	{
		subordinates.remove(emp);
	}
	public List<Employee> getSubordinates()
	{
		return subordinates;
	}
	public void getSubordinateDetails()
	{
		List list = getSubordinates();
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public String toString()
	{
	System.out.println("Emp details : "+name+", "+dept+", "+salary);
		return "";
	}
}
public class CompositeDemo
{
	public static void main(String args[])
	{
Employee CEO = new Employee("Allen", "CEO", 250000);

Employee mgr1 = new Employee("Mahendra", "Sales Manager", 70000);
Employee mgr2 = new Employee("Mahesh", "Program Manager", 90000);

Employee prg1 = new Employee("Puneet", "Programmer", 20000);
Employee prg2 = new Employee("Prakash", "Developer", 40000);

Employee sl1 = new Employee("Suraj", "Marketing Executive", 20000);
Employee sl2 = new Employee("Sunil", "Asst. Sales Executive", 25000);
Employee sl3 = new Employee("Subhash", "Sales Executive", 32000);

		mgr1.add(prg1);
		mgr1.add(prg2);

		mgr2.add(sl1);
		mgr2.add(sl2);
		mgr2.add(sl3);

		CEO.add(mgr1);
		CEO.add(mgr2);

		mgr1.getSubordinateDetails();
	}
}