package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImp implements EmployeeDao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;
	public EmployeeDaoImp() {
		// TODO Auto-generated constructor stub
		ds = new DataSource();
	}
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
			con = ds.createConnection();
			pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setFloat(3, emp.getSalary());
			if(pstmt.executeUpdate()>0) {
				System.out.println("Record stored successfully....");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try{
			pstmt.close();
			con.close();
			}catch(Exception e){
				
			}
		}
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee emp=null;
		try {
			con = ds.createConnection();
			pstmt = con.prepareStatement("select * from employee where srno = ?");
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			if(rs.next()){
				emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try{
				rs.close();
			pstmt.close();
			con.close();
			}catch(Exception e){
				
			}
		}
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
			con = ds.createConnection();
			pstmt = con.prepareStatement("update employee set salary =? where srno=?");
			pstmt.setFloat(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmpId());
			if(pstmt.executeUpdate()>0) {
				System.out.println("Record updated successfully....");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try{
			pstmt.close();
			con.close();
			}catch(Exception e){
				
			}
		}
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		try {
			con = ds.createConnection();
			pstmt = con.prepareStatement("delete from employee where srno=?");
			pstmt.setInt(1, empId);
			if(pstmt.executeUpdate()>0) {
				System.out.println("Record deleted successfully....");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try{
			pstmt.close();
			con.close();
			}catch(Exception e){
				
			}
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		try {
			con = ds.createConnection();
			pstmt = con.prepareStatement("select * from employee");
			rs = pstmt.executeQuery();
			while(rs.next()){
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				list.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try{
			pstmt.close();
			con.close();
			}catch(Exception e){
				
			}
		}
		return list;
	}

}
