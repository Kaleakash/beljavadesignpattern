package com;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao empDao = new EmployeeDaoImp();
		Employee emp = new Employee();
		emp.setEmpId(103);
		emp.setEmpName("Seeta");
		emp.setSalary(19000);
		empDao.addEmployee(emp);
	}

}
