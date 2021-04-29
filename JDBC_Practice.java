import java.sql.*;  
class JDBC_Practice
{  	
	public static void main(String args[]){  
		try{  
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			// Create a connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String psswd = "Yash@123";
			Connection con=DriverManager.getConnection(url,username,psswd);  
			
			if(con.isClosed()) {
				System.out.println("Connection is closed");
			}
			else {
				System.out.println("Connection Created");
			}
				
		}
		catch(Exception e){ 
			System.out.println(e);
		}  
	}  
}