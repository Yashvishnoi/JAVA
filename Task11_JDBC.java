import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task11_JDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Yash@123");
			
			// Create a query
			String g="create table Employee(EId int(20) primary key , EName varchar(200) not null, ESalary int(20), EPhone int(12), EAllowance int(10))";
			
			// Create a Statement
			Statement stmt = con.createStatement();
			stmt.execute(g);
			
			System.out.println("table created in Database....");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
