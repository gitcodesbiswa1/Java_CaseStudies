package com.cs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCsqlDML {
	
	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdata","root","Nte#25");
		Statement st= con.createStatement();
		String s= "Insert into emp values (8000,'BISWA','QA',7839,'2024-07-15',1200,800,60);";
		st.execute(s);
		s= "Insert into emp values (8001,'KINGO','DEVELOPER',7839,'2024-07-15',1200,700,50)";
		st.execute(s);
		s="Insert into salgrade values (6,5000,7000);";
		st.execute(s);
		s="Insert into salgrade values(7,6000,12000);";
		st.execute(s);
		s="Insert into dept values(50,'Development','Singapore');";
		st.execute(s);
		s="Insert into dept values(60,'QA','Hyderabad');";
		st.execute(s);
		con.close();
		System.out.println("Statements executed: Inserted successfully");
	}

}
