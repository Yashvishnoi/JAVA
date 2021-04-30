import java.sql.*;
import java.io.*;

public class Task11_1{

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Yash@123");
			
			// create a query
			String g  = "insert into Employee(EId ,EName, ESalary, EPhone, EAllowance) values( ?, ?, ?, ?, ?)";
			 
			// get the PreparedStatement object
			PreparedStatement ptsmt = con.prepareStatement(g);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter ID :");
			String id= br.readLine();
			
			System.out.println("Enter Name:");
			String Name = br.readLine();
			
			System.out.println("Enter Salary:");
			String salary = br.readLine();
			
			System.out.println("Enter Phone:");
			String phone = br.readLine();
			
			System.out.println("Enter Allowance:");
			String Allowance = br.readLine();
			//set the values
			ptsmt.setInt(1,Integer.parseInt(id));
			
			ptsmt.setString(2,Name );
			ptsmt.setInt(3,Integer.parseInt(salary));
			ptsmt.setInt(4,Integer.parseInt(phone));
			ptsmt.setInt(5,Integer.parseInt(Allowance));
			
			ptsmt.executeUpdate();
			System.out.println("Inserted Successfully...");
		
			
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
