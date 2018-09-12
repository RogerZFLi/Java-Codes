package test.JDBC;

import java.sql.*;

import oracle.jdbc.driver.OracleDriver;

public class TestDML{
	
	public static void main(String[] args) {
		new OracleDriver();
		
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Roger", "Sunny521");
			System.out.println("database has been connected");
			stmt = conn.createStatement();
			String sql = "create table employee3 (id int not null,name varchar(20) not null,primary key (id))";
			stmt.executeQuery(sql);
			
			System.out.println("table has been created");
			
		} catch (SQLException e) {
			e.printStackTrace();//LOG4J is better
		}finally {
			try {
				if (stmt != null) {
					stmt.close();
					stmt=null;
				}
				if (conn != null) {
					conn.close();
					conn=null;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
