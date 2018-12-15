package com;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSource {
	Connection con;
	BasicDataSource dbs = new BasicDataSource();
	public DataSource() {
		// TODO Auto-generated constructor stub
		dbs.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dbs.setUrl("jdbc:oracle:thin:@localhost:1521/XE");
		dbs.setUsername("system");
		dbs.setPassword("tiger");
	}
	public Connection createConnection() {
		try{
		con = dbs.getConnection();
		}catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
}
