class Address implements Cloneable{
	String city;
	String state;
	Address(String city, String state) {
		this.city = city;
		this.state = state;
	}
	public Address getAddressClone() throws Exception{
		Address add = (Address)super.clone();
		return add;
	}
}
class Employee implements Cloneable {
	int id;
	String name;
	Address add;
	Employee(int id, String name, Address add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}	
	public Employee getEmployeeClone() throws Exception{
		Employee emp = (Employee)super.clone();
		emp.add = (Address)add.getAddressClone();
		return emp;
	}
}
class DeepCopy{
	public static void main(String args[]) throws Exception{
	Address add1 = new Address("Bangalore","Kar");
	Employee emp1 = new Employee(100,"Raj",add1);
System.out.println("Id is "+emp1.id+" Name is "+emp1.name+" City "+add1.city+" State "+add1.state);
	Employee emp2 = emp1.getEmployeeClone();
	Address add2 = emp2.add;
	System.out.println("After clone");
System.out.println("Id is "+emp2.id+" Name is "+emp2.name+" City "+add2.city+" State "+add2.state);	
	System.out.println("After done change in emp2 and add2 clone object");
	emp2.id=101;
	emp2.name="Ravi";
	add2.city="Mumbia";
	add2.state="Mh";
	System.out.println("Actual object values");
System.out.println("Id is "+emp1.id+" Name is "+emp1.name+" City "+add1.city+" State "+add1.state);	
	System.out.println("Clone object values");
System.out.println("Id is "+emp2.id+" Name is "+emp2.name+" City "+add2.city+" State "+add2.state);		
	}
}