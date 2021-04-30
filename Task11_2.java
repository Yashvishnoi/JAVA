import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task11_2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Yash@123");
			Statement stmt = con.createStatement();
			stmt = con.createStatement();
            String sql = "UPDATE Employee set EAllowance = EAllowance+ (EAllowance*0.1);";
            stmt.executeUpdate(sql);
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
