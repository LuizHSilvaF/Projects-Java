package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement ps = null;
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			ps = conn.createStatement();
			
			int rows1 = ps.executeUpdate("Update seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			/*int x = 1;
			if(x < 2) {
				throw new SQLException("Fake Error");
			}*/
		
			int rows2 = ps.executeUpdate("Update seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit();
			
			System.out.println("rows1 = "+rows1);
			System.out.println("rows2 = "+rows2);
		}
		catch(SQLException e) {
			try {
				conn.rollback();
				throw new DbException ("Transaction rolled back! Caused by "+e.getMessage());
			} catch (SQLException e1) {
				
				throw new DbException ("Error trying to rollback! Caused by "+e1.getMessage());
			}
		}
		finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
	}

}
