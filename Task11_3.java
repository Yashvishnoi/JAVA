import java.sql.*;
public class Task11_3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Yash@123");
			
		 Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                 ResultSet.CONCUR_UPDATABLE);
		 ResultSet rs = smt.executeQuery( "SELECT * FROM Employee where ESalary>15000" );
    
          while ( rs.next() )
          {
             int EId = rs.getInt(1);
                   String  EName = rs.getString(2);
                   int ESalary = rs.getInt(3);
              int EPhone = rs.getInt(4);
                int EAllowance = rs.getInt(5);
                  
         
              System.out.println( "ID = " + EId );
             System.out.println( "NAME = " + EName );
              System.out.println( "PHONE = " + EPhone );
               System.out.println( "Allowance = " + EAllowance );
              System.out.println( "SALARY = " + ESalary );
             System.out.println();
                }
          rs.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
