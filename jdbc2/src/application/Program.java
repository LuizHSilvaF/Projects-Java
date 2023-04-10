package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement pt = null;
		
		try {
			conn = DB.getConnection();
			/*pt = conn.prepareStatement
					("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?,?,?,?,?)");
			
			pt.setString(1, "Luiz");
			pt.setString(2, "luiz@gmail.com");
			pt.setDate(3, new java.sql.Date(sdf.parse("02/03/2005").getTime()));
			pt.setDouble(4, 3000.0);
			pt.setInt(5, 2);
			*/
			pt = conn.prepareStatement(
							"insert into department (Name) values ('D1'),('D2')", 
						Statement.RETURN_GENERATED_KEYS);
			
			int rowsAffected = pt.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet rs = pt.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id: "+id);
				}
			}
			else {
				System.out.println("No rows Affected!");
			}
			
			//System.out.println("Done! Rows Affected: "+rowsAffected);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		/*catch(ParseException e) {
			e.printStackTrace();
		}*/
		
		finally{
			DB.closeStatement(pt);
			DB.closeConnection();
		}

	}

}
