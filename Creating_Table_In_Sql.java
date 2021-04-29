import java.sql.*;

public class Creating_Table_In_Sql {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Yash@123");
			
			// Create a query
			String g="create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
			
			// Create a Statement
			Statement stmt = con.createStatement();
			stmt.executeUpdate(g);
			System.out.println("table created in Database....");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
