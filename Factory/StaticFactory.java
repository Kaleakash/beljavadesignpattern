class Employee {
	public void display() {
		System.out.println("Employee Information are");
	}
	public static Employee getInstance() {
		return new Employee();
	}
}
public class StaticFactory {
   	public static void main(String[] args){
  	Employee emp = Employee.getInstance();
	emp.display();
   	}
}