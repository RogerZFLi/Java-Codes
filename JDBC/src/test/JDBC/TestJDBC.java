package test.JDBC;

import java.sql.*;

import oracle.jdbc.driver.OracleDriver;

public class TestJDBC {
	
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
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Roger", "Sunny521");
			System.out.println("database has been connected");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.print(rs.getString("employeeid")+"\t"); 
				System.out.print(rs.getString("email")+"\t"); 
				System.out.println(rs.getString("phone")); 
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();//LOG4J is better
		}finally {
			try {
				if (rs != null)
					rs.close();
					rs=null;
				if (stmt != null)
					stmt.close();
					stmt=null;
				if (conn != null)
					conn.close();
					conn=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
