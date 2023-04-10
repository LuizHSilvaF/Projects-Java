package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DB.getConnection();
			ps = conn.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentID = ?)");
			
			ps.setDouble(1, 100.0);
			ps.setInt(2, 3);
			
			int rowsAffected = ps.executeUpdate();
			System.out.println("Done! Rows Affected: "+rowsAffected);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
	}

}
