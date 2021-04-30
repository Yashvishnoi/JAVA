import java.sql.*;

public class Insert_Table_In_sql {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Yash@123");
			
			stmt = con.createStatement();
			// create a query
			String g  = "Insert into table1"+"Values(1001,'Amar')";
			stmt.executeUpdate(g);
			System.out.println("Inserted Successfully...");
			
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
