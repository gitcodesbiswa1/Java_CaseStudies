package com.cs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDMLUpdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdata","root","Nte#25");
		Statement st= con.createStatement();
		String s="Update emp set ename='TRAVIS' where ename='SCOTT';";
		st.execute(s);
		System.out.println("Statement executed, Table updated succesfully");
		con.close();
	}
}
